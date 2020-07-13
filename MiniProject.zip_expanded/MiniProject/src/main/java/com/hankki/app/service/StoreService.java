package com.hankki.app.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hankki.app.dao.IStoreRepository;
import com.hankki.app.model.StoreVO;

@Service
public class StoreService implements IStoreService {

	@Autowired
	IStoreRepository empRepository;
	
	@Override
	public int getEmpCount() {
		return empRepository.getEmpCount();
	}

	@Override
	public int getEmpCount(int deptid) {
		return empRepository.getEmpCount(deptid);
	}

	@Override
	public List<StoreVO> getEmpList() {
		return empRepository.getEmpList();
	}

	@Override
	public StoreVO getEmpInfo(int empid) {
		return empRepository.getEmpInfo(empid);
	}

	@Override
	public void updateEmp(StoreVO emp) {
		empRepository.updateEmp(emp);
	}

	@Override
	public void insertEmp(StoreVO emp) {
		empRepository.insertEmp(emp);
	}

	@Override
	@Transactional
	public void deleteEmp(int empid, String email) {
		empRepository.deleteJobHistory(empid);
		empRepository.deleteEmp(empid, email);
	}

	@Override
	public List<Map<String, Object>> getAllDeptId() {
		return empRepository.getAllDeptId();
	}
	
	@Override
	public List<Map<String, Object>> getAllJobId() {
		return empRepository.getAllJobId();
	}

	@Override
	public List<Map<String, Object>> getAllManagerId() {
		return empRepository.getAllManagerId();
	}

}