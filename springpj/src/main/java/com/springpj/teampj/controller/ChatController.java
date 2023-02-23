package com.springpj.teampj.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.springpj.teampj.model.ChatDTO;
import com.springpj.teampj.service.ChatService;

@Controller
public class ChatController {

	private static final Logger logger = LoggerFactory.getLogger(ChatController.class);
	
	@Autowired
	private ChatService chatService;
	
	@RequestMapping("/chat/room")
	public String showRoom(int roomNo) {
		return "chat/room";
	}
	@RequestMapping(value="/chat/addMessage", method=RequestMethod.POST)
	//@ResponseBody
	public String addPostMessage(@RequestParam int roomNo,@RequestParam String writerId,
								@RequestParam String content,Model model,HttpServletRequest req) {
		try {
			req.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		ChatDTO chatDTO = new ChatDTO();
		chatDTO.setRoomNo(roomNo);
		chatDTO.setWriterId(writerId);
		chatDTO.setContent(content);
		
		chatService.addMessage(chatDTO);
		model.addAttribute("roomNo", roomNo);
		
		return "redirect:/chat/checkMessage";
	}
	
	@RequestMapping("/chat/checkMessage")
	public String listMessage(@RequestParam int roomNo,Model model) {
		List<ChatDTO> list = chatService.listMessage(roomNo);
		
		model.addAttribute("list", list);
		model.addAttribute("roomNo", roomNo);
		return "chat/checkMessage";
	}
//	@RequestMapping(value="/chat/addMessage", method=RequestMethod.GET)
//	//@ResponseBody
//	public String addGetMessage(@ModelAttribute("chatDTO") ChatDTO chatDTO,Model model) {
//
//		return "chat/room?roomNo="+chatDTO.getRoomNo();
//	}
	
//	@RequestMapping(value="/chat/addMessage", method=RequestMethod.POST)
//	@ResponseBody
//	public String addPostMessage(@ModelAttribute("chatDTO") ChatDTO chatDTO,Model model) {
//		chatService.addMessage(chatDTO);
//		return "chat/room";
//	}
	
	
}
