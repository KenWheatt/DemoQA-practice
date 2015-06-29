package pageObjects;

import org.openqa.selenium.By;

public class QAHomePage  {

	public QAHomePage() {
	}

	public final By TOOLS_QA_LINK = By.className("site-anchor");

	public final By NAVBAR_HOME_LINK = By.id("menu-item-38");

	public final By NAVBAR_ABOUT_US_LINK = By.id("menu-item-158");

	public final By NAVBAR_SERVICES_LINK = By.id("menu-item-155");

	public final By NAVBAR_DROPDOWN_LINK = By.id("menu-item-66");

	public final By NAVBAR_DROPDOWN_DRAGGABLE_LINK = By.id("menu-item-73");

	public final By NAVBAR_DROPDOWN_TABS_LINK = By.id("menu-item-153");

	public final By NAVBAR_BLOG_LINK = By.id("menu-item-65");

	public final By NAVBAR_CONTACT_LINK = By.id("menu-item-64");

	public final By UNIQUE_IMG_LINK = By
			.xpath("//div[h5/text()='Unique & Clean']/div/p/a/img");

	public final By CUSTOMER_IMG_LINK = By
			.xpath("//div[h5/text()='Customer Support']/div/p/i/a/img");

	public final By FLEXIBLE_IMG_LINK = By
			.xpath("//div[h5/text()='Very Flexible']/div/i/a/img");

	public final By HOMEPAGE_TAB1 = By.id("ui-id-1");

	public final By HOMEPAGE_TAB2 = By.id("ui-id-2");

	public final By HOMEPAGE_TAB3 = By.id("ui-id-3");

	public final By HOMEPAGE_TAB4 = By.id("ui-id-4");

	public final By HOMEPAGE_TAB5 = By.id("ui-id-5");

	public final By REGISTRATION_LINK = By.linkText("Registration");

	public final By DRAGGABLE_LINK = By.linkText("Draggable");

	public final By DROPPABLE_LINK = By.linkText("Droppable");

	public final By RESIZABLE_LINK = By.linkText("Resizable");

	public final By SELECTABLE_LINK = By.linkText("Selectable");

	public final By SORTABLE_LINK = By.linkText("Sortable");

	public final By ACCORDION_LINK = By.linkText("Accordion");

	public final By AUTOCOMPLETE_LINK = By.linkText("Autocomplete");

	public final By DATEPICKER_LINK = By.linkText("Datepicker");

	public final By MENU_LINK = By.linkText("Menu");

	public final By SLIDER_LINK = By.linkText("Slider");

	public final By TABS_LINK = By.linkText("Tabs");

	public final By TOOLTIP_LINK = By.linkText("Tooltip");

	public final By FRAMESANDWINDOWS_LINK = By.partialLinkText("Frames");
	
	public final By FOOTER_TOOLSQA_LINK = By.linkText("ToolsQA");
	
	public final By FOOTER_POWEREDBY_LINK = By.partialLinkText("Powered");
	
	public final By FOOTER_FACEBOOK_GLYPH = By.className("facebook");
	
	public final By FOOTER_TWITTER_GLYPH = By.className("twitter");
	
	public final By FOOTER_GPLUS_GLYPH = By.className("gplus");
	
	

	

	
}
