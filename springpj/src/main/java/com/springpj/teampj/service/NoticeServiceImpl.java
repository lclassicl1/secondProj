package com.springpj.teampj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springpj.teampj.dao.NoticeDAO;
import com.springpj.teampj.model.NoticeDTO;
@Service
public class NoticeServiceImpl implements NoticeService {
	
	@Autowired
	NoticeDAO noticeDAOImpl;
	
	
	@Override
	public int getNoticeList() {
		int result = noticeDAOImpl.getNoticeList();
		return result;
	}

}
