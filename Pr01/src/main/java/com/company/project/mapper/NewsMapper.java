package com.company.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.company.project.dto.Criteria;
import com.company.project.dto.NewsDto;

public interface NewsMapper {
	
	public List<NewsDto> selectAllNews();
	
	public List<NewsDto> selectAllNewsWithPaging(@Param("cri") Criteria cri);
	
	public void insertNews(@Param("ndto")NewsDto ndto);
	
	public NewsDto getNews(@Param("num") int num);
	
	public void updateNews(@Param("ndto") NewsDto ndto);
	
	public void updateCount(@Param("num") int num);
	
	public void deleteNews(@Param("num") int num);
	
	public int count();
	
	public List<NewsDto> bestNews();
}
