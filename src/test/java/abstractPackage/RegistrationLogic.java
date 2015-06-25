package abstractPackage;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

public class RegistrationLogic extends AbstractPage{
	public RegistrationLogic(){}
	public void verifyPasswordStrengthBar(String input, String strength)
			throws InterruptedException {
		goToPage(REGISTRATION_LINK, "http://demoqa.com/registration/");
		type(PASSWORD_INPUT, input);
		badWait();
		type(CONFIRM_PASSWORD_INPUT, input);
		badWait();
		String passwordMeter = driver.findElement(
				By.id("piereg_passwordStrength")).getAttribute("class");
		assertEquals(passwordMeter, strength);
	}
	public void register() {
		goToPage(REGISTRATION_LINK, "http://demoqa.com/registration/");
		type(FIRST_NAME_INPUT, "User");
		type(LAST_NAME_INPUT, "Dev");
		clickOn(MARITAL_STATUS_BUTTON);
		clickOn(HOBBY_BUTTON);
		selectDropdown(COUNTRY, "United States");
		selectDropdown(MONTH, "5");
		selectDropdown(DAY, "25");
		selectDropdown(YEAR, "1989");
		type(PHONE_NUMBER, "5035551285");
		type(USER_NAME, "Dev1");
		type(EMAIL, "BRRRRATTT@catalystitservices.com");
		type(DESCRIPTION, "All the Stuffs you needs to know breh!");
		type(PASSWORD_INPUT, "Workforfood33@!");
		type(CONFIRM_PASSWORD_INPUT, "Workforfood33@!");
		clickOn(SUBMIT_REGISTRATION);
		implicitWait(driver);
		String toastSuccessMessage = driver.findElement(
				By.className("piereg_login_error")).getText();
		assertEquals(toastSuccessMessage, "Error: Username already exists");
	}
}
