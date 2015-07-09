package seleniumTests.QA.com;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pageObjects.RegistrationPageObjects;
import supportingObjects.Registration;
import util.Drivers;
import abstractPackage.RegistrationPageLogic;

public class RegistrationPageTests {
	protected RegistrationPageLogic RPL;

	@Before
	public void setUp() {
		Drivers.openSafariDriver();
		RPL = new RegistrationPageLogic();
		RPL.openPage(RegistrationPageObjects.REGISTRATION_URL);

	}

	@Test
	public void isFirstNameInputVisible() {
		assertTrue(RPL
				.isElementvisible(RegistrationPageObjects.FIRST_NAME_INPUT));
	}

	@Test
	public void isLastNameInputVisible() {
		assertTrue(RPL
				.isElementvisible(RegistrationPageObjects.LAST_NAME_INPUT));
	}

	@Test
	public void isMarritalStatusButtonVisible() {
		assertTrue(RPL
				.isElementvisible(RegistrationPageObjects.MARITAL_STATUS_BUTTON));
	}

	@Test
	public void isHobbyButtonVisible() {
		assertTrue(RPL.isElementvisible(RegistrationPageObjects.HOBBY_BUTTON));
	}

	@Test
	public void isCountryDropdownVisible() {
		assertTrue(RPL.isElementvisible(RegistrationPageObjects.COUNTRY));
	}

	@Test
	public void isMonthDropdownVisible() {
		assertTrue(RPL.isElementvisible(RegistrationPageObjects.MONTH));
	}

	@Test
	public void isDayDropdownVisible() {
		assertTrue(RPL.isElementvisible(RegistrationPageObjects.DAY));
	}

	@Test
	public void isYearDropdownVisible() {
		assertTrue(RPL.isElementvisible(RegistrationPageObjects.YEAR));
	}

	@Test
	public void isPhoneNumberInputVisible() {
		assertTrue(RPL.isElementvisible(RegistrationPageObjects.PHONE_NUMBER));
	}

	@Test
	public void isUserNameInputVisible() {
		assertTrue(RPL.isElementvisible(RegistrationPageObjects.USER_NAME));
	}

	@Test
	public void isEmailInputVisible() {
		assertTrue(RPL.isElementvisible(RegistrationPageObjects.EMAIL));
	}

	@Test
	public void isDescriptionInputVisible() {
		assertTrue(RPL.isElementvisible(RegistrationPageObjects.DESCRIPTION));
	}

	@Test
	public void isPasswordInputVisible() {
		assertTrue(RPL.isElementvisible(RegistrationPageObjects.PASSWORD_INPUT));
	}

	@Test
	public void isConfirmPasswordInputVisible() {
		assertTrue(RPL
				.isElementvisible(RegistrationPageObjects.CONFIRM_PASSWORD_INPUT));
	}

	@Test
	public void isSubmitButtonVisible() {
		assertTrue(RPL
				.isElementvisible(RegistrationPageObjects.SUBMIT_REGISTRATION));
	}

	@Test
	public void isRegistrationButtonClickable() {
		assertTrue(RPL
				.isLinkClickable(RegistrationPageObjects.SUBMIT_REGISTRATION));
	}

	@Test
	public void tryRegisteringAknownUser() {
		Registration registration = registrationWithDefaultValidValues();
		RPL.register(registration);
	}

	@Test
	public void tryRegisteringAknownUserWhenConfirmPasswordDoesNotMatch() {
		Registration registration = registrationWithDefaultValidValues();
		registration.setConfirmpassword("Something Else");
		RPL.register(registration);
		// assert correct error message appears or something
	}

	@Test
	public void passwordStrengthVeryWeak() throws InterruptedException {
		RPL.verifyPasswordStrengthBar(RegistrationPageObjects.PASSWORD_INPUT,
				RegistrationPageObjects.CONFIRM_PASSWORD_INPUT,
				RegistrationPageObjects.VERY_WEAK_PASSWORD,
				RegistrationPageObjects.VERY_WEAK_STRENGTH);

	}

	@Test
	public void passwordStrengthWeak() throws InterruptedException {
		RPL.verifyPasswordStrengthBar(RegistrationPageObjects.PASSWORD_INPUT,
				RegistrationPageObjects.CONFIRM_PASSWORD_INPUT,
				RegistrationPageObjects.WEAK_PASSWORD,
				RegistrationPageObjects.WEAK_STRENGTH);

	}

	@Test
	public void passwordStrengthMedium() throws InterruptedException {
		RPL.verifyPasswordStrengthBar(RegistrationPageObjects.PASSWORD_INPUT,
				RegistrationPageObjects.CONFIRM_PASSWORD_INPUT,
				RegistrationPageObjects.MEDIUM_PASSWORD,
				RegistrationPageObjects.MEDIUM_STRENGTH);

	}

	@Test
	public void passwordStrengthStrong() throws InterruptedException {
		RPL.verifyPasswordStrengthBar(RegistrationPageObjects.PASSWORD_INPUT,
				RegistrationPageObjects.CONFIRM_PASSWORD_INPUT,
				RegistrationPageObjects.STRONG_PASSWORD,
				RegistrationPageObjects.STRONG_STRENGTH);

	}

	@After
	public void closeShop() {
		RPL.closeThisPage();
	}

	private Registration registrationWithDefaultValidValues() {
		Registration registration = new Registration();
		registration.setFirstname("Dev");
		// "User",
		// "United States",
		// "25",
		// "1989",
		// "5035551285",
		// "Dev1",
		// "BRRRRATTT@catalystitservices.com",
		// "All the Stuffs you needs to know breh!",
		// "Workforfood33@!",
		// "Workforfood33@!"
		RPL.register(registration);
		return registration;
	}
}
