package com.company.project.NCommand;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.company.project.dao.NewsDao;
import com.company.project.dto.NewsDto;

public class NRegistrationCommand implements NCommand{

	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		try {
			request.setCharacterEncoding("UTF-8");
		}catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		NewsDto ndto = new NewsDto();
		NewsDao ndao = new NewsDao();
		ndto.setTitle(title);
		ndto.setContent(content);
		
		ndao.insertNews(ndto);
	}
}
