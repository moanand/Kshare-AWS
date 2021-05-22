package com.mohit.lc.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.format.FormatterRegistry;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mohit.lc.formatter.CreditCardFormatter;
import com.mohit.lc.formatter.PhoneFormatter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = { "com.mohit.lc.controllers", "com.mohit.lc.services","com.mohit.lc.serviceImpl" })
@PropertySource("classpath:email.properties")
public class LoveCalculatorAppConfig implements WebMvcConfigurer {

	@Autowired
	private Environment env;

	@Bean
	ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

	@Bean
	MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("messages");
		return messageSource;
	}

	@Bean
	public LocalValidatorFactoryBean validator() {
		LocalValidatorFactoryBean factoryBean = new LocalValidatorFactoryBean();
		factoryBean.setValidationMessageSource(messageSource());
		return factoryBean;
	}

	@Bean
	public JavaMailSender getJavaMailSender() {

		JavaMailSenderImpl javaMailSenderImpl = new JavaMailSenderImpl();

		javaMailSenderImpl.setHost(env.getProperty("mail.host"));
		System.out.println(env.getProperty("mail.host"));
		javaMailSenderImpl.setUsername(env.getProperty("mail.username"));
		javaMailSenderImpl.setPassword(env.getProperty("mail.password"));
		javaMailSenderImpl.setPort(getIntProperties("mail.port"));

		javaMailSenderImpl.setJavaMailProperties(getMailProperties());

		return javaMailSenderImpl;
	}

	private int getIntProperties(String key) {
		String property = env.getProperty(key);
		return Integer.parseInt(property);

	}

	private Properties getMailProperties() {
		Properties properties = new Properties();
		properties.put(env.getProperty("mail.starttls"), true);
		properties.put(env.getProperty("mail.ssl"), env.getProperty("mail.host"));
		return properties;
	}

	@Override
	public void addFormatters(FormatterRegistry registry) {

		registry.addFormatter(new PhoneFormatter());
		registry.addFormatter(new CreditCardFormatter());
	}

	@Override
	public Validator getValidator() {
		return validator();
	}

}
