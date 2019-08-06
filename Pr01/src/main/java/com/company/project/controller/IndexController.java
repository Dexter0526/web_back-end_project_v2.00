package com.company.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping(value = "/index")
	public String index(Model model) {
		System.out.println("index");
		System.out.println("실행");
		return "index";
	}

	// 회사소개
	@RequestMapping(value = "/info")
	public String about(Model model) {
		System.out.println("info");
		return "About/about";
	}
	
	// 사업분야
	@RequestMapping(value = "/business")
	public String contact(Model model) {
		System.out.println("contact");
		return "Business/building";
	}
	@RequestMapping(value = "/building")
	public String building(Model model) {
		System.out.println("building");
		return "/Business/building";
	}
	@RequestMapping(value = "/civil")
	public String civil(Model model) {
		System.out.println("civil");
		return "/Business/civil";
	}
	@RequestMapping(value = "/plant")
	public String plant(Model model) {
		System.out.println("plant");
		return "/Business/plant";
	}
	
	// 기술분야
	@RequestMapping(value = "/construction")
	public String construction(Model model) {
		System.out.println("construction");
		return "/Tech/construction";
	}
	@RequestMapping(value = "/environment")
	public String environment(Model model) {
		System.out.println("environment");
		return "/Tech/environment";
	}
	@RequestMapping(value = "/futureTech")
	public String futureTech(Model model) {
		System.out.println("futureTech");
		return "/Tech/futureTech";
	}
	@RequestMapping(value = "/patent")
	public String patent(Model model) {
		System.out.println("patent");
		return "/Tech/patent";
	}
	@RequestMapping(value = "/portfolio")
	public String portfolio(Model model) {
		System.out.println("portfolio");
		return "/Tech/portfolio";
	}
	
	// 직원 로그인
	@RequestMapping(value = "/log")
	public String log(Model model) {
		System.out.println("log");
		return "Log/log";
	}

}
