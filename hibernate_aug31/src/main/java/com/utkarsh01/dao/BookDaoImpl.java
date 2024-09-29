package com.utkarsh01.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.utkarsh01.entity.Library;

public class BookDaoImpl implements BookDao {

	private static Session sess = null;

	static {
		Configuration config = new Configuration();
		config.configure("/hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		sess = factory.openSession();
	}

	@Override
	public void addBook(Library lb) {
		Transaction tx = sess.beginTransaction();
		sess.persist(lb);
		tx.commit();

	}

	@Override
	public void updateBookDetails(Library lb) {
		Transaction tx = sess.beginTransaction();
		sess.persist(lb);
		tx.commit();
	}

	@Override
	public Library viewBook(Integer bookNo) {
		Library lb = sess.get(Library.class, bookNo);
		return lb;
	}

	@Override
	public void deleteBook(Integer bookNo) {
		Transaction tx = sess.beginTransaction();
		Library lb = viewBook(bookNo);
		sess.remove(lb);
		tx.commit();
	}

	@Override
	public List<Library> allBookDetails() {
		Query<Library> query = sess.createQuery("from Library");
		List<Library> all = query.getResultList();
		return all;
	}

	@Override
	public List<Library> basedOnPrice(Double bprice) {
		Query<Library> query = sess.createQuery("from Library where bookPrice=?1"); // positional parameter used for
																					// dyamic parameter (:?1) if we want
																					// more parameter increase no.
		query.setParameter(1, bprice);
		List<Library> lb = query.getResultList();
		return lb;
	}

	@Override
	public Long noOfBooks() {
		Query<Library> query = sess.createQuery("select count(*) from Library");
		Long count = query.getResultCount();
		return count;
	}

	@Override
	public Double maxPriceBook() {
		Query<Double> query = sess.createQuery("select max(bookPrice) from Library");
		Double mprice = query.getSingleResult(); // it give single result in query form
		return mprice;
	}

	@Override
	public List<Library> booksBySqlQuery() {
		Query<Library> query = sess.createNativeQuery("Select * from library01").addEntity(Library.class);
		List<Library> lb = query.getResultList();
		return lb;
	}

	@Override
	public List<Library> priceBySql(Double bPrice) {
		Query<Library> query = sess.createNativeQuery("select * from library01 where bprice=:price")
				.addEntity(Library.class);
		query.setParameter("price", bPrice);
		List<Library> lb = query.getResultList();
		return lb;
	}

	@Override
	public List<Object[]> allBooksWithAttribute_Hql() {
		Query<Object[]> query=sess.createQuery("select bookNo,bookName,bookAuthor,medium,bookQuantity from Library");
		List<Object[]> lb=query.list();
		return lb;
	}

	@Override
	public List<Object[]> allBooksWIthAttribute_Sql() {
		Query<Object[]> query=sess.createNativeQuery("select bno,bname,bqty,language from library01");
		List<Object[]> lb=query.list();
		return lb;
	}

}
