package com.springpj.teampj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springpj.teampj.dao.UserDAO;
import com.springpj.teampj.model.User;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	// 회원등록
	@Override
	public void signUpUser(User member) {
		
		userDAO.signUpUser(member);
	}

	@Override
	public User getMemberById(String id) {
		
		User user = userDAO.getMemberById(id);
		
		return user;
	}

	@Override
	public List<User> getAllMemberList() {

		List<User> memberList = userDAO.getAllMemberList();
		
		return memberList;
	}
}
