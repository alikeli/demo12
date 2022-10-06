package com.example.demo12.controller;

import com.example.demo12.domain.Person;
import com.example.demo12.exeptions.BadPersonNumberException;
import com.example.demo12.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    private final PersonService personService;
    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    @GetMapping(path = "/person")
    public String getPersonInfo(@RequestParam("number") Integer number) {
        try {
            final String person = personService.getPerson(number);
            return person;
        } catch (
                BadPersonNumberException e) {
            return "Попробуйте другой номер";
        } catch (
                RuntimeException e) {
            return "Попробуйте в другой раз";
        } finally {
            System.out.println("Работа метода закончена");
        }
    }
    @GetMapping(path = "/person/add")
    public String getPersonInfo(@RequestParam("name") String name,
                                @RequestParam("surname") String surname,
                                @RequestParam("passport") String passport,
                                @RequestParam("profession") int profession
                                ) {
        Person person = new Person(
                name,
                surname,
                passport,
                profession
        );
        personService.addPerson(person);
        return "added";

    }
}
