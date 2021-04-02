package com.tutorial;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	private UserRegistration userRegistration;

	public UserRegistrationTest() {
		userRegistration = new UserRegistration();
	}
	//Unit Test For First Name
	@Test
	public void validateName() {
		String name = "Kajal";
		boolean result = userRegistration.validateName(name);
		Assert.assertTrue(result);
	}
	//Unit Test For Last Name
	@Test
	public void validateLastName() {
		String lastname = "Patil";
		boolean result = userRegistration.validateLastName(lastname);
		Assert.assertTrue(result);
	}
	//Unit Test For Email
	@Test
	public void validateEmail() {
		String email = "Kajalpatil158@gmail.com";
		boolean result = userRegistration.validateEmail(email);
		Assert.assertTrue(result);
	}
		@Test
		public void validateMobileNumber() {
			String mobileNumber = "91 8600208237";
			boolean result = userRegistration.validateMobileNumber(mobileNumber);
			Assert.assertTrue(result);
	}
		@Test
		public void validatePassword() {
			String password = "K@jal158p";
			boolean result = userRegistration.validateMobileNumber(password);
			Assert.assertTrue(result);
	}
}