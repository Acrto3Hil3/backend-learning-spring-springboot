package com.utkarsh01.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	public void m1() {
		throw new NullPointerException("Null Pinter   exception");
	}
}
