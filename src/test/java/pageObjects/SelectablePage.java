package pageObjects;

import org.openqa.selenium.By;

public class SelectablePage extends AutoCompletePage{
	public SelectablePage(){}
	public final By SELECTABLE_SELECTEE = By.className("ui-selectee");
	public final By SELECTABLE_SELECTED = By.className("ui-selected");
}
