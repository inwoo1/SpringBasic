package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
//	public String sendBirth(QuizVO vo, Model model) {
//		
//		System.out.println(	vo.getYear() +
//				(Integer.parseInt(vo.getMonth()) < 10 ? "0"+Integer.parseInt(vo.getMonth()) : Integer.parseInt(vo.getMonth()))+ 
//				(Integer.parseInt(vo.getDay()) < 10 ? "0"+Integer.parseInt(vo.getDay()) : Integer.parseInt(vo.getDay())));
//		model.addAttribute("year", vo.getYear());
//		model.addAttribute("month", vo.getMonth());
//		model.addAttribute("day", vo.getDay());
//		 
//		return "quiz/quiz01_ok";
//		
//	}
	
	public String sendBirth(@ModelAttribute("year") String year,
							@ModelAttribute("month") String month,
							@ModelAttribute("day") String day) {
		
		System.out.println(year +
						(Integer.parseInt(month) < 10 ? "0"+Integer.parseInt(month) : Integer.parseInt(month) )+
						(Integer.parseInt(day) < 10 ? "0"+Integer.parseInt(day) : Integer.parseInt(day) ));
		
		return "quiz/quiz01_ok";
	}

}
