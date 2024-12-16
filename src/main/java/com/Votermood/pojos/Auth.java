package com.Votermood.pojos;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Auth {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("mobileNumber")
    @Expose
    private String mobileNumber;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("rememberMe")
    @Expose
    private Boolean rememberMe;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(Boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

}
