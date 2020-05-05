package com.example.meimeiss.model.publicModel;

import lombok.Data;

@Data
public class ResultVO {

    /**
     * 状态
     */
    private Integer code;

    /**
     *  返回信息
     */
    private String message;

    /**
     * 自定义返回值
     */
    private Object resultData;
}
