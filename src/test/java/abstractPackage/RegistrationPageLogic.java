package abstractPackage;

import org.openqa.selenium.By;
import static org.junit.Assert.*;
import util.Drivers;

public class RegistrationPageLogic extends AbstractPage {
	public RegistrationPageLogic() {
	}

	 public void verifyPasswordStrengthBar(By locator, By locator2,String input, String strength) throws InterruptedException {
		 type(locator, input);
		 badWait();
		 type(locator2, input);
		 badWait();
		 String passwordMeter =
		 Drivers.driver.findElement(By.id("piereg_passwordStrength")).getAttribute("class");
		 assertEquals(passwordMeter, strength);
	 }
	 
	public void register(By locator, String string, By locator1,
			String string1, By locator2, By locator3, By locator4,
			String string2, By locator5, String string3, By locator6,
			String string4, By locator7, String string5, By locator8,
			String string6, By locator9, String string7, By locator10,
			String string8, By locator11, String string9, By locator12,
			String string10, By locator13) {
		type(locator, string);
		type(locator1, string1);
		clickOn(locator2);
		clickOn(locator3);
		selectDropdown(locator4, string2);
		selectDropdown(locator5, string3);
		selectDropdown(locator6, string4);
		type(locator7, string5);
		type(locator8, string6);
		type(locator9, string7);
		type(locator10, string8);
		type(locator11, string9);
		type(locator12, string10);
		clickOn(locator13);
		 implicitWait();
		 String toastSuccessMessage = Drivers.driver.findElement(
		 By.className("piereg_login_error")).getText();
		 assertEquals(toastSuccessMessage, "Error: Username already exists");

	}

}
