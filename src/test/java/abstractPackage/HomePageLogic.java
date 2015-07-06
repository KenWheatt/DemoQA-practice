package abstractPackage;

import org.openqa.selenium.By;

import util.Drivers;

public class HomePageLogic extends AbstractPage {
	public HomePageLogic() {

	}

	public boolean linkgoesSomewhere(By locator, String oldUrl) {
		clickOn(locator);
		implicitWait();
		String newUrl = Drivers.driver.getCurrentUrl();

		if (newUrl != oldUrl) {
			return true;
		}
		return false;
	}

	public boolean clickTheTab(By locator, By locator2) {
		implicitWait();
		clickOn(locator);
		String style = Drivers.driver.findElement(locator2).getAttribute("style");
		String expectedStyle = "display: block;";
		if (style == expectedStyle) {
			return true;
		}
		return false;
	}

		
		
	}

