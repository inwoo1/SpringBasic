package com.simple.command;

public class QuizVO {
	
	private String id;
	private String pw;
	private String year;
	private String month;
	private String day;
	private String name;
	private String email;
	private String pw_check;
	
	
	
	public QuizVO() {
	}

	public QuizVO(String id, String pw, String year, String month, String day, String name, String email,
			String pw_check) {
		super();
		this.id = id;
		this.pw = pw;
		this.year = year;
		this.month = month;
		this.day = day;
		this.name = name;
		this.email = email;
		this.pw_check = pw_check;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPw_check() {
		return pw_check;
	}

	public void setPw_check(String pw_check) {
		this.pw_check = pw_check;
	}

	

	
}
