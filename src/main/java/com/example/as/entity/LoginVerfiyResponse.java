package com.example.as.entity;

import java.util.ArrayList;

public class LoginVerfiyResponse {

    private String area;
    private ArrayList<SuccessInfo> successInfo;
    private String token;

    public LoginVerfiyResponse() {
    }

    public LoginVerfiyResponse(String area, ArrayList<SuccessInfo> successInfo, String token) {
        this.area = area;
        this.successInfo = successInfo;
        this.token = token;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public ArrayList<SuccessInfo> getSuccessInfo() {
        return successInfo;
    }

    public void setSuccessInfo(SuccessInfo successInfo) {
        this.successInfo = successInfo;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
