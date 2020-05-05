package com.example.meimeiss.dao;

import com.example.meimeiss.model.UserData;

public interface UserDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserData record);

    int insertSelective(UserData record);

    UserData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserData record);

    int updateByPrimaryKey(UserData record);

    /**
     * 查询用户信息
     * @param userData
     * @return
     */
    UserData getUserData(UserData userData);
}