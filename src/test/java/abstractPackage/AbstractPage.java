package abstractPackage;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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

	protected void goToPage(By locator, String url) {
		clickOn(locator);
		assertEquals(getURL(), url);
	}

	protected boolean clickThisLink(By link) {

		if (ExpectedConditions.elementToBeClickable(link) == null) {
			return false;
		}
		return true;
	}

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

	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	public void badWait() throws InterruptedException {
		Thread.sleep(1000);
	}

	public void dragItemTo(By locator, int num1, int num2) {
		Actions act = new Actions(driver);
		WebElement draggableObject = driver.findElement(locator);
		act.dragAndDropBy(draggableObject, num1, num2).perform();
	}

	public void getToDraggin() {
		goToPage(DRAGGABLE_LINK, DRAGGABLE_URL);
		dragItemTo(By.id("draggable"), 178, 63);
	}

	public boolean accordionWork(By locator, By locator2, By locator3) {
		goToPage(ACCORDION_LINK, ACCORDION_URL);
		clickOn(locator);
		clickOn(locator2);
		if (driver.findElement(locator3).isDisplayed()) {
			return true;
		}
		return false;
	}

	public boolean dragAndDrop(By locator,int num1,int num2,By locator2) {
		goToPage(DROPPABLE_LINK, DROPPABLE_URL);
		dragItemTo(locator, num1, num2);
		return isElementvisible(locator2);
	}
	public boolean isElementvisible(By locator){
		if(ExpectedConditions.visibilityOfElementLocated(locator) != null){
			return true;
		}
		return false;
		}
	public boolean selectSelectee(By locator, By locator2){
		goToPage(SELECTABLE_LINK, SELECTABLE_URL);
		clickOn(locator);
		return isElementvisible(locator2);
	}
}
	
