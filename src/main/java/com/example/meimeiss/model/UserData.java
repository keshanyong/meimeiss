package com.example.meimeiss.model;

import lombok.Data;

@Data
public class UserData {
    private Integer Id;
    private String userName;
    private String password;
    private String nick;
    private String weChatCode;

}
