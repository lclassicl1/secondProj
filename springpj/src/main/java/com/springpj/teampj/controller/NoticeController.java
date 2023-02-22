package com.springpj.teampj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springpj.teampj.service.NoticeService;

@Controller
public class NoticeController {
	
	@Autowired
	NoticeService noticeServiceImpl;
	
	@RequestMapping(value="notice", method=RequestMethod.GET)
	public String getNoticeList(Model model) {
		int result = noticeServiceImpl.getNoticeList();
		model.addAttribute("result",result);
		return "notice/noticeList";
	}
	
}
