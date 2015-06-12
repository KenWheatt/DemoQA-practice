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
import org.openqa.selenium.support.ui.Select;
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
		assertEquals(onRegistrationPage.getURL(),
				"http://demoqa.com/registration/");
		// Write first name**
		driver.findElement(onRegistrationPage.FIRST_NAME_INPUT).sendKeys(
				"User");
		// Write last name
		driver.findElement(onRegistrationPage.LAST_NAME_INPUT).sendKeys(
				"Dev");
		// click marrital status
		driver.findElement(By.cssSelector("input[value='single']")).click();
		// click hobby
		driver.findElement(By.cssSelector("input[value='dance']")).click();
		// select dropdown for country
		Select selectCountry = new Select(driver.findElement(By.id("dropdown_7")));
		selectCountry.selectByValue("United States");
		// select  dropdowns to enter month of birth
		Select selectMonth = new Select(driver.findElement(By.id("mm_date_8")));
		selectMonth.selectByValue("5");
		// select dropdown to enter day of birth 
		Select selectDay = new Select(driver.findElement(By.id("dd_date_8")));
		selectDay.selectByValue("25");
		// select dropdown to enter year of birth
		Select selectYear = new Select(driver.findElement(By.id("yy_date_8")));
		selectYear.selectByValue("1989");
		// Write phone number
		driver.findElement(By.id("phone_9")).sendKeys("5035551285");
		// Write Username
		driver.findElement(By.id("username")).sendKeys("Dev1");
		// Enter Email
		driver.findElement(By.id("email_1")).sendKeys("BRRRRATTT@catalystitservices.com");
		// Write about yourself
		driver.findElement(By.id("profile_pic_10")).sendKeys("C:\\Users\\kwheatt\\Desktop\\WORK BREH\\QA bidness.jpg");
		//write a about yourself
		driver.findElement(By.id("description")).sendKeys("All the Stuffs you needs to know breh!");
		// Enter password
		driver.findElement(By.id("password_2")).sendKeys("Workforfood33@!");
		// enter password
		driver.findElement(By.id("confirm_password_password_2")).sendKeys("Workforfood33@!");
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
