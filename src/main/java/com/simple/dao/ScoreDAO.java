package com.simple.dao;

import java.util.ArrayList;

import com.simple.command.ScoreVO;

public interface ScoreDAO {
	
	public void regist(ScoreVO vo); //1.
	public ArrayList<ScoreVO> getList();
	public void delete(int num); //삭제기능

}
