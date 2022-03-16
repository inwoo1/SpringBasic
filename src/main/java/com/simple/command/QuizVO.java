package com.simple.command;

public class QuizVO {
	
	private String id;
	private String pw;
	private String year;
	private String month;
	private String day;
	
	
	public QuizVO() {
	}


	public QuizVO(String id, String pw, String year, String month, String day) {
		super();
		this.id = id;
		this.pw = pw;
		this.year = year;
		this.month = month;
		this.day = day;
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


	
	

	
}
