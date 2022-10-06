package com.example.demo12.domain;

public class Person {
    private String name;
    private String surname;
    private String passport;
    private int professionNumber;

    public Person(String name, String surname, String passport, int professionNumber) {
        this.name = name;
        this.surname = surname;
        this.passport = passport;
        this.professionNumber = professionNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public int getProfessionNumber() {
        return professionNumber;
    }

    public void setProfessionNumber(int professionNumber) {
        this.professionNumber = professionNumber;
    }

    public void changePassportNumber(String passport) {
        if (passport != null && !passport.isBlank()) {
            this.passport = passport;
        }
    }

}

