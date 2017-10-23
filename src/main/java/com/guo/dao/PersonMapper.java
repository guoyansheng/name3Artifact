package com.guo.dao;

import java.util.List;

import com.guo.model.modelDo.Person;

public interface PersonMapper {
    /**
     * ����һ����¼
     * @param person
     */
    //void insert(Person person);
    
    /**
     * ��ѯ����
     * @return
     */
    List<Person> queryAll();
}