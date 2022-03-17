package com.simple.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.RequestVO;

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
	
	//ex05 - 모델어노테이션 객체 처리
	//VO에 값을 자동맵핑 시키고 info이름으로 데이터를 넘긴다.
	@RequestMapping("/ex05")
	public String ex05(@ModelAttribute("info") RequestVO vo) {
		
		System.out.println(vo.getId());
		System.out.println(vo.getAge());
		
		return "response/ex05";
	}
	
	//================리다이렉트 and 리다이렉트어트리뷰트===============
	
	//로그인 페이지
	@RequestMapping("/redirect_login")
	public void redirect_login() {
		
	}
	//로그인 성공페이지
	@RequestMapping("/redirect_login_ok")
	public void redirect_login_ok() {
		System.out.println("탓어");
	}
	//폼 페이지
	@RequestMapping(value = "/login", method =RequestMethod.POST)
	public String login(@RequestParam("id") String id,
						@RequestParam("pw") String pw,
						RedirectAttributes RA) {
		
		if(id.equals(pw)) {  //로그인 성공이라 가정

			RA.addFlashAttribute("msg", "로그인 성공했습니다");
			//리다이렉트시에는 모델객체 사용불가능, 일회성 addFlash
			return "redirect:/response/redirect_login_ok"; //성공시
				//redirect:/절대경로  = 다시 컨트롤러를 태워야 함
		} else {
			
			return "response/redirect_login"; //실패시
			
		}
		
	}
	
	
}
