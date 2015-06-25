package abstractPackage;

import org.openqa.selenium.By;

public class AccordionLogic extends DroppableLogic {
	public AccordionLogic() {
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
}
