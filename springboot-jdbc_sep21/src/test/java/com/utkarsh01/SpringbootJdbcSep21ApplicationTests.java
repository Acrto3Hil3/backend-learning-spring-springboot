package com.utkarsh01;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.utkarsh01.entity.CustomerEntity;
import com.utkarsh01.repository.CustomerRepository;

@SpringBootTest
class SpringbootJdbcSep21ApplicationTests {

	@Autowired
	private CustomerRepository custRepo;
	
	//show all method
	@Test
	void testGetAllCust() {
		List<CustomerEntity> cust=custRepo.findAll();
		cust.forEach(c->System.out.println(c));
		Assertions.assertEquals(1,cust.size());
	}

	// insert method
	
//	@Test
//	void testInsertCust() {
//		CustomerEntity cust=new CustomerEntity("Suresh kumar", "Punjab", 700237885l, 65000d);
//		cust=custRepo.save(cust);
//		System.out.println("Inserted...");
//		Assertions.assertNotNull(cust.getCustId());
//		Assertions.assertTrue(cust.getCustId()>0);
//}
	
//	@Test
//	void testUpdate() {
//		Optional<CustomerEntity> optCust=custRepo.findById(1l);
//		CustomerEntity cust=null;
//		if(optCust.isPresent()) {
//			cust=optCust.get();
//			cust.setCustAddress("Hyd");
//		}
//		cust=custRepo.save(cust);
//		System.out.println("updated ....");
//		System.out.println(cust);
//		Assertions.assertEquals("Hyd", cust.getCustAddress());
//	}
	
//	@Test
//	void testDeleteCust() {
//		custRepo.deleteById(2l);
//		System.out.println("Deletion is successfully done..");
//	}
	
//	@Test
//	void testGetOneCust() {
//		Optional<CustomerEntity> optCust=custRepo.findById(1l);
//		CustomerEntity cust=null;
//		if(optCust.isPresent()) {
//			cust=optCust.get();
//		}
//		System.out.println(cust);
//		System.out.println(cust+" is Searched...");
//		Assertions.assertTrue(cust.getCustId()>0);
//	}
	
}
