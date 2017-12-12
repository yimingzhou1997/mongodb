package com.lan.testMongo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import com.lan.testMongo.entity.Person;
import com.lan.testMongo.repository.PersonRepository;

import java.util.List;

/**
 * Created by tianxianglan on 2017/5/2.
 */
@Service
public class PersonService {

    @Autowired
    public PersonRepository personRepository;

    @Autowired
    MongoTemplate mongoTemplate;

    /*public Person findByName(String name){
        Person person = mongoTemplate.findOne(new Query(Criteria.where("name").is(name)), Person.class);
        return person;
    }*/

    public void insert(Person person){
        mongoTemplate.insert(person);
    }

    public Person findByFirstName(String firstName){
        return personRepository.findByFirstName(firstName);
    }

    public List<Person> findLess(int age){
        return personRepository.findByAgeLessThan(age);
    }

    public List<Person> findByThePersonFirName(String firstName){
        return personRepository.findByThePersonFirstName(firstName);
    }
}
