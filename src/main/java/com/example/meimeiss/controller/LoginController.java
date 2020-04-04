package com.example.meimeiss.controller;

import com.example.meimeiss.entity.UserData;
import com.example.meimeiss.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping("/userLogin")
    public String UserLogin(){
        return loginService.UserLogin();
    }

    @PostMapping("/getUserDataList")
    List<UserData> getUserDataList(){
        return loginService.getUserDataList();
    }
}
