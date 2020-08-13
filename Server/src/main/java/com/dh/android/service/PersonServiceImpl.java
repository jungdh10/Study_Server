package com.dh.android.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dh.android.dao.PersonDAO;
import com.dh.android.domain.Person;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonDAO personDao;
	
	@Override
	public List<Person> listPerson(HttpServletRequest request) {
		return personDao.listPerson();
	}

	@Override
	public Person getPerson(HttpServletRequest request) {
		//파라미터를 가져오기
		String personid = request.getParameter("personid");
		//파라미터를 정수로 변환해서 Dao 메소드에게 전달
		return personDao.getPerson(Integer.parseInt(personid));
	}


}