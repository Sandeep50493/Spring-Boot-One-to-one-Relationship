package com.itSolution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.itSolution.service.PersonService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	       PersonService personService = context.getBean(PersonService.class);
	       
	     //  personService.savePerson();
	      personService.getPersonRecord(); 
	      personService.getPassportRecord();
	     //personService.deletePersonRecord(); 
	}

}
