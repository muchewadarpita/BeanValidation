package com.example.BeanValidation.repository;
import com.example.BeanValidation.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String> {
}

