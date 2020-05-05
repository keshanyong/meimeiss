package com.example.meimeiss.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UserData {

    private Integer id;

    @NotBlank(message = "姓名不能为空")
    private String userName;

    private String password;

    private String nick;

    private String weChatCode;

}