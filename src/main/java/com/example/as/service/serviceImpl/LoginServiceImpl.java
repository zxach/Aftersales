package com.example.as.service.serviceImpl;

import com.example.as.entity.LoginVerfiyRequest;
import com.example.as.entity.LoginVerfiyResponse;
import com.example.as.entity.SuccessInfo;
import com.example.as.mapper.LoginMapper;
import com.example.as.pojo.People;
import com.example.as.service.LoginServices;
import com.example.as.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginServices {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public LoginVerfiyResponse verfiyUser(LoginVerfiyRequest loginVerfiyRequest) {
        String id = loginVerfiyRequest.getUid();
        String password = loginVerfiyRequest.getPassword();
        People peopleList =null;
        LoginVerfiyResponse loginVerfiyResponse = new LoginVerfiyResponse();
        SuccessInfo successInfo = new SuccessInfo();

        try {
            peopleList = loginMapper.VerfiyPeople(id);

            if(peopleList.getPassword().equals(password)){
                People user = new People();
                user.setUid(peopleList.getUid());
                user.setName(peopleList.getName());
                user.setPassword(peopleList.getPassword());

                String token = JwtUtil.geneJsonWebToken(user);

                successInfo.setSuccess(true);
                successInfo.setMessage("验证成功");

                loginVerfiyResponse.setArea(peopleList.getArea());
                loginVerfiyResponse.setSuccessInfo(successInfo);
                loginVerfiyResponse.setToken(token);

                return loginVerfiyResponse;

            }else {

                successInfo.setMessage("验证失败");

                loginVerfiyResponse.setSuccessInfo(successInfo);

                return loginVerfiyResponse;

            }
        }catch (Exception e){
            return loginVerfiyResponse;
        }

    }
}
