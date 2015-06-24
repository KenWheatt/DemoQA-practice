package pageObjects;

import org.openqa.selenium.By;

public class DroppablePage extends SelectablePage {
	public DroppablePage(){}
	public final By DRAGGAGBLE_ITEM_DP = By.className("ui-draggable");
	public final By DROP_HERE_BOX = By.className("ui-droppable");
	public final By DROPPED_BOX = By.className("ui-state-highlight");
}
