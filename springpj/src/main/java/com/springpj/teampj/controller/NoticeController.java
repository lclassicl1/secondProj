package com.springpj.teampj.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springpj.teampj.HomeController;
import com.springpj.teampj.model.NoticeDTO;
import com.springpj.teampj.service.NoticeService;
import com.sun.media.jfxmedia.logging.Logger;

@Controller
public class NoticeController {
	
	@Autowired
	NoticeService noticeServiceImpl;
	
	//공지사항 전체글 리스트
	@RequestMapping(value="notice", method=RequestMethod.GET)
	public String getNoticeList(Model model, HttpServletRequest req) {
		
		//세션
//		HttpSession session = req.getSession();
//		String id = (String) session.getAttribute("id");
//		System.out.println("id값:"+id);
		
		
		List<NoticeDTO> noticeList = noticeServiceImpl.getNoticeList();
		
		model.addAttribute("noticeList",noticeList);
		return "notice/noticeList";
	}
	
	//공지사항 글쓰기 폼 보여주기
	@RequestMapping(value="notice/insert", method=RequestMethod.GET)
	public String insertNoticeForm() {
		
		return "notice/insertForm";
	}
	
	@RequestMapping(value="notice/insert", method=RequestMethod.POST)
	public String insertNotice(NoticeDTO noticeDTO) {
		
		System.out.println("noticeDTO="+noticeDTO.toString());
		int cnt = noticeServiceImpl.noticeInsert(noticeDTO);
		if(cnt == 0) {
			System.out.println("공지사항 글쓰기 실패");
			return null;
		}
		return "redirect:/notice";
	}
	
	
	
}
