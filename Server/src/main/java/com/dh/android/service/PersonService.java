package com.dh.android.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.dh.android.domain.Person;

//리턴 타입은 보통의 경우는 Dao 메소드와 일치
//매개변수는 제일쉽게 하는 방법은 HttpServletRequest
//파일이 있을 때는 앞에 Multipart
public interface PersonService {
	public List<Person> listPerson(HttpServletRequest request);
	public Person getPerson(HttpServletRequest request);
}
