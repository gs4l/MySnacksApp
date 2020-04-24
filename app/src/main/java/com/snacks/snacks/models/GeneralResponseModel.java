package com.snacks.snacks.models;

import com.snacks.snacks.utils.SerializedName;

import java.io.Serializable;

public class GeneralResponseModel implements Serializable {

    @SerializedName("code")
    private Integer code;

    @SerializedName("message")
    private String message;

    public GeneralResponseModel(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
