package com.utkarsh01.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service @Slf4j
public class MyUserService {
	
	public void display(Integer id, String name) {
		log.info("It's Me!!");
	}

	public void printDisplay(Float amount) {
		log.info("I M in print method..");
	}
	
	public void exception1() {
		throw new RuntimeException("Hello, How are you me exception");
	}
}
