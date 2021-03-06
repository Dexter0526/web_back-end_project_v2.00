package com.company.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.project.NCommand.NCommand;
import com.company.project.NCommand.NDeleteCommand;
import com.company.project.NCommand.NGetCommand;
import com.company.project.NCommand.NListCommand;
import com.company.project.NCommand.NRegistrationCommand;
import com.company.project.NCommand.NUpdateCommand;
import com.company.project.command.NewsCommand;
import com.company.project.dto.Criteria;
import com.company.project.dto.NewsDto;
import com.company.project.dto.pageDto;
import com.company.project.mapper.NewsMapper;
import com.company.project.service.NewsService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@AllArgsConstructor
@Controller
public class NewsController {
	
	private NewsMapper mapper;
	private NewsService service;
	private NewsCommand command;
	
	@RequestMapping(value="/news")
	public String news(Criteria cri, HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		
		model.addAttribute("bestNews", mapper.bestNews());
//		session2.setAttribute("bestNews", mapper.bestNews());
		
		model.addAttribute("cri", cri);
		command.selectAllNewsWithPaging(model);

		return "/Promotion/news";
	}
	
	@RequestMapping(value="/newsRegistration")
	public String newsRegistration(Criteria cri, NewsDto ndto, HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		mapper.insertNews(ndto);
		
		// 리스트 재실행
		model.addAttribute("cri", cri);
		command.selectAllNewsWithPaging(model);
		
		return "/Promotion/news";
	}
	
	@RequestMapping(value="/getNews")
	public String getNews(Criteria cri,int num, HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		model.addAttribute("cri", cri);
		model.addAttribute("nresult", 0);
		HttpSession session2 = request.getSession();
		
		if(session2.getAttribute("admin") != null) {
			int admin = (int) session2.getAttribute("admin");
			if(admin == 0 || admin == 1) {
				model.addAttribute("nresult", 1);
			}
		}
		model.addAttribute("news", service.getNews(num));
		
		// 리스트 재실행
		model.addAttribute("cri", cri);
		command.selectAllNewsWithPaging(model);
		
		return "/Promotion/news";
	}
	@RequestMapping(value="/newsUpdate")
	public String newsUpdate(Criteria cri, NewsDto ndto, HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		
		// 업데이트
		mapper.updateNews(ndto);
		
		// 리스트 재실행
		model.addAttribute("cri", cri);
		command.selectAllNewsWithPaging(model);
		
		return "/Promotion/news";
	}
	
	@RequestMapping(value="/newsDelete")
	public String newsDelete(Criteria cri, HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		int num = Integer.parseInt(request.getParameter("num"));
		
		// 삭제
		mapper.deleteNews(num);
		
		// 리스트 재실행
		model.addAttribute("cri", cri);
		command.selectAllNewsWithPaging(model);
		
		return "/Promotion/news";
	}
	
}
