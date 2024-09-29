package com.utkarsh01.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Library {
	private Integer bookNo;
	private String bookName;
	private String bookAuthor;
	private String medium;
	private Integer bookQuantity;
	private Double bookPrice;
	
	public Library(String bookName, String bookAuthor, String medium, Integer bookQuantity, Double bookPrice) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.medium = medium;
		this.bookQuantity = bookQuantity;
		this.bookPrice = bookPrice;
	}
	
}
