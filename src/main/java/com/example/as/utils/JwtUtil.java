package com.example.as.utils;

import com.example.as.pojo.People;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

/**
 * jwt工具类
 */

public class JwtUtil {

    public static final String SUBJECT = "aftersales";

    public static final long EXPIRE = 1000 * 60 * 60 * 3;//过期时间为3小时

    public static final String APPSECRET = "logintoken";

    /**
     * 生成jwt
     *
     * @param people
     * @return
     */
    public static String geneJsonWebToken(People people) {

        if (people == null || people.getUid() == null || people.getName() == null || people.getPassword() == null) {
            return null;
        } else {
            String token = Jwts.builder().setSubject(SUBJECT)
                    .claim("uid", people.getUid())
                    .claim("name", people.getName())
                    .claim("psw", people.getPassword())
                    .setIssuedAt(new Date())
                    .setExpiration(new Date(System.currentTimeMillis() + EXPIRE))
                    .signWith(SignatureAlgorithm.HS256, APPSECRET).compact();
            return token;
        }
    }

    /**
     * 校验token
     *
     * @param token
     * @return
     */
    public static Claims checkJWT(String token) {
        try {
            final Claims claims = Jwts.parser().setSigningKey(APPSECRET).parseClaimsJws(token).getBody();
            return claims;
        } catch (Exception e) {

        }
        return null;
    }
}