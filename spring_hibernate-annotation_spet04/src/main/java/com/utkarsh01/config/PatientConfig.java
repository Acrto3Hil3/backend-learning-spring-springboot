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

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = { "com.utkarsh01" })
public class PatientConfig {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dtSource = new DriverManagerDataSource();
		dtSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dtSource.setUrl("jdbc:mysql://localhost/springpractise");
		dtSource.setUsername("root");
		dtSource.setPassword("1234");
		return dtSource;
	}

	@Bean
	public LocalSessionFactoryBean sessFactBean() {
		LocalSessionFactoryBean sfBean = new LocalSessionFactoryBean();
		sfBean.setDataSource(dataSource());
		Properties properties = new Properties();
		properties.setProperty("hibernate.show_sql", "false");
		properties.setProperty("hibernate.format_sql", "true");
		sfBean.setHibernateProperties(properties);
		sfBean.setAnnotatedClasses(PatientEntity.class);
		return sfBean;
	}

	@Bean
	public HibernateTransactionManager transManager() {
		HibernateTransactionManager htm = new HibernateTransactionManager();
		htm.setSessionFactory(sessFactBean().getObject());
		return htm;
	}

	@Bean
	public PatientDaoImp daoImp() {
		PatientDaoImp dao = new PatientDaoImp();
		dao.setSessionFactory(sessFactBean().getObject());
		return dao;
	}

}
