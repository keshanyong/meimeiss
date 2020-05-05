package com.example.meimeiss.controller;

import com.example.meimeiss.model.UserData;
import com.example.meimeiss.model.publicModel.ResultVO;
import com.example.meimeiss.service.LoginService;
import com.example.meimeiss.verification.LoginIntercept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping("/userLogin")
    public ResultVO userLogin(@RequestBody UserData userData){
        return loginService.userLogin(userData);
    }

    @LoginIntercept
    @PostMapping("/getUserInfo")
    public ResultVO getUserInfo(@RequestBody UserData userData){
        return loginService.getUserInfo(userData);
    }
}
