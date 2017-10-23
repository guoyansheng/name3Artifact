package com.guo.dao;

import com.guo.model.modelDo.User;
import com.guo.model.modelDo.UserExample;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}