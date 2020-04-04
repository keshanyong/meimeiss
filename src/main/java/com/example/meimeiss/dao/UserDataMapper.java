package com.example.meimeiss.dao;

import com.example.meimeiss.entity.UserData;

import java.util.List;

public interface UserDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserData record);

    int insertSelective(UserData record);

    UserData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserData record);

    int updateByPrimaryKey(UserData record);

    List<UserData> getUserListData();
}