package com.example.BeanValidation.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.*;
@Document(collection = "person")
public class Person {
    private String id;

    @NotBlank(message = "Name cannot be blank")
    private String name;
    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 120, message = "Age must be at most 120")
    private int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // getters and setters
}
