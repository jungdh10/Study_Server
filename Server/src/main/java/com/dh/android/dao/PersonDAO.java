package com.dh.android.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dh.android.domain.Person;

@Repository
public class PersonDAO {
	@Autowired
	private SqlSession sqlSession;
	
	//테이블의 전체 데이터를 가져오는 메소드(전체 목록)
	public List<Person> listPerson(){
		return sqlSession.selectList("person.listPerson");
	}
	
	//personid를 가지고 하나의 데이터를 가져오는 메소드(상세보기)
	public Person getPerson(int personid) {
		return sqlSession.selectOne("person.getPerson", personid);
	}
}
