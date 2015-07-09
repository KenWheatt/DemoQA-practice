package abstractPackage;

import org.openqa.selenium.By;

import pageObjects.RegistrationPageObjects;
import static org.junit.Assert.*;
import supportingObjects.Registration;
import util.Drivers;

public class RegistrationPageLogic extends AbstractPage {
	public RegistrationPageLogic() {
	}

	public void verifyPasswordStrengthBar(By locator, By locator2,
			String input, String strength) throws InterruptedException {
		type(locator, input);
		badWait();
		type(locator2, input);
		badWait();
		String passwordMeter = Drivers.driver.findElement(
				By.id("piereg_passwordStrength")).getAttribute("class");
		assertEquals(passwordMeter, strength);
	}

	public void register(Registration registration) {
		type(RegistrationPageObjects.FIRST_NAME_INPUT, registration.getFirstname());
		type(RegistrationPageObjects.LAST_NAME_INPUT, registration.getLastname());
		clickOn(RegistrationPageObjects.MARITAL_STATUS_BUTTON);
		clickOn(RegistrationPageObjects.HOBBY_BUTTON);
		selectDropdown(RegistrationPageObjects.COUNTRY, country);
		selectDropdown(RegistrationPageObjects.DAY, string3);
		selectDropdown(RegistrationPageObjects.YEAR, string4);
		type(RegistrationPageObjects.PHONE_NUMBER, string5);
		type(RegistrationPageObjects.USER_NAME, string6);
		type(RegistrationPageObjects.EMAIL, string7);
		type(RegistrationPageObjects.DESCRIPTION, string8);
		type(RegistrationPageObjects.PASSWORD_INPUT, string9);
		type(RegistrationPageObjects.CONFIRM_PASSWORD_INPUT, string10);
		clickOn(RegistrationPageObjects.SUBMIT_REGISTRATION);
		implicitWait();
		String toastSuccessMessage = Drivers.driver.findElement(
				By.className("piereg_login_error")).getText();
		assertEquals(toastSuccessMessage, "Error: Username already exists");

	}

}
