package com.example.as.controller;

import com.example.as.entity.LoginVerfiyRequest;
import com.example.as.entity.LoginVerfiyResponse;
import com.example.as.service.LoginServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("column")
public class columnController {

    @Autowired
    private LoginServices loginServices;

    @RequestMapping(value = "login/verfiy",method = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
    @ResponseBody
    public LoginVerfiyResponse loginWithArea(@RequestBody LoginVerfiyRequest loginVerfiyRequest){
        return loginServices.verfiyUser(loginVerfiyRequest);
    }
}
