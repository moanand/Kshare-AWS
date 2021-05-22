
package com.mohit.lc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoveCalculatorAppInitializer // implements WebApplicationInitializer
{

	// @Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(LoveCalculatorAppConfig.class);

		DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
		Dynamic addServlet = servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
		addServlet.setLoadOnStartup(1);
		addServlet.addMapping("/mywebsite.com/*");
	}

}
