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
			.xpath("//div[h5/text()='Unique & Clean']/a");

	public final By CUSTOMER_IMG_LINK = By
			.xpath("//div[h5/text()='Customer Support']/a");

	public final By FLEXIBLE_IMG_LINK = By
			.xpath("//div[h5/text()='Very Flexible']/a");

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
	
	

	// public final String REGISTRATION_URL = "http://demoqa.com/registration/";
	// public final String DRAGGABLE_URL = "http://demoqa.com/draggable/";
	// public final String DROPPABLE_URL = "http://demoqa.com/droppable/";
	// public final String RESIZABLE_URL = "http://demoqa.com/resizable/";
	// public final String SELECTABLE_URL = "http://demoqa.com/selectable/";
	// public final String SORTABLE_URL = "http://demoqa.com/sortable/";
	// public final String ACCORDION_URL = "http://demoqa.com/accordion/";
	// public final String AUTOCOMPLETE_URL = "http://demoqa.com/autocomplete/";
	// public final String DATEPICKER_URL = "http://demoqa.com/datepicker/";
	// public final String MENU_URL = "http://demoqa.com/menu/";
	// public final String SLIDER_URL = "http://demoqa.com/slider/";
	// public final String TABS_URL = "http://demoqa.com/tabs/";
	// public final String TOOLTIP_URL = "http://demoqa.com/tooltip/";
	// public final String FRAMESANDWINDOWS_URL =
	// "http://demoqa.com/frames-and-windows/";
}
