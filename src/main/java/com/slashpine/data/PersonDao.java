package com.slashpine.data;

import com.slashpine.models.Person;

import java.util.List;

public interface PersonDao {
    Person getPersonById(int id);

    List<Person> getPeople();

    Person addPerson(Person person);
}
