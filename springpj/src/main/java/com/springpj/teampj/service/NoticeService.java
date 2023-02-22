package com.springpj.teampj.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.springpj.teampj.model.NoticeDTO;

public interface NoticeService {
	
	//공지사항 게시글 리스트
	public int getNoticeList();
}
