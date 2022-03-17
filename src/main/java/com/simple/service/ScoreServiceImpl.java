package com.simple.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.simple.command.ScoreVO;
import com.simple.dao.ScoreDAO;

@Service("xxx") //bean의 id를 xxx로
public class ScoreServiceImpl implements ScoreService{

	@Autowired
	@Qualifier("aaa")
	ScoreDAO scoreDao;
	
	
	@Override
	public void regist(ScoreVO vo) {
		
		scoreDao.regist(vo);
	}


	@Override
	public ArrayList<ScoreVO> getList() {
		return scoreDao.getList();
	}


	@Override
	public void delete(int num) {
			scoreDao.delete(num);
		
	}
	

}
