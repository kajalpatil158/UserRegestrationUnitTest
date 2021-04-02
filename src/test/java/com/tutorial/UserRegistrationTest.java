package com.tutorial;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	private UserRegistration userRegistration;

	public UserRegistrationTest() {
		userRegistration = new UserRegistration();
	}

	@Test
	public void validateName() {
		String name = "Kajal";
		boolean result = userRegistration.validateName(name);
		Assert.assertTrue(result);
	}
}