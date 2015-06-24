package pageObjects;

import org.openqa.selenium.By;

public class QAPage extends RegistrationPage {

		public QAPage(){}
		public final By TOOLS_QA_LINK = By.className("site-anchor");
		public final By NAVBAR_HOME_LINK = By.id("menu-item-38");
		public final By NAVBAR_SERVICES_LINK = By.id("menu-item-155");
		public final By NAVBAR_BLOG_LINK = By.id("menu-item-65");
		public final By NAVBAR_CONTACT_LINK = By.id("menu-item-64");
		public final By REGISTRATION_LINK = By.linkText("Registration");
		public final String REGISTRATION_URL = "http://demoqa.com/registration/";
		public final By DRAGGABLE_LINK = By.linkText("Draggable");
		public final String DRAGGABLE_URL = "http://demoqa.com/draggable/";
		public final By DROPPABLE_LINK = By.linkText("Droppable");
		public final String DROPPABLE_URL = "http://demoqa.com/droppable/";
		public final By RESIZABLE_LINK = By.linkText("Resizable");
		public final String RESIZABLE_URL = "http://demoqa.com/resizable/";
		public final By SELECTABLE_LINK = By.linkText("Selectable");
		public final String SELECTABLE_URL = "http://demoqa.com/selectable/";
		public final By SORTABLE_LINK = By.linkText("Sortable");
		public final String SORTABLE_URL = "http://demoqa.com/sortable/";
		public final By ACCORDION_LINK = By.linkText("Accordion");
		public final String ACCORDION_URL = "http://demoqa.com/accordion/";
		public final By AUTOCOMPLETE_LINK = By.linkText("Autocomplete");
		public final String AUTOCOMPLETE_URL = "http://demoqa.com/autocomplete/";
		public final By DATEPICKER_LINK = By.linkText("Datepicker");
		public final String DATEPICKER_URL = "http://demoqa.com/datepicker/";
		public final By MENU_LINK = By.linkText("Menu");
		public final String MENU_URL = "http://demoqa.com/menu/";
		public final By SLIDER_LINK = By.linkText("Slider");
		public final String SLIDER_URL = "http://demoqa.com/slider/";
		public final By TABS_LINK = By.linkText("Tabs");
		public final String TABS_URL = "http://demoqa.com/tabs/";
		public final By TOOLTIP_LINK = By.linkText("Tooltip");
		public final String TOOLTIP_URL = "http://demoqa.com/tooltip/";
		public final By FRAMESANDWINDOWS_LINK = By.partialLinkText("Frames");
		public final String FRAMESANDWINDOWS_URL = "http://demoqa.com/frames and windows/";
}
