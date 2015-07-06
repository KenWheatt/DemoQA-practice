package seleniumTests.QA.com;

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
		RPL = new RegistrationPageLogic();
        Drivers.openSafariDriver();
		RPO = new RegistrationPageObjects();
		RPL.openPage(RPO.REGISTRATION_URL);

	}
	@Test
	public void isFirstNameInputVisible(){
		RPL.isElementvisible(RPO.FIRST_NAME_INPUT );
	}
	@Test
	public void isLastNameInputVisible(){
		RPL.isElementvisible(RPO.LAST_NAME_INPUT );
	}
	@Test
	public void isMarritalStatusButtonVisible(){
		RPL.isElementvisible(RPO.MARITAL_STATUS_BUTTON );
	}
	@Test
	public void isHobbyButtonVisible(){
		RPL.isElementvisible(RPO.HOBBY_BUTTON );
	}
	@Test
	public void isCountryDropdownVisible(){
		RPL.isElementvisible(RPO.COUNTRY );
	}
	@Test
	public void isMonthDropdownVisible(){
		RPL.isElementvisible(RPO.MONTH );
	}
	@Test
	public void isDayDropdownVisible(){
		RPL.isElementvisible(RPO.DAY );
	}
	@Test
	public void isYearDropdownVisible(){
		RPL.isElementvisible(RPO.YEAR );
	}
	@Test
	public void isPhoneNumberInputVisible(){
		RPL.isElementvisible(RPO.PHONE_NUMBER );
	}
	@Test
	public void isUserNameInputVisible(){
		RPL.isElementvisible(RPO.USER_NAME );
	}
	@Test
	public void isEmailInputVisible(){
		RPL.isElementvisible(RPO.EMAIL );
	}
	@Test
	public void isDescriptionInputVisible(){
		RPL.isElementvisible(RPO.DESCRIPTION );
	}
	@Test
	public void isPasswordInputVisible(){
		RPL.isElementvisible(RPO.PASSWORD_INPUT );
	}
	@Test
	public void isConfirmPasswordInputVisible(){
		RPL.isElementvisible(RPO.CONFIRM_PASSWORD_INPUT );
	}
	@Test
	public void isSubmitButtonVisible(){
		RPL.isElementvisible(RPO.SUBMIT_REGISTRATION );
	}
	@Test
	public void isRegistrationButtonClickable(){
		RPL.isLinkClickable(RPO.SUBMIT_REGISTRATION);
	}
	
	@After
	public void closeShop() {
		RPL.closeThisPage();
	}
}
