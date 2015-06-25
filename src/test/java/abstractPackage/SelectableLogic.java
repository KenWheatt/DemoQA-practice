package abstractPackage;

import org.openqa.selenium.By;

public class SelectableLogic extends AccordionLogic {
	public SelectableLogic() {
	}

	public boolean selectSelectee(By locator, By locator2) {
		goToPage(SELECTABLE_LINK, SELECTABLE_URL);
		clickOn(locator);
		return isElementvisible(locator2);
	}
}
