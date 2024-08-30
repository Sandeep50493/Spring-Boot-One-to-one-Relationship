package com.itSolution.service;

import java.time.LocalDate;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itSolution.entity.Passport;
import com.itSolution.entity.Person;
import com.itSolution.repo.PassportRepo;
import com.itSolution.repo.PersonRepo;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepo personRepo;
	@Autowired
	private PassportRepo passportRepo;
	
	
	
	public void savePerson() {
		Person person=new Person();
		person.setPersonName("Sandeep Kumar");
		person.setPersonDob(LocalDate.now().minusYears(20));
		person.setPersonGender("Male");
		
		Passport  passport=new Passport();
		passport.setPassportNum("JZTPK1917H");
		passport.setIssuedDate(LocalDate.now());
		passport.setExpDate(LocalDate.now().plusYears(10));
		
		
		person.setPassport(passport);
		passport.setPerson(person);
		
		personRepo.save(person);
			
	}
	public void getPersonRecord() {
		personRepo.findById(1);	
	}
	public void getPassportRecord() {
		passportRepo.findById(1);
	}
	public void deletePersonRecord() {
		personRepo.deleteById(1);
	}

}
