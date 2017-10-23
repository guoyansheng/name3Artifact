package com.guo.dao;

import com.guo.model.modelDo.UserDo;
import com.guo.model.modelDo.UserDoExample;

public interface UserDoMapper {
    int countByExample(UserDoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserDo record);

    int insertSelective(UserDo record);

    UserDo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserDo record);

    int updateByPrimaryKey(UserDo record);
}