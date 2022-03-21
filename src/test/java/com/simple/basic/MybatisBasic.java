package com.simple.basic;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.simple.command.ScoreVO;
import com.simple.test.mapper.TestMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml")
public class MybatisBasic {
	
	@Autowired
	TestMapper testMapper;
	
	
//	@Test
//	public void test() {
//		
//		String result = testMapper.getTime();
//		
//		System.out.println(result);
//		
//	}
//	@Test
//	public void test02() {
//		ArrayList<ScoreVO> list = testMapper.getScore();
//		System.out.println(list.toString());
//	}
	
	//insert방법
	
//	@Test
//	public void insertOne() {
//		
//		//단일값-
//		int result = testMapper.insertOne("이순신");
//		System.out.println("성공실패결과:" + result);
//		
//	}
	
	//insert방법 다중값 (vo나 map)
	
//	@Test
//	public void insertTwo() {
//		
//		ScoreVO vo = new ScoreVO(0, "코비드", 20, 30 ,40);
//		
//		int result = testMapper.insertTwo(vo);
//		System.out.println("성공실패결과:" + result);
//	}
//	@Test
//	public void insertThree() {
//		
//		HashMap<String, String> map = new HashMap<>();
//		map.put("name", "강감찬");
//		map.put("kor", "40");
//		map.put("eng", "50");
//		map.put("math", "60");
//		
//		int result = testMapper.insertThree(map);
//		System.out.println("성공실패결과:" + result);
//		
//	}
	
//	@Test
//	public void insertFour() {
//		
//		int result = testMapper.insertFour("홍길숙", 100);
//		System.out.println("성공실패결과?:" + result);
//	}
//	
	//select 방법
//	@Test
//	public void selectOne() {
//		ScoreVO vo = testMapper.selectOne(4);
//		System.out.println(vo.toString());
//	}
//	
	
	//map을 통한 단일 조회
//	@Test
//	public void selectTwo() {
//		
//		HashMap<String, Object> map = testMapper.selectTwo(4);
//		System.out.println(map.toString());
//	}
	
//	//map을 통한 다중 조회
//	@Test
//	public void selectThree() {
//		
//		ArrayList<HashMap<String, Object>> list = testMapper.selectThree();
//		
//		System.out.println(list.toString());
//	}
//	
	
	//update 실습 - vo를 통해서 변경할 값을 전달하고 4번게시글 업데이트하고 성공실패 결과를 반환.
	@Test
	public void update() {
		
		ScoreVO vo = new ScoreVO(4, "inw", 30 , 100 , 100);
		
		int result = testMapper.update(vo);
		System.out.println("update결과?:" + result);
	}
	
	
	//delete 실습 - 키값을 전달해서 삭제하고 성공실패 결과를 반환.
	@Test
	public void delete() {
		
		int result = testMapper.delete(6);
		System.out.println("delete결과?:" + result);
	}
}
