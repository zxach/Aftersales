package com.example.as;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.as.mapper")
public class AftersalesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AftersalesApplication.class, args);
	}

}
