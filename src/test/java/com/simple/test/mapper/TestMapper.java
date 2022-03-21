package com.simple.test.mapper;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.annotations.Param;

import com.simple.command.ScoreVO;

public interface TestMapper {
	
	public String getTime(); //테스트메서드
	public ArrayList<ScoreVO> getScore();
	public int insertOne(String name);  //단일값 전달
	public int insertTwo(ScoreVO vo); //다중값 전달
	public int insertThree(HashMap<String, String> map);
	public int insertFour(@Param("aaa") String name, @Param("bbb") int kor);//키값 지정
	
	public ScoreVO selectOne(int num); //3번 키값 조회
	public HashMap<String, Object> selectTwo(int num);
	public ArrayList<HashMap<String, Object>> selectThree();
	
	public int update(ScoreVO vo);
	public int delete(int num);
}
