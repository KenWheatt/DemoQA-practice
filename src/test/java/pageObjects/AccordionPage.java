package pageObjects;

import org.openqa.selenium.By;

public class AccordionPage extends DroppablePage {
	public AccordionPage(){}
	public final By DEFAULTFUNCTIONALITYTAB =  By.id("ui-id-1");
	public final By CUSTOMIZEICONSTAB =  By.id("ui-id-2");
	public final By FILLSPACETAB =  By.id("ui-id-3");
	public final By SECTION1SELECTOR = By.id("ui-accordion-accordion-header-0");
	public final By SECTION1DIV = By.id("ui-accordion-accordion-panel-0");
	public final By SECTION2SELECTOR = By.id("ui-accordion-accordion-header-1");
	public final By SECTION2DIV = By.id("ui-accordion-accordion-panel-1");
	public final By SECTION3SELECTOR = By.id("ui-accordion-accordion-header-2");
	public final By SECTION3DIV = By.id("ui-accordion-accordion-panel-2");
	public final By SECTION4SELECTOR = By.id("ui-accordion-accordion-header-3");
	public final By SECTION4DIV = By.id("ui-accordion-accordion-panel-3");
}
