package abstractPackage;

import org.openqa.selenium.By;

public class DroppableLogic extends DraggableLogic {
	public DroppableLogic() {
	}

	public boolean dragAndDrop(By locator, int num1, int num2, By locator2) {
		goToPage(DROPPABLE_LINK, DROPPABLE_URL);
		dragItemTo(locator, num1, num2);
		return isElementvisible(locator2);
	}
}
