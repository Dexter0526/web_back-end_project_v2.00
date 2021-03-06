package com.company.project.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.project.MCommand.MDeleteCommand;
import com.company.project.MCommand.MJoinCommand;
import com.company.project.MCommand.MLogOutCommand;
import com.company.project.MCommand.MLogingCommand;
import com.company.project.MCommand.MUpdateCommand;
import com.company.project.MCommand.MUpdateViewCommand;
import com.company.project.MCommand.MCommand;
import com.company.project.service.MemberService;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;

@Controller
public class LogController {
	
//	MCommand command;
//
//	@RequestMapping(value = "/signup")
//	public String singUp(Model model) {
//		System.out.println("signUp");
//
//		return "Log/signUp";
//	}
//	@RequestMapping(value = "/join")
//	public String join(HttpServletRequest request, Model model) {
//		System.out.println("회원가입");
//		model.addAttribute("request", request);
//		command = new MJoinCommand();
//		command.execute(model);
//
//		return "MemberView/memberView";
//	}
//	@RequestMapping(value = "/memberUpdateView")
//	public String memberUpdateView(HttpServletRequest request, Model model) {
//		System.out.println("회원 수정");
//		model.addAttribute("request", request);
//		command = new MUpdateViewCommand();
//		command.execute(model);
//
//		return "Log/memberUpdateView";
//	}
//	@RequestMapping(value = "/memberUpdate")
//	public String memberUpdate(HttpServletRequest request, Model model) {
//		System.out.println("수정 완료");
//		model.addAttribute("request", request);
//		command = new MUpdateCommand();
//		command.execute(model);
//
//		return "MemberView/memberIndexView";
//	}
//	@RequestMapping(value = "/memberDelete")
//	public String memberDelete(HttpServletRequest request, Model model) {
//		System.out.println("회원 삭제");
//		model.addAttribute("request", request);
//		command = new MDeleteCommand();
//		command.execute(model);
//
//		return "MemberView/memberIndexView";
//	}
}
