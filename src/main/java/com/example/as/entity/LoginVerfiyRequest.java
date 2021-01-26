package com.example.as.entity;

public class LoginVerfiyRequest {
    private String uid;
    private String password;

    public LoginVerfiyRequest() {
    }

    public LoginVerfiyRequest(String uid, String password) {
        this.uid = uid;
        this.password = password;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
