package org.example.repository;

import org.example.domain.Address;
import org.example.domain.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {

    private static final List<Person> data = new ArrayList<>();
    private static final PersonRepository personRepository = new PersonRepository();

    private PersonRepository() {

    }

    static {
        Address address1 = new Address(1L, "Street1", 5, 5);
        Address address2 = new Address(2L, "Street1", 5, 10);
        Address address3 = new Address(3L, "Stree1", 5, 10);

        Person person1 = new Person(1L, "Name1", "LastName1", 10, address1);
        Person person2 = new Person(2L, "Name2", "LastName2", 20, address2);
        Person person3 = new Person(3L, "Name3", "LastName3", 30, address3);
        Person person4 = new Person(4L, "Name4", "LastName4", 40, null);
        Person person5 = new Person(5L, "Name5", "LastName5", 50, null);

        Person person6 = Person.personStaticConstructor();

        data.add(person1);
        data.add(person2);
        data.add(person3);
        data.add(person4);
        data.add(person5);
    }

    public Person findById(long id) {
        for (Person person : data) {
            if (person.getId() == id) {
                return person;
            }
        }

        return null;
    }

    public static PersonRepository getPersonRepository() {
        return personRepository;
    }


}
