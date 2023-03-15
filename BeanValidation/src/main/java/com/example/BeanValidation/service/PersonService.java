package com.example.BeanValidation.service;

import javax.validation.Valid;

import com.example.BeanValidation.model.Person;
import com.example.BeanValidation.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public Person createPerson(@Valid Person person) {
        return personRepository.save(person);
    }

    public Person updatePerson(String id, @Valid Person person) {
        person.setId(id);
        return personRepository.save(person);
    }

    public void deletePerson(String id) {
        personRepository.deleteById(id);
    }

    public List<Person> getAllPeople() {
        return personRepository.findAll();
    }
}
