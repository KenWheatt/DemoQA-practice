package seleniumTests.QA.com;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.RegistrationPage;
import abstractPackage.AbstractPage;

public class Testforpage {

	private WebDriver driver;

	private RegistrationPage onRegistrationPage;

	@Before
	public void SetUp() {
		AbstractPage startUp = new AbstractPage(driver);
		driver = startUp.openChromeDriver();
		onRegistrationPage = new RegistrationPage(driver);
		onRegistrationPage.openHomePage(driver);
	}

	@Test
	public void register() {
		onRegistrationPage.clickOn(onRegistrationPage.REGISTRATION_LINK);
		assertEquals(onRegistrationPage.getURL(),"http://demoqa.com/registration/");
		// Write first name**
		onRegistrationPage.type(onRegistrationPage.FIRST_NAME_INPUT, "User");
		// Write last name
		onRegistrationPage.type(onRegistrationPage.LAST_NAME_INPUT, "Dev");
		// click marrital status
		onRegistrationPage.clickOn(onRegistrationPage.MARITAL_STATUS_BUTTON); 
		// click hobby
		onRegistrationPage.clickOn(onRegistrationPage.HOBBY_BUTTON);
		// select dropdown for country
		onRegistrationPage.selectDropdown(onRegistrationPage.COUNTRY, "United States");
		// select  dropdowns to enter month of birth
		onRegistrationPage.selectDropdown(onRegistrationPage.MONTH, "5");
		// select dropdown to enter day of birth 
		onRegistrationPage.selectDropdown(onRegistrationPage.DAY, "25");
		// select dropdown to enter year of birth
		onRegistrationPage.selectDropdown(onRegistrationPage.YEAR, "1989");
		// Write phone number
		onRegistrationPage.type(onRegistrationPage.PHONE_NUMBER, "5035551285");
		// Write Username
		onRegistrationPage.type(onRegistrationPage.USER_NAME, "Dev1");
		// Enter Email
		onRegistrationPage.type(onRegistrationPage.EMAIL, "BRRRRATTT@catalystitservices.com");
		// Write about yourself
//		onRegistrationPage.type(onRegistrationPage.PROFILE_PIC, "file-path-to-pic");
		//write a about yourself
		onRegistrationPage.type(onRegistrationPage.DESCRIPTION, "All the Stuffs you needs to know breh!");
		// Enter password
		onRegistrationPage.type(onRegistrationPage.PASSWORD, "Workforfood33@!");
		// enter password
		onRegistrationPage.type(onRegistrationPage.CONFIRM_PASSWORD, "Workforfood33@!");
		// check the passwords are the same
		  String password = driver.findElement(By.id("password_2")).getAttribute("value");
		  String password_2 = driver.findElement(By.id("confirm_password_password_2")).getAttribute("value");
		  assertEquals(password,password_2);
		//assert the 
		  String passwordMeter = driver.findElement(By.id("piereg_passwordStrength")).getAttribute("class");
		 assertEquals(passwordMeter,"piereg_pass_medium");
		//click submit button 
		 driver.findElement(By.name("pie_submit")).click();
		// verify toaster
		 WebDriverWait wait = new WebDriverWait(driver, 3);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("piereg_login_error")));
		 String toastSuccessMessage = driver.findElement(By.className("piereg_login_error")).getText();
		 assertEquals(toastSuccessMessage,"Error: Username already exists");
	}
	@Test
	public void getToDraggin(){
		driver.findElement(By.linkText("Draggable")).click();
		Actions act = new Actions(driver);
		WebElement draggableObject = driver.findElement(By.id("draggable"));
		act.dragAndDropBy(draggableObject,  178, 63).perform();
	}

	@After
	public void tearDown() {
		 driver.close();
	}

}
