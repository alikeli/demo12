package com.example.demo12.service;

import com.example.demo12.domain.Driver;
import com.example.demo12.domain.Person;
import com.example.demo12.domain.TruckDriver;
import com.example.demo12.exeptions.BadPersonNumberException;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    List<Person> persons = new ArrayList<>(List.of(
            new Person("Жан", "Reno", "12345", 2),
            new Person("luk", "Reno", "54321", 3),
            new Person("жерар", "Reno", "41232", 0),
            new Driver("Jason", "Reno", "41232", "3491", 1),
            new TruckDriver("robert", "Reno", "41232", "2345", 4)

    ));
    List<String> professions = new ArrayList<>(List.of(
            "безработный",
            "водитель",
            "плотник",
            "столяр"
    ));

    @Override
    public String getPerson(Integer number) {
        final Person person;
        if (number >= persons.size()) {
            throw new BadPersonNumberException("ошибка в том, что номер человека больше размера массива");
        }
        person = persons.get(number);
        final String personDescription = ""
                + person.getName() + " "
                + person.getSurname() + " "
                + person.getPassport() + " "
                + professions.get(person.getProfessionNumber());
        return personDescription;
    }

    @Override
    public void addPerson(Person person) {
        persons.add(person);
    }


}
