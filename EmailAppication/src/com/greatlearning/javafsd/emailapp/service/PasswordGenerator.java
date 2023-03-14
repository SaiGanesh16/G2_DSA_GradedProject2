package com.greatlearning.javafsd.emailapp.service;
import java.util.Random;
public class PasswordGenerator {
	public String generatePassword() {
		int passwordLength =10;
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String characters = "!@#$%^&*()_+";
		StringBuilder password = new StringBuilder();
		Random random = new Random();
		String combinedString = capitalLetters + smallLetters+ numbers + characters;

		for ( int i =1;i<passwordLength;i++) {
			int index = random.nextInt(combinedString.length());

			password.append(combinedString.charAt(index));

		}

		return password.toString();
	}

}
