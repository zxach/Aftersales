package com.example.as.service;

import com.example.as.entity.LoginVerfiyRequest;
import com.example.as.entity.LoginVerfiyResponse;

public interface LoginServices {

    public LoginVerfiyResponse verfiyUser(LoginVerfiyRequest loginVerfiyRequest);

}
