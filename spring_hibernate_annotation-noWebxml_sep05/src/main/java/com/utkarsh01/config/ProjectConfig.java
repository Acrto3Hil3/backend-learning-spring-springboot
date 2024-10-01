package com.utkarsh01.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import com.utkarsh01.dao.ProjectDaoImp;
import com.utkarsh01.entity.ProjectEntity;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.utkarsh01"})
public class ProjectConfig {
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dtSource=new DriverManagerDataSource();
		dtSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dtSource.setUrl("jdbc:mysql://localhost/springpractise");
		dtSource.setUsername("root");
		dtSource.setPassword("1234");
		return dtSource;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactoryBean() {
		LocalSessionFactoryBean sessFactBean=new LocalSessionFactoryBean();
		sessFactBean.setDataSource(dataSource());
		Properties properties=new Properties();
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.format_sql", "true");
		sessFactBean.setHibernateProperties(properties);
		sessFactBean.setAnnotatedClasses(ProjectEntity.class);
		return sessFactBean;
	}
	
	@Bean
	public HibernateTransactionManager hibernaManager() {
		HibernateTransactionManager hbtm=new HibernateTransactionManager();
		hbtm.setSessionFactory(sessionFactoryBean().getObject());
		return hbtm;
	}
	
	@Bean
	public ProjectDaoImp daoImp() {
		ProjectDaoImp dao=new ProjectDaoImp();
		dao.setSessionFactory(sessionFactoryBean().getObject());
		return dao;
	}
	
	@Bean
	public ResourceBundleMessageSource messageSource() {
		ResourceBundleMessageSource rbms=new ResourceBundleMessageSource();
		rbms.setBasename("error");
		return rbms;
	}
	
	@Bean
	public LocalValidatorFactoryBean valFactoryBean() {
		LocalValidatorFactoryBean validatorBean=new LocalValidatorFactoryBean();
		validatorBean.setValidationMessageSource(messageSource().getParentMessageSource());
		return validatorBean;
	}
}
