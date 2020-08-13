package com.dh.android;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dh.android.domain.Person;
import com.dh.android.service.PersonService;

@RestController
public class PersonController {
	@Autowired
	private PersonService personService;
	
	//url은 모두 소문자로 합니다.(value="listperson")
	@RequestMapping(value="listperson", method=RequestMethod.GET)
	public List<Person> listPerson(HttpServletRequest request){
		return personService.listPerson(request);
	}
	//실행시키고 창이뜨면 주소 끝에 /listperson 입력
	
	@RequestMapping(value="getperson", method=RequestMethod.GET)
	//getPerson은 하나주는 거니까 List(X)
	public Person getPerson(HttpServletRequest request){
		return personService.getPerson(request);
	}
	
 
}
