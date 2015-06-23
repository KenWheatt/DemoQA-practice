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
}
