package ru.maltsevkonstantin.simple_library.models;

public class Person {
    int personId;
    String name;
    String dateOfBirth;

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dayOfBirth) {
        this.dateOfBirth = dayOfBirth;
    }
}
