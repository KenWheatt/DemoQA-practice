package abstractPackage;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.HomePageObjects;

public class AbstractPage {

	protected WebDriver driver;

	public AbstractPage() {
	}

	HomePageObjects Home;

	

	public void openPage(String Url) {
		driver.get(Url);

	}
	public  WebDriver getCurrentDriver(){
		return this.driver;
	}

	public void clickOn(By locator) {
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

	public boolean isLinkClickable(By link) {

		if (ExpectedConditions.elementToBeClickable(link) == null) {
			return false;
		}
		return true;
	}

	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	public void waitForElementToBeVisible(By locator){
		WebDriverWait wait = new WebDriverWait(driver,10);
		 wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public void badWait() throws InterruptedException {
		Thread.sleep(1000);
	}

	public void dragItemTo(By locator, int num1, int num2) {
		Actions act = new Actions(driver);
		WebElement draggableObject = driver.findElement(locator);
		act.dragAndDropBy(draggableObject, num1, num2).perform();
	}

	public boolean isElementvisible(By locator) {
		if (ExpectedConditions.visibilityOfElementLocated(locator) != null) {
			return true;
		}
		return false;
	}

	public void closeThisPage() {
		driver.close();
	}
}
