package com.example.meimeiss.service.Impl;

import com.example.meimeiss.service.LoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Override
    public String getUserData() {
        return "pass";
    }
}
