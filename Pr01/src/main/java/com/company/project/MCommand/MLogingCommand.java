package com.company.project.MCommand;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.company.project.dao.MemberDao;
import com.company.project.dto.MemberDto;
import com.company.project.service.MemberService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;


@Log4j
public class MLogingCommand{
	
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		HttpSession session2 = request.getSession();
		MemberDao mdao = new MemberDao();
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		
		// 정상 파라미터값 확인
		log.info("email : ... " + email);
		log.info("pwd : ... " + pwd);
		
		log.info("service.userCheck(email, pwd) ... " + mdao.userCheck(email, pwd));
		int result = mdao.userCheck(email, pwd);

		if(result == 1) {
			// service
			MemberDto mdto = mdao.getMember(email);
			int admin = mdto.getAdmin();
			session2.setAttribute("admin", admin);
			session2.setAttribute("message", "회원님 안녕하세요.");
		}else if(result == 0) {
			session2.setAttribute("message", "비밀번호가 맞지 않습니다.");
		}else if(result == -1) {
			session2.setAttribute("message", "회원이 존재하지 않습니다.");
		}
		session2.setAttribute("result", result);
	}
}

