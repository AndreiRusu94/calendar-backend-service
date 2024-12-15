package calendar.backend.service.service;

import calendar.backend.service.data.repository.PersonRepository;
import calendar.backend.service.data.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public Person fetchPerson(final String personId) {
        return this.personRepository
                .findById(personId)
                .orElse(new Person());
    }
}
