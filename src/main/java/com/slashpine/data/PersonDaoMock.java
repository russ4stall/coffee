package com.slashpine.data;

import com.slashpine.models.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDaoMock implements PersonDao {

    List<Person> people;

    public PersonDaoMock() {
        people = new ArrayList<>();

        Person p1 = new Person(1, "Meaghan", "Rillstoned", "mr@slas.corn");
        Person p2 = new Person(2, "Russ", "Forstall", "rf@slas.corn");
        Person p3 = new Person(3, "Ashlyn", "Forstall", "af@slas.corn");
        Person p4 = new Person(4, "Stacy", "Peralta", "sp@powellperalta.corn");

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
    }

    @Override
    public Person getPersonById(int id) {
        for (Person person : people) {
            if (id == person.getId()) {
                return person;
            }
        }
        return null;
    }

    @Override
    public List<Person> getPeople() {
        return people;
    }

    @Override
    public Person addPerson(Person person) {
        person.setId(people.size() + 1);
        people.add(person);

        return person;
    }
}
