package abstractPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePageLogic extends AbstractPage {
	public HomePageLogic() {

	}

	public boolean linkgoesSomewhere(By locator, String oldUrl) {
		clickOn(locator);
		implicitWait();
		String newUrl = getCurrentDriver().getCurrentUrl();

		if (newUrl != oldUrl) {
			return true;
		}
		return false;
	}

	public boolean clickTheTab(By locator, By locator2) {
		implicitWait();
		clickOn(locator);
		String style = driver.findElement(locator2).getAttribute("style");
		String expectedStyle = "display: block;";
		if (style == expectedStyle) {
			return true;
		}
		return false;
	}
	public Object thisGlyphgoesActive(By locator){
		implicitWait();
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(locator);
		action.moveToElement(we);
		action.perform();
		Object us = we.getAttribute("title");
		return us;
	}
}
