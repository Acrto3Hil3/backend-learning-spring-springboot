package com.utkarsh01.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "jpa_address")
public class Address {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer addressId;
	
	private String location;
	private String city;
	
	public Address(String location, String city) {
		this.location = location;
		this.city = city;
	}
}
