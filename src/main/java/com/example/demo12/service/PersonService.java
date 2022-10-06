package com.example.demo12.service;

import com.example.demo12.domain.Person;

public interface PersonService {
    public String getPerson(Integer number);

    void addPerson(Person person);
}
