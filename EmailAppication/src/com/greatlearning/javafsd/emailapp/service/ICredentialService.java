package com.greatlearning.javafsd.emailapp.service;
import com.greatlearning.javafsd.emailapp.model.Employee;

public interface ICredentialService {
	String generatePassword();
	String generateEmailAddress(Employee employee);
	void displayCredentials(Employee employee);
}
