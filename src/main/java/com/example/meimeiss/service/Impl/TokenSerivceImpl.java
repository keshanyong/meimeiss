package com.example.meimeiss.service.Impl;

import com.example.meimeiss.service.TokenService;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

@Service
public class TokenSerivceImpl implements TokenService {

    @Override
    public String generate(String... strings) {
        long timestamp = System.currentTimeMillis();
        String tokenMeta = "";
        for (String s : strings) {
            tokenMeta = tokenMeta + s;
        }
        tokenMeta = tokenMeta + timestamp;
        String token = DigestUtils.md5DigestAsHex(tokenMeta.getBytes());

        return token;
    }
}
