package abstractPackage;

import org.openqa.selenium.By;
import static org.junit.Assert.*;
import pageObjects.HomePageObjects;
import pageObjects.RegistrationPageObjects;

public class RegistrationPageLogic extends AbstractPage{
	public RegistrationPageLogic(){}
	HomePageObjects HPO;
	RegistrationPageObjects RPO;
	public void getRegistrationPage(){
		goToPage(HPO.REGISTRATION_LINK, "http://demoqa.com/registration/");
	}
	public void verifyPasswordStrengthBar(String input, String strength) throws InterruptedException {
		getRegistrationPage();
		type(RPO.PASSWORD_INPUT, input);
		badWait();
		type(RPO.CONFIRM_PASSWORD_INPUT, input);
		badWait();
		String passwordMeter = driver.findElement(By.id("piereg_passwordStrength")).getAttribute("class");
		assertEquals(passwordMeter, strength);
	}
	public void register() {
		getRegistrationPage();
		type(RPO.FIRST_NAME_INPUT, "User");
		type(RPO.LAST_NAME_INPUT, "Dev");
		clickOn(RPO.MARITAL_STATUS_BUTTON);
		clickOn(RPO.HOBBY_BUTTON);
		selectDropdown(RPO.COUNTRY, "United States");
		selectDropdown(RPO.DAY, "25");
		selectDropdown(RPO.YEAR, "1989");
		type(RPO.PHONE_NUMBER, "5035551285");
		type(RPO.USER_NAME, "Dev1");
	    type(RPO.EMAIL, "BRRRRATTT@catalystitservices.com");
		type(RPO.DESCRIPTION, "All the Stuffs you needs to know breh!");
		type(RPO.PASSWORD_INPUT, "Workforfood33@!");
		type(RPO.CONFIRM_PASSWORD_INPUT, "Workforfood33@!");
	    clickOn(RPO.SUBMIT_REGISTRATION);
		implicitWait();
		String toastSuccessMessage = driver.findElement( By.className("piereg_login_error")).getText();
		assertEquals(toastSuccessMessage, "Error: Username already exists");

}
}
