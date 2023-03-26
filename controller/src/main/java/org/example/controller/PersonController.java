package org.example.controller;

import org.example.domain.Person;
import org.example.services.PersonService;

public class PersonController {

    private final PersonService personService;
    private static final PersonController personController = new PersonController();

    private PersonController() {
        personService = PersonService.getPersonService();
    }

    public void findById(long id) {
        Person person = personService.findById(id);
        System.out.println(person);
    }

    public static PersonController getInstance() {
        return personController;
    }
}
