package com.app.controller;

import javax.annotation.Generated;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/viewHome")
	public String view(){
		return "home";
	}
	@RequestMapping("/all")
	public String showAll(){
		return "CommonPage";
	}
	@RequestMapping("/emp")
	public String showEmp(){
		return "EmployeePage";
	}
	
	
	@RequestMapping("/admin")
	public String showAdmin(){
		return "AdminPage";
	}
	@RequestMapping("/view")
	public String showView(){
		return "ViewPage";
	}
	@RequestMapping("/denied")
	public String showError(){
		return "AccessDenied";
	}
	@RequestMapping("/msg")
	public String showMsgA(){
<<<<<<< HEAD
		System.out.println("");
=======
		System.out.println("gddg");
>>>>>>> branch 'master' of https://github.com/vinayk999/SpringSecurityApp.git
		return "msgA";
	}
}
