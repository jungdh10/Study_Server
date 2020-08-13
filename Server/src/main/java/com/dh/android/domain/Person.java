package com.dh.android.domain;

public class Person {
	//int를 String으로 설정하는 부분에 대해서 고민- 데이터에 null이 포함되어 있다면 int는 Exception이 발생
	private String personid;
	private String personname;
	private String age;
	private String patronus;
	private String picture;
	public String getPersonid() {
		return personid;
	}
	public void setPersonid(String personid) {
		this.personid = personid;
	}
	public String getPersonname() {
		return personname;
	}
	public void setPersonname(String personname) {
		this.personname = personname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPatronus() {
		return patronus;
	}
	public void setPatronus(String patronus) {
		this.patronus = patronus;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	@Override
	public String toString() {
		return "Person [personid=" + personid + ", personname=" + personname + ", age=" + age + ", patronus=" + patronus
				+ ", picture=" + picture + "]";
	}
	
	
	
}
