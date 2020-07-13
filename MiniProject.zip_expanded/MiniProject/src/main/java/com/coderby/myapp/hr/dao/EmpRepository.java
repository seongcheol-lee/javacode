package com.coderby.myapp.hr.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.coderby.myapp.hr.model.EmpVO;

@Repository
public class EmpRepository implements IEmpRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	private class EmpMapper implements RowMapper<EmpVO> {
		@Override
		public EmpVO mapRow(ResultSet rs, int count) throws SQLException {
			EmpVO emp = new EmpVO();
			
			emp.setMenuId(rs.getInt("ID"));
			emp.setStoreId(rs.getInt("STORE_ID"));
			emp.setMenuName(rs.getString("NAME"));
			emp.setMenuCost(rs.getInt("COST"));
			return emp;
		}			
	}
	
	@Override
	public int getEmpCount() {
		String sql = "select count(*) from menu";
		return jdbcTemplate.queryForObject(sql, Integer.class);
	}

	@Override
	public int getEmpCount(int deptid) {
		String sql = "select count(*) from menu where id=?";
		return jdbcTemplate.queryForObject(sql, Integer.class, deptid);
	}

	@Override
	public List<EmpVO> getEmpList() {
		String sql = "select * from menu";
		return jdbcTemplate.query(sql, new RowMapper<EmpVO>() {
			@Override
			public EmpVO mapRow(ResultSet rs, int count) throws SQLException {
				EmpVO emp = new EmpVO();
				emp.setMenuId(rs.getInt("ID"));
				emp.setStoreId(rs.getInt("STORE_ID"));
				emp.setMenuName(rs.getString("NAME"));
				emp.setMenuCost(rs.getInt("COST"));
				return emp;
			}
		});
	}

	@Override
	public EmpVO getEmpInfo(int empid) {
		String sql = "select id, store_id, "
				+ "name, cost "
				+ "from menu where id=?";		
		return jdbcTemplate.queryForObject(sql, new EmpMapper(), empid);
	}

	@Override
	public void updateEmp(EmpVO emp) {
		String sql = "update menu "
				+ "set ID=?, store_id=?,"
				+ "name=?, cost=?";
		jdbcTemplate.update(sql, emp.getMenuId(),
				emp.getStoreId(),
				emp.getMenuName(),
				emp.getMenuCost()
		);
	}

	@Override
	public void insertEmp(EmpVO emp) {
		String sql = "insert into employees (id, store_id, name, cost)"
				+ "values (?,?,?,?)";
		jdbcTemplate.update(sql, 
				emp.getMenuId(),
				emp.getStoreId(),
				emp.getMenuName(),
				emp.getMenuCost()
		);
	}
	
	@Override
	public void deleteJobHistory(int empid) {
		String sql = "delete from job_history where id=?";
		jdbcTemplate.update(sql, empid);
	}
	//?

	@Override
	public void deleteEmp(int empid) {
		String sql = "delete from menu where id=?";
		jdbcTemplate.update(sql, empid);
	}
//	
//	@Override
//	public List<Map<String, Object>> getAllDeptId() {
//		String sql = "select department_id as departmentId, "
//					+"		department_name as departmentName "
//					+"	from departments";
//		return jdbcTemplate.queryForList(sql);
//	}
////	
//	@Override
//	public List<Map<String, Object>> getAllJobId() {
//		String sql = "select job_id as jobId, job_title as title from jobs";
//		return jdbcTemplate.queryForList(sql);
//	}

	@Override
	public List<Map<String, Object>> getAllDeptId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> getAllJobId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> getAllManagerId() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public List<Map<String, Object>> getAllManagerId() {
//		String sql = "select "
//					+ "	d.manager_id as managerId, e.first_name as firstName "
//					+ "from departments d join employees e "
//					+ " on d.manager_id = e.employee_id "
//					+ "order by d.manager_id";
//		return jdbcTemplate.queryForList(sql);
//	}
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