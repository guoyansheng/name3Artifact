package com.huawei.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huawei.dao.PersonMapper;
import com.huawei.model.Person;
import com.huawei.service.IPersonService;

@Service("personService")
public class PersonServiceImpl implements IPersonService {
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