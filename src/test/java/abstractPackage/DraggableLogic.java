package abstractPackage;

import org.openqa.selenium.By;

public class DraggableLogic extends RegistrationLogic {
	public DraggableLogic() {
	}

	public void getToDraggin() {
		goToPage(DRAGGABLE_LINK, DRAGGABLE_URL);
		dragItemTo(By.id("draggable"), 178, 63);
	}
}
