package com.springpj.teampj.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springpj.teampj.dao.ChatDAO;
import com.springpj.teampj.model.ChatDTO;

@Service
public class ChatService {
	@Autowired
	private ChatDAO chatDAO;
	private static final Logger logger = LoggerFactory.getLogger(ChatService.class);
	
	public void addMessage(ChatDTO chatDTO) {
		logger.info("service");
		chatDAO.addMessage(chatDTO);
	}

	public List<ChatDTO> listMessage(int roomNo) {
		
		List<ChatDTO> list = chatDAO.listMessage(roomNo);
		
		return list;
	}

}
