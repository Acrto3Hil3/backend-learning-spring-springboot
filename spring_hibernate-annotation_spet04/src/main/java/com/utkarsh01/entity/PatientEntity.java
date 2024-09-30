package com.utkarsh01.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class PatientEntity {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer pId;
	private String pName;
	private Integer pAge;
	private String pAddress;
	private String pBloodGroup;
	private Double pBill;
	
	public PatientEntity(String pName, Integer pAge, String pAddress, String pBloodGroup, Double pBill) {
		this.pName = pName;
		this.pAge = pAge;
		this.pAddress = pAddress;
		this.pBloodGroup = pBloodGroup;
		this.pBill = pBill;
	}
}
