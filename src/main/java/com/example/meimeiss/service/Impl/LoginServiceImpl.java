package com.example.meimeiss.service.Impl;

import com.example.meimeiss.dao.UserDataMapper;
import com.example.meimeiss.entity.UserData;
import com.example.meimeiss.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    UserDataMapper userDataMapper;

    @Override
    public String UserLogin() {
        List<UserData> userDataList =  userDataMapper.getUserListData();
        return "";
    }

    @Override
    public List<UserData> getUserDataList() {
        return userDataMapper.getUserListData();
    }
}
