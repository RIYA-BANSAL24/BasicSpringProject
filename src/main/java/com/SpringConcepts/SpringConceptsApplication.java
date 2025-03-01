package com.SpringConcepts;

import com.SpringConcepts.component.DemoBean;
import com.SpringConcepts.component.EmployeeBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com/SpringConcepts/component")
@SpringBootApplication
public class SpringConceptsApplication {
	public static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);

	public static void main(String[] args) {
		logger.debug("Welcome to My First Spring Project");
		ApplicationContext context =SpringApplication.run (SpringConceptsApplication.class, args);
		logger.debug("Checking Context: {}",context.getBean (DemoBean.class));
		logger.debug("\n*** adding EmployeeBean and DepartmentBean ***");
		EmployeeBean employeeBean =context.getBean(EmployeeBean.class);
		employeeBean.setEid(100);
		employeeBean.setEname("Spring Framework");
		employeeBean.showEmployeeDetails();
	}
}
