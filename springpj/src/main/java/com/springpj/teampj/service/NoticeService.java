package com.springpj.teampj.service;

import java.util.List;

import com.springpj.teampj.model.NoticeDTO;

public interface NoticeService {
	
	//공지사항 게시글 리스트
	public List<NoticeDTO> getNoticeList();
	
	//공지사항 글작성
	public int noticeInsert(NoticeDTO noticeDTO);
}
