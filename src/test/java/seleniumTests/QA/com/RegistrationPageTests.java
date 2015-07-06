package seleniumTests.QA.com;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pageObjects.RegistrationPageObjects;
import util.Drivers;
import abstractPackage.RegistrationPageLogic;

public class RegistrationPageTests {
	protected RegistrationPageLogic RPL;
	protected RegistrationPageObjects RPO;

	@Before
	public void setUp() {
		Drivers.openSafariDriver();
		RPL = new RegistrationPageLogic();
		RPO = new RegistrationPageObjects();
		RPL.openPage(RPO.REGISTRATION_URL);

	}

	@Test
	public void isFirstNameInputVisible() {
		assertTrue(RPL.isElementvisible(RPO.FIRST_NAME_INPUT));
	}

	@Test
	public void isLastNameInputVisible() {
		assertTrue(RPL.isElementvisible(RPO.LAST_NAME_INPUT));
	}

	@Test
	public void isMarritalStatusButtonVisible() {
		assertTrue(RPL.isElementvisible(RPO.MARITAL_STATUS_BUTTON));
	}

	@Test
	public void isHobbyButtonVisible() {
		assertTrue(RPL.isElementvisible(RPO.HOBBY_BUTTON));
	}

	@Test
	public void isCountryDropdownVisible() {
		assertTrue(RPL.isElementvisible(RPO.COUNTRY));
	}

	@Test
	public void isMonthDropdownVisible() {
		assertTrue(RPL.isElementvisible(RPO.MONTH));
	}

	@Test
	public void isDayDropdownVisible() {
		assertTrue(RPL.isElementvisible(RPO.DAY));
	}

	@Test
	public void isYearDropdownVisible() {
		assertTrue(RPL.isElementvisible(RPO.YEAR));
	}

	@Test
	public void isPhoneNumberInputVisible() {
		assertTrue(RPL.isElementvisible(RPO.PHONE_NUMBER));
	}

	@Test
	public void isUserNameInputVisible() {
		assertTrue(RPL.isElementvisible(RPO.USER_NAME));
	}

	@Test
	public void isEmailInputVisible() {
		assertTrue(RPL.isElementvisible(RPO.EMAIL));
	}

	@Test
	public void isDescriptionInputVisible() {
		assertTrue(RPL.isElementvisible(RPO.DESCRIPTION));
	}

	@Test
	public void isPasswordInputVisible() {
		assertTrue(RPL.isElementvisible(RPO.PASSWORD_INPUT));
	}

	@Test
	public void isConfirmPasswordInputVisible() {
		assertTrue(RPL.isElementvisible(RPO.CONFIRM_PASSWORD_INPUT));
	}

	@Test
	public void isSubmitButtonVisible() {
		assertTrue(RPL.isElementvisible(RPO.SUBMIT_REGISTRATION));
	}

	@Test
	public void isRegistrationButtonClickable() {
		assertTrue(RPL.isLinkClickable(RPO.SUBMIT_REGISTRATION));
	}

	@Test
	public void tryRegisteringAknownUser() {
		RPL.register(
				RPO.FIRST_NAME_INPUT, "Dev", 
				RPO.LAST_NAME_INPUT, "User",
				RPO.MARITAL_STATUS_BUTTON, 
				RPO.HOBBY_BUTTON, 
				RPO.COUNTRY,"United States", 
				RPO.DAY, "25", 
				RPO.YEAR, "1989",
				RPO.PHONE_NUMBER, "5035551285", 
				RPO.USER_NAME, "Dev1",
				RPO.EMAIL, "BRRRRATTT@catalystitservices.com", 
				RPO.DESCRIPTION,"All the Stuffs you needs to know breh!", 
				RPO.PASSWORD_INPUT,"Workforfood33@!", 
				RPO.CONFIRM_PASSWORD_INPUT,"Workforfood33@!", 
				RPO.SUBMIT_REGISTRATION
				);
	}

	@Test
	public void passwordStrengthVeryWeak() throws InterruptedException {
		RPL.verifyPasswordStrengthBar(
				RPO.PASSWORD_INPUT,
				RPO.CONFIRM_PASSWORD_INPUT, 
				RPO.VERY_WEAK_PASSWORD,
				RPO.VERY_WEAK_STRENGTH
				 );
		
	}
	@Test
	public void passwordStrengthWeak() throws InterruptedException {
		RPL.verifyPasswordStrengthBar(
				RPO.PASSWORD_INPUT,
				RPO.CONFIRM_PASSWORD_INPUT, 
				RPO.WEAK_PASSWORD,
				RPO.WEAK_STRENGTH
				 );
		
	}
	@Test
	public void passwordStrengthMedium() throws InterruptedException {
		RPL.verifyPasswordStrengthBar(
				RPO.PASSWORD_INPUT,
				RPO.CONFIRM_PASSWORD_INPUT, 
				RPO.MEDIUM_PASSWORD,
				RPO.MEDIUM_STRENGTH
				 );
		
	}
	@Test
	public void passwordStrengthStrong() throws InterruptedException {
		RPL.verifyPasswordStrengthBar(
				RPO.PASSWORD_INPUT,
				RPO.CONFIRM_PASSWORD_INPUT, 
				RPO.STRONG_PASSWORD,
				RPO.STRONG_STRENGTH
				 );
		
	}

	@After
	public void closeShop() {
		RPL.closeThisPage();
	}
}
