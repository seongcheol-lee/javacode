package com.hankki.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.hankki.app.model.StoreVO;

@Repository
public class StoreRepository implements IStoreRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	private class StoreMapper implements RowMapper<StoreVO> {
		@Override
		public StoreVO mapRow(ResultSet rs, int count) throws SQLException {
			StoreVO store = new StoreVO();
			store.setStoreId(rs.getInt("store_id"));
			store.setImgStr(rs.getString("img_str"));
			store.setStoreName(rs.getString("name"));
			store.setPosition(rs.getString("position"));
			
			return store;
		}			
	}
	
	@Override
	public int getStoreCount() {
		String sql = "select count(*) from store";
		return jdbcTemplate.queryForObject(sql, Integer.class);
	}

	@Override
	public int getStoreCount(String name) {
		String sql = "select count(*) from store where name=?";
		return jdbcTemplate.queryForObject(sql, Integer.class, name);
	}

	@Override
	public List<StoreVO> getStoreList() {
		String sql = "select * from store";
		return jdbcTemplate.query(sql, new RowMapper<StoreVO>() {
			@Override
			public StoreVO mapRow(ResultSet rs, int count) throws SQLException {
				StoreVO store = new StoreVO();
				store.setStoreId(rs.getInt("store_id"));
				store.setImgStr(rs.getString("img_str"));
				store.setStoreName(rs.getString("name"));
				store.setPosition(rs.getString("position"));
				return store;
			}
		});
	}

	@Override
	public StoreVO getStoreInfo(int storeid) {
		String sql = "select store_id, img_str, name, position "
				+ "from store where store_id=?";		
		return jdbcTemplate.queryForObject(sql, new StoreMapper(), storeid);
	}

	@Override
	public void updateStore(StoreVO store) {
		String sql = "update store "
				+ "set img_str=?, last_name=?, email=?, "
				+ "phone_number=?, hire_date=?, job_id=?, "
				+ "salary=?, commission_pct=?, manager_id=?, "
				+ "department_id=? where employee_id=?";
		jdbcTemplate.update(sql, emp.getFirstName(),
				emp.getLastName(),
				emp.getEmail(),
				emp.getPhoneNumber(),
				emp.getHireDate(),
				emp.getJobId(),
				emp.getSalary(),
				emp.getCommissionPct(),
				emp.getManagerId(),
				emp.getDepartmentId(),
				emp.getEmployeeId() 
		);
	}

	@Override
	public void insertEmp(StoreVO emp) {
		String sql = "insert into employees (employee_id, first_name, "
				+ "last_name, email, phone_number, hire_date, job_id, "
				+ "salary, commission_pct, manager_id, department_id) "
				+ "values (?,?,?,?,?,sysdate,?,?,?,?,?)";
		jdbcTemplate.update(sql, 
				emp.getEmployeeId(), 
				emp.getFirstName(), 
				emp.getLastName(),
				emp.getEmail(),
				emp.getPhoneNumber(),
				emp.getJobId(),
				emp.getSalary(),
				emp.getCommissionPct(),
				emp.getManagerId(),
				emp.getDepartmentId()
		);
	}
	
	@Override
	public void deleteJobHistory(int empid) {
		String sql = "delete from job_history where employee_id=?";
		jdbcTemplate.update(sql, empid);
	}

	@Override
	public void deleteEmp(int empid, String email) {
		String sql = "delete from employees where employee_id=? and email=?";
		jdbcTemplate.update(sql, empid, email);
	}
	
	@Override
	public List<Map<String, Object>> getAllDeptId() {
		String sql = "select department_id as departmentId, "
					+"		department_name as departmentName "
					+"	from departments";
		return jdbcTemplate.queryForList(sql);
	}
	
	@Override
	public List<Map<String, Object>> getAllJobId() {
		String sql = "select job_id as jobId, job_title as title from jobs";
		return jdbcTemplate.queryForList(sql);
	}

	@Override
	public List<Map<String, Object>> getAllManagerId() {
		String sql = "select "
					+ "	d.manager_id as managerId, e.first_name as firstName "
					+ "from departments d join employees e "
					+ " on d.manager_id = e.employee_id "
					+ "order by d.manager_id";
		return jdbcTemplate.queryForList(sql);
	}
}//end class

/*
@Override
public List<Map<Integer, String>> getAllDeptId() {
	String sql = "select department_id, department_name from departments";
	return jdbcTemplate.query(sql, new RowMapper<Map<Integer, String>>() {
		@Override
		public Map<Integer, String> mapRow(ResultSet rs, int count) throws SQLException {
			Map<Integer, String> deptMap = new HashMap<Integer, String>();
			deptMap.put(rs.getInt("department_id"), rs.getString("department_name"));
			return deptMap;
		};
	});
}
*/