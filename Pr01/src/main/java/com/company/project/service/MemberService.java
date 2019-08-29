package com.company.project.service;

import java.util.List;

import com.company.project.dto.MemberDto;

public interface MemberService {
	
	public int userCheck(String email, String pwd);
	
	public MemberDto getMember(String email);
	
	public List<MemberDto> selectAllMember();
	
	public boolean confirmEmail(String email);
	
	public void insertMember(MemberDto mdto);
	
	public int updateMember(MemberDto mdto);
	
	public int memberDelete(String email);
}