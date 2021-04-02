package com.tutorial;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	Scanner scanner = new Scanner(System.in);
	String firstName;
	String lastName;
	String email;
	String mobileNumber;

	// Get User Input For Validation
	public String getFirstName() {
		System.out.println("Enter your first name");
		firstName = scanner.nextLine();
		return firstName;
	}

	// Get User Input For Validation
	public String getLastName() {
		System.out.println("Enter your last name");
		lastName = scanner.nextLine();
		return lastName;
	}

	//
	public String getEmail() {
		System.out.println("Enter Email -");
		email = scanner.nextLine();
		return email;
	}

	public String getmobileNumber() {
		System.out.println("Enter Mobile Number -");
		email = scanner.next();
		return mobileNumber;
	}

	// Checking valid first name
	public boolean validateName(String firstName) {
		Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]");
		Matcher matcher = pattern.matcher(firstName);
		boolean matches = matcher.find();
		if (matches) {
			System.out.println("First Name is valid");
		} else {
			System.out.println("First Name is Invalid");
		}
		return matches;
	}

	// Validation for Last Name
	public boolean validateLastName(String lastName) {
		Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]");
		Matcher matcher = pattern.matcher(lastName);
		boolean matches = matcher.find();
		if (matches) {
			System.out.println("Last Name Is Valid");
		} else {
			System.out.println("Last Name Is Invalid");
		}
		return matches;
	}

	// Checking valid Email
	public boolean validateEmail(String email) {
		Pattern pattern = Pattern.compile(
				"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		Matcher matcher = pattern.matcher(email);
		boolean matches = matcher.find();
		if (matches) {
			System.out.println("Email Is Valid");
		} else {
			System.out.println("Email Is Invalid");
		}
		return matches;
	}

	// Check Validation For Mobile Number
	public boolean validateMobileNumber(String mobileNumber) {
		Pattern pattern = Pattern.compile("^[0-9]{2}[ ][0-9]{10}$");
		Matcher matcher = pattern.matcher(mobileNumber);
		boolean matches = matcher.find();
		if (matches) {
			System.out.println("Its Valid Mobile Number");
		} else {
			System.out.println("Its InValid Mobile Number");
		}
		return matches;
	}

	// Call All Methods Here..
	public static void main(String[] args) {
		{
			System.out.println("Well Come In User Registration....");
			UserRegistration userRegistration = new UserRegistration();
			String firstName = userRegistration.getFirstName();
			userRegistration.validateName(firstName);
			String lastName = userRegistration.getLastName();
			userRegistration.validateLastName(lastName);
			String email = userRegistration.getEmail();
			userRegistration.validateEmail(email);
			String mobileNumber = userRegistration.getmobileNumber();
			userRegistration.validateMobileNumber(mobileNumber);
		}
	}
}
