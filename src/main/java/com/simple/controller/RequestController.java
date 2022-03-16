package com.simple.controller;

import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.QuizVO;
import com.simple.command.RequestVO;

@Controller  //컴포넌트 스캔이 읽어서 bean으로 생성한다.
@RequestMapping("/request") //공통경로
public class RequestController {
	
//	@RequestMapping("/test")
//	public void test() {
//		
//		System.out.println("실행됨");
//		
//	}
	
	//void형 메서드는 들어오는 경로를 그대로 리졸버 뷰에 반환합니다.
//	@RequestMapping("/request/ex01")    void형은 보여줄 화면을 ()에 적는다.
//	public void ex01() {
//		
//		
//	}
	
	//String형 메서드는 들어오는경로, 나가는경로를 각각 지정할 수 있다   똑같이 맞추면 void형과 같음
	@RequestMapping("/ex01")   //() 의 주소값?이 들어오면
	public String ex01() {
		
		return "request/ex01"; //return의 페이지를 반환한다.
	}
	
	//GET요청만 받는다
	@RequestMapping(value = "/basic1", method = RequestMethod.GET)
	public void basic1() {
		
		System.out.println("basic1번실행");
		
	}
	
	//Post요청만 받는다
	@RequestMapping(value = "/basic2", method = RequestMethod.POST)
	public void basic2() {
		System.out.println("basic2번 실행");
	}
	
	//get,post요청 상관없이 둘다 받아줍니다.
	@RequestMapping("/basic3")
	public void basic3() {
		System.out.println("basic3실행");
	}
	//동일한 요청을 하나로 맵핑할때는 {경로,경로.....} 로 표기할 수 있습니다
//	@RequestMapping(value = {"/basic1", "/basic2", "/basic3"} )
//	public void basic4() {
//		System.out.println("basic1234 실행됨");
//		
//	}

	//============파라미터 값 처리============
	//ex02화면 처리하는 메서드
	
	@RequestMapping("/ex02")
	public String ex02() {
		
		return "request/ex02";
	}
	
	//폼태그받기
//	@RequestMapping("/param")
//	public String param(HttpServletRequest request) {
//		
//		String id = request.getParameter("id");	
//		String age = request.getParameter("age");
//		String[] inter = request.getParameterValues("inter");
//		
//		return "request/ex02_result";
//		
//	}
	
//	//2nd ?  RequestParam(이름) - 필수값이 넘어와야 함 required = true
//	// (value = "파라미터값", required = false , defaultValue = "기본값")
//	@RequestMapping("/param")
//	public String param(@RequestParam("id") String id,
//						@RequestParam("age") int age,
//						@RequestParam(value = "inter", required = false, defaultValue = "") ArrayList<String> list ) {
//		
//		//필수가 아닌 파라미터는 required = false속성을 지정하면 됩니다.
//		//필수가 아닌 파라미터일 경우 null값을 지정하게 되는데 defaultValue로 기본값을 지정할 수 있습니다.
//		System.out.println(id);
//		System.out.println(age);
//		System.out.println(list.toString());
//		
//		return "request/ex02_result";
//	}
	
	//3nd - 커멘드 객체
//	@RequestMapping("/param")
//	public String param(RequestVO vo) {
//		
//		System.out.println(vo.getId());
//		System.out.println(vo.getAge());
//		System.out.println(vo.getInter().toString());
//		
//		return "request/ex02_result";
//	}
	
	//====================실습====================
	//띄울 화면
	@RequestMapping("/req_quiz01") //들어올 값(뭐가 들어오든 상관없지만, 나갈 값과 맞추는게 일반적이다)
	public String quiz01() {
		
		return "request/req_quiz01";//나갈 값
	}
	//form을 받을 화면
	@RequestMapping(value = "/quiz", method = RequestMethod.POST)
	
//	1st
//	public String quiz(HttpServletRequest request) {
//		String id = request.getParameter("id");
//		String pw = request.getParameter("pw");
//		
//		if(id.equals("abc123") && pw.equals("xxx123")) {
//			
//			return "request/req_quiz01_ok";
//			 
//		} else {
//			
//			return "request/req_quiz01_no";
//		}
//		
//	}
	
//	2nd
//	public String quiz(@RequestParam("id") String id,
//					   @RequestParam("pw") String pw) {
//		
//		if(id.equals("abc123") && pw.equals("xxx123")) {
//		
//		return "request/req_quiz01_ok";
//		 
//		} else {
//			
//			return "request/req_quiz01_no";
//		}
//			
//	}
	
//	3rd
	public String quiz(QuizVO vo) {
		
		if(vo.getId().equals("abc123") && vo.getPw().equals("xxx123")) {
		
		return "request/req_quiz01_ok";
			 
		} else {
			
			return "request/req_quiz01_no";
		}
}
	
}
