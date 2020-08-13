package com.dh.android;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dh.android.dao.PersonDAO;

//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner; 

@RunWith(SpringJUnit4ClassRunner.class)
//@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml" })

public class PersonTest {
	@Autowired
	private SqlSession sqlSession;
	
	@Autowired
	private PersonDAO personDAO;
	
	@Test
	public void connecTest() {
		//System.out.println(sqlSession);
		//System.out.println(sqlSession.selectList("person.listPerson"));
		//System.out.println(sqlSession.selectList("person.getPerson", 1));
		//System.out.println(sqlSession.selectOne("person.getPerson", 1)+"");
		
		//System.out.println(personDAO);
		System.out.println(personDAO.listPerson());
		System.out.println(personDAO.getPerson(2));
	}
}
