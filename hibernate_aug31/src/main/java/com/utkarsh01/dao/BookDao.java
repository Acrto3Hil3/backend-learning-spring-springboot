package com.utkarsh01.dao;

import java.util.List;

import com.utkarsh01.entity.Library;

public interface BookDao {
	public void addBook(Library lb);
	public void updateBookDetails(Library lb);
	public Library viewBook(Integer bookNo);
	public void deleteBook(Integer bookNo);
	public List<Library> allBookDetails();
	public List<Library> basedOnPrice(Double bPrice);
	public Long noOfBooks();
	public Double maxPriceBook();
	public List<Library> booksBySqlQuery();
	public List<Library> priceBySql(Double bPrice);
	public List<Object[]> allBooksWithAttribute_Hql();
	public List<Object[]> allBooksWIthAttribute_Sql();
	
}
