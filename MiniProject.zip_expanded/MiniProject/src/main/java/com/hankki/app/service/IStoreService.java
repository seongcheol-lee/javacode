package com.hankki.app.service;

import java.util.List;
import java.util.Map;

import com.hankki.app.model.StoreVO;

public interface IStoreService {
	int getStoreCount();
	int getStoreCount(int deptid);
	List<StoreVO> getEmpList();
	StoreVO getEmpInfo(int empid);
	void updateEmp(StoreVO emp);
	void insertEmp(StoreVO emp);
	void deleteEmp(int empid, String email);
	List<Map<String, Object>> getAllDeptId();
	List<Map<String, Object>> getAllJobId();
	List<Map<String, Object>> getAllManagerId();
} 