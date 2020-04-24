package com.snacks.snacks.models;

import com.snacks.snacks.utils.SerializedName;

import java.io.Serializable;

public class OtpModel implements Serializable {

    @SerializedName("otp")
    private Integer otp;

    public OtpModel(Integer otp){
        this.otp = otp;
    }

    public Integer getOtp() {
        return otp;
    }

    public void setOtp(Integer otp) {
        this.otp = otp;
    }
}
