package com.example.meimeiss.service.Impl;

import com.example.meimeiss.dao.UserDataMapper;
import com.example.meimeiss.model.UserData;
import com.example.meimeiss.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    UserDataMapper userDataMapper;

    @Override
    public String getUserData() {
        List<UserData> list = userDataMapper.getUserDataList();
        System.out.println(list);
        return "pass";
    }
}
