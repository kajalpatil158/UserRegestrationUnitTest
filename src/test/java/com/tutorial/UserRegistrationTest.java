package com.tutorial;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UserRegistrationTest {

	private UserRegistration userRegistration;

	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();

	public UserRegistrationTest() {
		userRegistration = new UserRegistration();
	}

	// Unit Test For First Name
	@Test
	public void validateName() {
		String name = "Kajal";
		boolean result = userRegistration.validateName(name);
		Assert.assertTrue(result);
	}

	// Unit Test For Invalid First Name
	@Test
	public void validateInvalidName() {
		exceptionRule.expect(UserRegistrationException.class);
		exceptionRule.expectMessage("First Name is Invalid");

		String name = "kajal";
		userRegistration.validateName(name);
	}

	// Unit Test For Last Name
	@Test
	public void validateLastName() {
		String lastname = "Patil";
		boolean result = userRegistration.validateLastName(lastname);
		Assert.assertTrue(result);
	}

	// Unit Test For Invalid Last Name
	@Test
	public void validateInvalidLastName() {
		exceptionRule.expect(UserRegistrationException.class);
		exceptionRule.expectMessage("Last Name is Invalid");

		String lastName = "patil";
		userRegistration.validateLastName(lastName);
	}

	// Unit Test For Email
	@Test
	public void validateEmail() {
		String email = "Kajalpatil158@gmail.com";
		boolean result = userRegistration.validateEmail(email);
		Assert.assertTrue(result);
	}

	// Unit Test For Invalid Email
	@Test
	public void validateInvalidEmail() {
		exceptionRule.expect(UserRegistrationException.class);
		exceptionRule.expectMessage("Email is Invalid");

		String email = "kajalpatil@gmail.com";
		userRegistration.validateEmail(email);
	}

	@Test
	public void validateMobileNumber() {
		String mobileNumber = "91 8600208237";
		boolean result = userRegistration.validateMobileNumber(mobileNumber);
		Assert.assertTrue(result);
	}

	// Unit Test For Invalid Mobile Number
	@Test
	public void validateInvalidMobileNumber() {
		exceptionRule.expect(UserRegistrationException.class);
		exceptionRule.expectMessage("Mobile Number is Invalid");
		String mobileNumber = "8600987654";
		userRegistration.validateEmail(mobileNumber);
	}

	@Test
	public void validatePassword() {
		String password = "K@jal158p";
		boolean result = userRegistration.validatePassword(password);
		Assert.assertTrue(result);
	}

	// Unit Test For Invalid Password
	@Test
	public void validateInvalidPassword() {
		exceptionRule.expect(UserRegistrationException.class);
		exceptionRule.expectMessage("Password is Invalid");
		String password = "k123pdf2";
		userRegistration.validateEmail(password);
	}
}