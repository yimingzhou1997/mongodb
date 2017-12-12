package com.lan.testMongo.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

/**
 * Created by tianxianglan on 2017/5/1.
 */
@Document(collection = "person")
public class Person {

    @Id
    private String id;
    private String firstName;
    private String secondName;
    private int age;

    public Person() {
    }

    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
