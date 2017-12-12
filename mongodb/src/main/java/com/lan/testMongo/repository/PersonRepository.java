package com.lan.testMongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import com.lan.testMongo.entity.Person;

import java.util.List;

/**
 * Created by tianxianglan on 2017/5/2.
 */
@Repository(value = "PersonRepository")
public interface PersonRepository extends PagingAndSortingRepository<Person, String>, MongoRepository<Person, String>{

    Person findByFirstName(String firstName);

    List<Person> findByAgeLessThan(int age);

    @Query("{'firstName':?0}")
    List<Person> findByThePersonFirstName(String firstName);
}
