package com.simple.command;

import java.util.ArrayList;

public class RequestVO {
	
	//폼의 name과 일치하는 변수명을 적습니다.
	//단일값 String 다중값 List<>
	private String id;
	private String age;
	private ArrayList<String> inter;
	
	public RequestVO() {
	}

	public RequestVO(String id, String age, ArrayList<String> inter) {
		super();
		this.id = id;
		this.age = age;
		this.inter = inter;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public ArrayList<String> getInter() {
		return inter;
	}

	public void setInter(ArrayList<String> inter) {
		this.inter = inter;
	}
	
	

}
