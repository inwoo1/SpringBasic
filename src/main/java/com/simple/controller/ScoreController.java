package com.simple.controller;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.ScoreVO;
import com.simple.service.ScoreService;
import com.simple.service.ScoreServiceImpl;

@Controller
@RequestMapping("/service")
public class ScoreController {
	
	//1st
//	ScoreServiceImpl scoreService = new ScoreServiceImpl();
	
	//2nd
	//서비스를 빈으로 생성, 의존객체 자동주입
//	@Autowired
//	@Qualifier("xxx")
//	ScoreService scoreService;
	
	//3rd
	@Resource(name = "xxx")
	ScoreService scoreService;
	//등록화면
	@RequestMapping("/scoreRegist")
	public void scoreRegist() {
	}
	
	//목록화면
	@RequestMapping("/scoreList")
	public String list(Model model) {
		
		ArrayList<ScoreVO> list = scoreService.getList();
		model.addAttribute("list", list);
		//list이름으로 데이터 저장
		
		return "service/scoreList";
	}
	
	//결과화면
	@RequestMapping("/scoreResult")
	public String result() {
		
		return "service/scoreResult";
	}
	
	//등록요청
	@RequestMapping(value = "/scoreForm", method = RequestMethod.POST)
	public String scoreForm(ScoreVO vo) {
		
		
		scoreService.regist(vo);
		
		return "redirect:/service/scoreResult"; //결과화면
	}
	
	@RequestMapping("/scoreDelete")
	public String scoreDelete(@RequestParam("num") int num,
							  RedirectAttributes RA) {
		
		scoreService.delete(num);
		RA.addFlashAttribute("msg", num + "번호가 삭제되었습니다.");
		
		return "redirect:/service/scoreList";
		//삭제 업데이트하고 나갈시 redirect ? 
	}
 }
