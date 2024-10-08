package com.utkarsh01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class SpringBootEmployeeSep19Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmployeeSep19Application.class, args);
	}

}
