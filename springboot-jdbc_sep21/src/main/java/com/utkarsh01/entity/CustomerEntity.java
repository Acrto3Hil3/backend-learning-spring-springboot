package com.utkarsh01.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CustomerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long custId;
	private String custName;
	private String custAddress;
	private Long custMobileNo;
	private Double custBill;

	public CustomerEntity(String custName, String custAddress, Long custMobileNo, Double custBill) {
		this.custName = custName;
		this.custAddress = custAddress;
		this.custMobileNo = custMobileNo;
		this.custBill = custBill;
	}

}
