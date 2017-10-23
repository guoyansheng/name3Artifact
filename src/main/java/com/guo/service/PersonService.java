package com.guo.service;

import java.util.List;

import com.guo.model.modelDo.Person;

public interface PersonService {

    /**
     * person 查询所有
     * @return
     */
    List<Person> loadPersons();
}