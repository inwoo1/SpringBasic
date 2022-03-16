package com.simple.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/response")
public class ResponseController {
	
	@RequestMapping("/ex01")
	public String ex01() {
		
		return "response/ex01";
	}
	
	//ex02 - 데이터를 담아 보낸다
	@RequestMapping("/ex02")
	public String ex02(Model model) {
		
		model.addAttribute("serverTime", new Date()); //(키, 값)
		model.addAttribute("name", "홍길동");  //데이터 저장
		model.addAttribute("age", "30");
		//화면측에서 EL태그 ${키} 로 받을 수 있다.
		
		return "response/ex02";
	}

	//ex03 - 모델앤 뷰 방식    반환유형
	@RequestMapping("/ex03")
	public ModelAndView ex03() {
		
		ModelAndView mv = new ModelAndView(); 
		
		mv.addObject("serverTime", new Date());//데이터 저장
		mv.addObject("name", "이순신"); //데이터 저장
		
		mv.setViewName("response/ex03");//뷰의 경로
		
		return mv;
	}
	
	//ex04 - 모델어노테이션
	//모델어노테이션 = 리퀘스트 + 모델 / 다음화면에 받은 값을 그대로 넘겨준다
	@RequestMapping("/ex04")
	public String ex04(@ModelAttribute("id") String id) {
		
		System.out.println("화면에서 넘어온값:" + id);
		
		return "response/ex04";
	}
	
}
