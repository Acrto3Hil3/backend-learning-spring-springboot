package com.utkarsh01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.utkarsh01.service.MyUserService;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringbootAopOct19Application implements CommandLineRunner {
	

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAopOct19Application.class, args);
	}
	@Autowired
	private MyUserService service;

	@Override
	public void run(String... args) throws Exception {
		service.display(1, "Rzmu");
		service.printDisplay(4.5f);
		//service.exception1();
		
	}

}
