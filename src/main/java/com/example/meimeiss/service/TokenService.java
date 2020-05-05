package com.example.meimeiss.service;

import com.example.meimeiss.model.UserData;

public interface TokenService {

    /**
     * 生成token
     * @param strings
     * @return
     */
    String generate(String... strings);
}
