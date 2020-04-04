package com.example.meimeiss.service;

import com.example.meimeiss.entity.UserData;

import java.util.List;

public interface LoginService {

    /**
     * 用户登录
     * @return
     */
    String UserLogin();

    /**
     * 查询用户数据
     * @return
     */
    List<UserData> getUserDataList();
}
