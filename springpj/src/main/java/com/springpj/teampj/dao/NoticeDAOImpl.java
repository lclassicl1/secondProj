package com.springpj.teampj.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springpj.teampj.model.NoticeDTO;

@Repository
public class NoticeDAOImpl implements NoticeDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int getNoticeList() {
		int result = sqlSession.selectOne("mapper.notice.totalcnt");
		return result;
	}

}
