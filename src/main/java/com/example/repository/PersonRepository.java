package com.example.repository;

import com.example.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by kajornsak on 2/13/2017 AD.
 */
public interface PersonRepository extends MongoRepository<Person,String> {
    public Person findByName(String name);

}
