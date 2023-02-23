package com.springpj.teampj.dao;

import java.util.List;

import com.springpj.teampj.model.NoticeDTO;

public interface NoticeDAO {
	
	//mybatis 연동 테스트
	public List<NoticeDTO> getNoticeList();
	
	//공지사항 글작성
	public int noticeInsert(NoticeDTO noticeDTO);
}
