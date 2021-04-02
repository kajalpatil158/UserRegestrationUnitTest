package com.tutorial;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	Scanner scanner = new Scanner(System.in);
	String firstName;

	public String getFirstName() {
		System.out.println("enter your first name");
		firstName = scanner.nextLine();
		return firstName;
	}

	// Checking valid first name
	public boolean validateName(String firstName) {
		Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]");
		Matcher matcher = pattern.matcher(firstName);
		boolean matches = matcher.find();
		if (matches) {
			System.out.println("name is valid");
		} else {
			System.out.println("name is Invalid");
		}
		return matches;
	}

	public static void main(String[] args) {
		{
			System.out.println("well Come In User Registration....");
			UserRegistration userRegistration = new UserRegistration();
			String firstName = userRegistration.getFirstName();
			userRegistration.validateName(firstName);
		}

	}
}
