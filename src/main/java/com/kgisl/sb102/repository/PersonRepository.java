package com.kgisl.sb102.repository;
 
 
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.kgisl.sb102.entity.Person;
 
 @Repository
   public interface PersonRepository extends ListCrudRepository<Person, Long>{
   
   
 
}