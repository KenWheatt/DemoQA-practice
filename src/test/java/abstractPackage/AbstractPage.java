package abstractPackage;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import pageObjects.QAPage;

public class AbstractPage extends QAPage {

	protected WebDriver driver;

	public AbstractPage() {
	}

	public WebDriver openChromeDriver() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/kenwheatt/Desktop/dev/tools/chromedriver");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	protected void openHomePage(WebDriver driver) {
		driver.get("http://demoqa.com");

	}

	protected void clickOn(By locator) {
		driver.findElement(locator).click();
	}

	protected String getURL() {
		String URL = driver.getCurrentUrl();
		return URL;
	}

	protected void type(By locator, String input) {
		driver.findElement(locator).sendKeys(input);
	}

	protected void selectDropdown(By locator, String value) {
		Select selectDrop = new Select(driver.findElement(locator));
		selectDrop.selectByValue(value);
	}

	protected void goToRegistrationPage() {
		clickOn(REGISTRATION_LINK);
		assertEquals(getURL(), "http://demoqa.com/registration/");
	}

	protected boolean clickThisLink(By link) {

		if (ExpectedConditions.elementToBeClickable(link) == null) {
			return false;
		}
		return true;
	}
	
	public void verifyPasswordStrengthBar(String input, String strength ) throws InterruptedException{
	 goToRegistrationPage();	
	 type(PASSWORD_INPUT, input );
	 Thread.sleep(1000);
	 type(CONFIRM_PASSWORD_INPUT,input);
	 Thread.sleep(2000);
	 String passwordMeter = driver.findElement(By.id("piereg_passwordStrength")).getAttribute("class");
	 assertEquals(passwordMeter, strength);
	}
}



























//public void register() {
	// clickOn(REGISTRATION_LINK);
	// assertEquals(getURL(),"http://demoqa.com/registration/");
	// // Write first name**
	// type(FIRST_NAME_INPUT, "User");
	// // Write last name
	// type(LAST_NAME_INPUT, "Dev");
	// // click marrital status
	// clickOn(MARITAL_STATUS_BUTTON);
	// // click hobby
	// clickOn(HOBBY_BUTTON);
	// // select dropdown for country
	// selectDropdown(COUNTRY,"United States");
	// // select dropdowns to enter month of birth
	// selectDropdown(MONTH, "5");
	// // select dropdown to enter day of birth
	// selectDropdown(DAY, "25");
	// // select dropdown to enter year of birth
	// selectDropdown(YEAR, "1989");
	// // Write phone number
	// type(PHONE_NUMBER, "5035551285");
	// // Write Username
	// type(USER_NAME, "Dev1");
	// // Enter Email
	// type(EMAIL,"BRRRRATTT@catalystitservices.com");
	// // Enter Profile pic
	// // type(PROFILE_PIC, "file-path-to-pic");
	// // write a about yourself
	// type(DESCRIPTION,"All the Stuffs you needs to know breh!");
	// // Enter password
	// type(PASSWORD, "Workforfood33@!");
	// // enter password
	// type(CONFIRM_PASSWORD,"Workforfood33@!");
	// // check the passwords are the same
	// String password =
	// driver.findElement(By.id("password_2")).getAttribute("value");
	// String password_2 =
	// driver.findElement(By.id("confirm_password_password_2")).getAttribute("value");
	// assertEquals(password, password_2);
	// // assert the
	// String passwordMeter =
	// driver.findElement(By.id("piereg_passwordStrength")).getAttribute("class");
	// assertEquals(passwordMeter, "piereg_pass_medium");
	// // click submit button
	// clickOn(SUBMIT_REGISTRATION);
	// // verify toaster
	// WebDriverWait wait = new WebDriverWait(driver, 3);
	// wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("piereg_login_error")));
	// String toastSuccessMessage =
	// driver.findElement(By.className("piereg_login_error")).getText();
	// assertEquals(toastSuccessMessage, "Error: Username already exists");
	// }

//	@Test
//	public void getToDraggin() {
//		driver.findElement(By.linkText("Draggable")).click();
//		Actions act = new Actions(driver);
//		WebElement draggableObject = driver.findElement(By.id("draggable"));
//		act.dragAndDropBy(draggableObject, 178, 63).perform();
//	}
