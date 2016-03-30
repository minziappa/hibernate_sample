package io.sample.hibernate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.sample.hibernate.service.SampleService;

public class HibernateMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
		SampleService sampleService = (SampleService) context.getBean("sampleService");
		sampleService.getAll();
	}

}