package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
	@RequestMapping("/quiz02")
	public void quiz02() {
		
	}
	
	@RequestMapping("/join")
	public String join(@ModelAttribute("join") QuizVO vo) {
		
		return "quiz/quiz02_ok";
	}
	
	@RequestMapping("/quiz03")
	public void quiz03() {
		
	}
	
	@RequestMapping("/quiz03_ok")
	public void quiz03_ok() {
		
	}
	
	@RequestMapping(value = "/join2", method=RequestMethod.POST)
	public String join2(@RequestParam("id") String id,
						@RequestParam("pw") String pw,
						@RequestParam("pw_check") String pw_check,
						RedirectAttributes RA) {
		
		if(id.equals("")) {
			
			RA.addFlashAttribute("idd", "아이디를 확인하세요");
			
			return "redirect:/quiz/quiz03";
			
		} else if(!pw.equals(pw_check)) {
			
			RA.addFlashAttribute("pww", "비밀번호를 확인하세요");
			
			return "redirect:/quiz/quiz03";
			
		} else {
			
			RA.addFlashAttribute("ok", id + "님 회원가입을 축하합니다");
			
			return "redirect:/quiz/quiz03_ok";
			
		}
		
	}
	

}
