package br.com.edu.service;

import br.com.edu.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
    private final Logger logger = Logger.getLogger(PersonServices.class.getName());

    public Person findById(String id) {
        logger.info("Finding one person!");
        return new Person(counter.incrementAndGet(), "Person " + id, "Eduardo", "São Paulo", "Male");
    }
    
    public List<Person> findAll() {
        List<Person> people = new ArrayList<>();
        logger.info("Finding all people!");
        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            people.add(person);
        }
        return people;
    }

    public Person create(Person person) {
        logger.info("Creating one person!");
        return person;
    }

    public Person update(Person person) {
        logger.info("Creating one person!");
        return person;
    }

    public void delete(String id) {
        logger.info("Deleting one person!" + id);

    }

    private Person mockPerson(int i) {
        return new Person(counter.incrementAndGet(), "First Name" + i, "Last Name" + i, "São Paulo", i % 2 == 0 ? "Male" : "Female");

    }
}
