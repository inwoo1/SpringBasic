package com.simple.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.simple.command.ScoreVO;


@Repository("aaa")  //bean의 id를 aaa로 생성
public class scoreDAOImpl implements ScoreDAO {

	//DB대체 리스트
	ArrayList<ScoreVO> list = new ArrayList<>();
	
	@Override
	public void regist(ScoreVO vo) {
		list.add(vo);
		//DB연결
	}

	@Override
	public ArrayList<ScoreVO> getList() {
		
		return list;
	}

	@Override
	public void delete(int num) {
		list.remove(num);
	}

}
