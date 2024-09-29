package com.utkarsh01.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.utkarsh01.dao.PatientDaoImp;
import com.utkarsh01.entity.PatientEntity;

@Configuration @EnableTransactionManagement
@ComponentScan(basePackages= {"com.utkarsh01"})
public class PatientConfig {
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost/springpractise");
		dataSource.setUsername("root");
		dataSource.setPassword("1234");
		return dataSource;
	}
	
	@Bean
	public LocalSessionFactoryBean factoryBean() {
		LocalSessionFactoryBean sessionFactory=new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		Properties properties=new Properties();
		properties.setProperty("hibernate.show_sql", "false");
		properties.setProperty("hibernate.format_sql", "true");
		sessionFactory.setHibernateProperties(properties);
		sessionFactory.setAnnotatedClasses(PatientEntity.class);
		return sessionFactory;
	}
	
	@Bean
	public HibernateTransactionManager transactionManager() {
		HibernateTransactionManager transactionManager=new HibernateTransactionManager();
		transactionManager.setSessionFactory(factoryBean().getObject());
		return transactionManager;
	}
	
	@Bean
	public PatientDaoImp dao() {
		PatientDaoImp dao=new PatientDaoImp();
		dao.setSessionFactory(factoryBean().getObject());
		return dao;
	}
	
}
