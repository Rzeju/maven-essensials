package org.example.services;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Level;
import org.example.domain.Person;
import org.example.repository.PersonRepository;

@Log4j2
public class PersonService {

    private final PersonRepository personRepository;
    private static final PersonService personService = new PersonService();

    private PersonService() {
        personRepository = PersonRepository.getPersonRepository();
    }

    public static PersonService getPersonService() {
        return personService;
    }

    public Person findById(long id) {

        Person person = personRepository.findById(id);
        log.log(Level.DEBUG, person.toString());

        return person;
    }
}
