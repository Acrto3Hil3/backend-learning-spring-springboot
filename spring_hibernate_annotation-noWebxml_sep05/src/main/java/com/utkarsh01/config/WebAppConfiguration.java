package com.utkarsh01.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.utkarsh01.entity.ProjectEntity;

public class WebAppConfiguration implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext config = new AnnotationConfigWebApplicationContext();
		config.register(ProjectEntity.class);
		config.setServletContext(servletContext);
		ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(config));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
	}
	
}
