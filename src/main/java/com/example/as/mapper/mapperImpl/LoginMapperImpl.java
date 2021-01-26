package com.example.as.mapper.mapperImpl;

import com.example.as.mapper.LoginMapper;
import com.example.as.pojo.People;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginMapperImpl implements LoginMapper {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public People VerfiyPeople(String uid) {
        return loginMapper.VerfiyPeople(uid);
    }
}
