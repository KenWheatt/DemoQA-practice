package abstractPackage;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.HomePageObjects;
import util.Drivers;

public class AbstractPage {

	public AbstractPage() {
	}

	HomePageObjects Home;

	public void openPage(String Url) {
		Drivers.driver.get(Url);

	}

	public void clickOn(By locator) {
		Drivers.driver.findElement(locator).click();
	}

	public String getURL() {
		String URL = Drivers.driver.getCurrentUrl();
		return URL;
	}

	public void type(By locator, String input) {
		Drivers.driver.findElement(locator).sendKeys(input);
	}

	public void selectDropdown(By locator, String value) {
		Select selectDrop = new Select(Drivers.driver.findElement(locator));
		selectDrop.selectByValue(value);
	}

	public void goToPage(By locator, String url) {
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
		Drivers.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	public void waitForElementToBeVisible(By locator) {
		WebDriverWait wait = new WebDriverWait(Drivers.driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public void badWait() throws InterruptedException {
		Thread.sleep(1000);
	}

	public void dragItemTo(By locator, int num1, int num2) {
		Actions act = new Actions(Drivers.driver);
		WebElement draggableObject = Drivers.driver.findElement(locator);
		act.dragAndDropBy(draggableObject, num1, num2).perform();
	}

	public boolean isElementvisible(By locator) {
		if (ExpectedConditions.visibilityOfElementLocated(locator) != null) {
			return true;
		}
		return false;
	}

	public void closePageinFocus() {
		Drivers.driver.close();
	}

	public void closeThisPage() {
		Drivers.driver.quit();
	}
}
