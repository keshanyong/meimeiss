package com.example.meimeiss.service;

import com.example.meimeiss.model.UserData;
import com.example.meimeiss.model.publicModel.ResultVO;

public interface LoginService {

    /**
     * 用户登录
     * @param userData
     * @return
     */
    ResultVO userLogin(UserData userData);

    /**
     * 查询用户信息
     * @param userData
     * @return
     */
    ResultVO getUserInfo(UserData userData);
}
