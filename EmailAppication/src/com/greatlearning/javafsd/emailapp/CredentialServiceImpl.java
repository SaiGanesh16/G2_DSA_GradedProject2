package com.greatlearning.javafsd.emailapp;

import com.greatlearning.javafsd.emailapp.model.Employee;
import com.greatlearning.javafsd.emailapp.service.ICredentialService;

import com.greatlearning.javafsd.emailapp.service.PasswordGenerator;
public class CredentialServiceImpl implements ICredentialService {
	

	public String generatePassword() {
		PasswordGenerator generator = new PasswordGenerator();
		String password = generator.generatePassword();
		return password;
	}
	public String generateEmailAddress(Employee employee) {
		String firstName = employee.getFirstName();
		String lastName = employee.getLastName();
		String department = employee.getDepartment();
		String emailAddress = firstName.toLowerCase()+lastName.toLowerCase()+"@"+department.toLowerCase()+".gl.com";
		employee.setEmailAddress(emailAddress);
		return emailAddress;
	}
	
	public void displayCredentials(Employee employee) {
		
		String firstName = employee.getFirstName();
		String emailAdd = employee.getEmailAddress();
		String pwd =employee.getPassword();
		System.out.println("Dear "+firstName+", your generated credentials are as follows");
		System.out.println("Email ---->  "+emailAdd);
		System.out.println("Password ---->  "+pwd);
	}
	
}
