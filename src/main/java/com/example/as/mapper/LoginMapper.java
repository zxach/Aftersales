package com.example.as.mapper;

import com.example.as.pojo.People;
import org.apache.ibatis.annotations.Select;

public interface LoginMapper {

    @Select("select uid,name,password,area from people where uid = #{uid}")
    public People VerfiyPeople(String uid);

}
