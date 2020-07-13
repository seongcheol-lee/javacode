package com.coderby.myapp.hr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.coderby.myapp.hr.service.IEmpService;

@Controller
public class EmpController {

	@Autowired
	IEmpService empService;
	
	@RequestMapping(value= {"/hr/count", "count"})
//	@RequestMapping(value= {"/hr/count", "count"}, method=RequestMethod.GET)	//접근 가능
//	@RequestMapping(value= {"/hr/count", "count"}, method=RequestMethod.POST)	//접근 불가능
	public String empCount(
			@RequestParam(value="deptid", required=false, defaultValue="0")int deptid, Model model) {
		if(deptid==0) {
			model.addAttribute("count", empService.getEmpCount());
		}else {
//			model.addAttribute("count", empService.getEmpCount(50));
			model.addAttribute("count", empService.getEmpCount(deptid));
		}
		return "hr/count";		//위치 정보를 출력
	}
	
	@RequestMapping(value="count/{deptid}", method=RequestMethod.GET)
	public String empCount1(
//			@RequestParam(value="deptid", required=false, defaultValue="0")int deptid, Model model) {
			@PathVariable int deptid, Model model) {
		if(deptid==0) {
			model.addAttribute("count", empService.getEmpCount());
		}else {
			model.addAttribute("count", empService.getEmpCount(deptid));
		}
		return "hr/count";		//위치 정보를 출력
	}
}
