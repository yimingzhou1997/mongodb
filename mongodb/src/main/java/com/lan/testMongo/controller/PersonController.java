package com.lan.testMongo.controller;

import com.lan.testMongo.Service.PersonService;
import com.lan.testMongo.common.Response;
import com.lan.testMongo.common.Status;
import com.lan.testMongo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by tianxianglan on 2017/5/2.
 */
@Controller
public class PersonController {

	@Autowired
	PersonService personService;

	@ResponseBody
	@RequestMapping(value = "person/findByFirstName", method = RequestMethod.POST)
	public Response findByName(String firstName) {
		Person findPerson = personService.findByFirstName(firstName);
		return new Response(Status.SUCCESS, findPerson);
	}

	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public Response insert(Person person) {
		personService.insert(person);
		return new Response(Status.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "test/testLessThan", method = RequestMethod.POST)
	public Response testLess(int age) {
		List<Person> list = personService.findLess(age);
		return new Response(Status.SUCCESS, list);
	}

	@ResponseBody
	@RequestMapping(value = "test/findByFirName", method = RequestMethod.POST)
	public Response findByFirName(String firstName) {
		List<Person> list = personService.findByThePersonFirName(firstName);
		return new Response(Status.SUCCESS, list);
	}

}
