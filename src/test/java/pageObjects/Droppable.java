package pageObjects;

import org.openqa.selenium.By;

public class Droppable {
	public Droppable(){}
	public final By DRAGGAGBLE_ITEM_DP = By.className("ui-widget-content ui-draggable");
	public final By DROP_HERE_BOX = By.className("ui-widget-header ui-droppable");
	public final By DROPPED_BOX = By.className("ui-widget-header ui-droppable ui-state-highlight");
}
