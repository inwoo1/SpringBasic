package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.simple.command.QuizVO;



@Controller
@RequestMapping("/quiz")
public class QuizController {
	
	@RequestMapping("/quiz01")
	public String quiz1() {
		
		
		return "quiz/quiz01";
	}
	
	@RequestMapping("/sendBirth")
	public String sendBirth(QuizVO vo, Model model) {
		
		System.out.println(	vo.getYear() +
				(Integer.parseInt(vo.getMonth()) < 10 ? "0"+Integer.parseInt(vo.getMonth()) : Integer.parseInt(vo.getMonth()))+ 
				(Integer.parseInt(vo.getDay()) < 10 ? "0"+Integer.parseInt(vo.getDay()) : Integer.parseInt(vo.getDay())));
		model.addAttribute("year", vo.getYear());
		model.addAttribute("month", vo.getMonth());
		model.addAttribute("day", vo.getDay());
		 
		return "quiz/quiz01_ok";
		
	}

}
