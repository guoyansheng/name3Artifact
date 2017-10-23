package com.guo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guo.dao.PersonMapper;
import com.guo.model.modelDo.Person;
import com.guo.service.PersonService;

@Service("personService")
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;

//    public void setPersonMapper(PersonMapper personMapper) {
//        this.personMapper = personMapper;
//    }

    @Override
    public List<Person> loadPersons() {
        return personMapper.queryAll();
    }
    
}