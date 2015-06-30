
public class randomcode {
	// public final String DRAGGABLE_URL = "http://demoqa.com/draggable/";
	// public final String RESIZABLE_URL = "http://demoqa.com/resizable/";
	// public final String SORTABLE_URL = "http://demoqa.com/sortable/";
	// public final String DATEPICKER_URL = "http://demoqa.com/datepicker/";
	// public final String MENU_URL = "http://demoqa.com/menu/";
	// public final String SLIDER_URL = "http://demoqa.com/slider/";
	// public final String TABS_URL = "http://demoqa.com/tabs/";
	// public final String TOOLTIP_URL = "http://demoqa.com/tooltip/";
	//package seleniumTests.QA.com;
	//
	//import static org.junit.Assert.assertTrue;
	//
	//import org.junit.After;
	//import org.junit.Before;
	//import org.junit.Test;
	//
	//import abstractPackage.FramesAndWindowsLogic;
	//
	//public class Testforpage extends FramesAndWindowsLogic {
	//
//		public Testforpage() {
//		}
	//
//		@Before
//		public void SetUp() {
//			driver = openChromeDriver();
//			openHomePage(driver);
//		}
	//
//		@Test
//		public void isDraggableLinkClickable() {
//			implicitWait(driver);
//			clickOn(FLEXIBLE_IMG_LINK);
//		}
	////
////		@Test
//		public void verifyDraggablePageNavigation() {
//			goToPage(DRAGGABLE_LINK, DRAGGABLE_URL);
//		}
	//
//		@Test
//		public void isRegistrationLinkClickable() {
//			assertTrue(clickThisLink(REGISTRATION_LINK));
//		}
	//
//		@Test
//		public void verifyRegistrationPageNavigation() {
//			goToPage(REGISTRATION_LINK, REGISTRATION_URL);
//		}
	//
//		@Test
//		public void isDroppableLinkClickable() {
//			assertTrue(clickThisLink(DROPPABLE_LINK));
//		}
	//
//		@Test
//		public void verifyDroppablePageNavigation() {
//			goToPage(DROPPABLE_LINK, DROPPABLE_URL);
//		}
	//
//		@Test
//		public void isResizableLinkClickable() {
//			assertTrue(clickThisLink(RESIZABLE_LINK));
//		}
	//
//		@Test
//		public void verifyResizablePageNavigation() {
//			goToPage(RESIZABLE_LINK, RESIZABLE_URL);
//		}
	//
//		@Test
//		public void isSelectableLinkClickable() {
//			assertTrue(clickThisLink(SELECTABLE_LINK));
//		}
	//
//		@Test
//		public void verifySelectablePageNavigation() {
//			goToPage(SELECTABLE_LINK, SELECTABLE_URL);
//		}
	//
//		@Test
//		public void isSortableLinkClickable() {
//			assertTrue(clickThisLink(SORTABLE_LINK));
//		}
	//
//		@Test
//		public void verifySortablePageNavigation() {
//			goToPage(SORTABLE_LINK, SORTABLE_URL);
//		}
	//
//		@Test
//		public void isAccordionLinkClickable() {
//			assertTrue(clickThisLink(ACCORDION_LINK));
//		}
	//
//		@Test
//		public void verifyAccordionPageNavigation() {
//			goToPage(ACCORDION_LINK, ACCORDION_URL);
//		}
	//
//		@Test
//		public void isDatepickerLinkClickable() {
//			assertTrue(clickThisLink(DATEPICKER_LINK));
//		}
	//
//		@Test
//		public void verifyDatepickerPageNavigation() {
//			goToPage(DATEPICKER_LINK, DATEPICKER_URL);
//		}
	//
//		@Test
//		public void isMenuLinkClickable() {
//			assertTrue(clickThisLink(MENU_LINK));
//		}
	//
//		@Test
//		public void isSliderLinkClickable() {
//			assertTrue(clickThisLink(SLIDER_LINK));
//		}
	//
//		@Test
//		public void isTabsLinkClickable() {
//			assertTrue(clickThisLink(TABS_LINK));
//		}
	//
//		@Test
//		public void isToolsTipLinkClickable() {
//			assertTrue(clickThisLink(TOOLTIP_LINK));
//		}
	//
//		@Test
//		public void isFramesandWindowsLinkClickable() {
//			assertTrue(clickThisLink(FRAMESANDWINDOWS_LINK));
//		}
	//
//		@Test
//		public void verifyPasswordVeryWeakBar() throws InterruptedException {
//			verifyPasswordStrengthBar(VERY_WEAK_PASSWORD, VERY_WEAK_STRENGTH);
//		}
	//
//		@Test
//		public void verifyPasswordWeakBar() throws InterruptedException {
//			verifyPasswordStrengthBar(WEAK_PASSWORD, WEAK_STRENGTH);
//		}
	//
//		@Test
//		public void verifyPasswordMediumBar() throws InterruptedException {
//			verifyPasswordStrengthBar(MEDIUM_PASSWORD, MEDIUM_STRENGTH);
//		}
	//
//		@Test
//		public void verifyPasswordStrongBar() throws InterruptedException {
//			verifyPasswordStrengthBar(STRONG_PASSWORD, STRONG_STRENGTH);
//		}
	//
//		@Test
//		public void verifyRegistrationModal() {
//			register();
//		}
	//
//		@Test
//		public void dragImage() {
//			getToDraggin();
//		}
	//
//		@Test
//		public void accordionDefaultFunctionalityTestSection1() {
//			assertTrue(accordionWork(DEFAULTFUNCTIONALITYTAB, SECTION1SELECTOR,
//					SECTION1DIV));
//		}
	//
//		@Test
//		public void accordionDefaultFunctionalityTestSection2() {
//			assertTrue(accordionWork(DEFAULTFUNCTIONALITYTAB, SECTION2SELECTOR,
//					SECTION2DIV));
//		}
	//
//		@Test
//		public void accordionDefaultFunctionalityTestSection3() {
//			assertTrue(accordionWork(DEFAULTFUNCTIONALITYTAB, SECTION3SELECTOR,
//					SECTION3DIV));
//		}
	//
//		@Test
//		public void accordionDefaultFunctionalityTestSection4() {
//			assertTrue(accordionWork(DEFAULTFUNCTIONALITYTAB, SECTION4SELECTOR,
//					SECTION4DIV));
//		}
	//
//		@Test
//		public void dragAndDropTest() {
//			assertTrue(dragAndDrop(DRAGGAGBLE_ITEM_DP, 123, 10, DROPPED_BOX));
	//
//		}
	//
//		@Test
//		public void selectableTest() {
//			assertTrue(selectSelectee(SELECTABLE_SELECTEE, SELECTABLE_SELECTED));
//		}
	//
//		@Test
//		public void autocompleteTest() throws InterruptedException {
//			assertTrue(validateAutoComplet());
//		}
	//
//		@Test
//		public void switchWindowsAndTestUrlTest() throws InterruptedException {
//			switchingToNewPage();
	//
//		}

//		@After
//		public void tearDown() {
//			driver.close();
//		}
	//package pageObjects;
	//
	//import org.openqa.selenium.By;
	//
	//public class SelectablePage extends AutoCompletePage{
//		public SelectablePage(){}
//	    public final String SELECTABLE_URL = "http://demoqa.com/selectable/";
//		public final By SELECTABLE_SELECTEE = By.className("ui-selectee");
//		public final By SELECTABLE_SELECTED = By.className("ui-selected");
	//}
	//package pageObjects;
	//
	//import org.openqa.selenium.By;
	//
	//public class RegistrationPage extends AccordionPage {
//		RegistrationPage(){}
//		public final String REGISTRATION_URL = "http://demoqa.com/registration/";
//		public  final By FIRST_NAME_INPUT = By.name("first_name");
//		public final By LAST_NAME_INPUT = By.name("last_name");
//		public final By MARITAL_STATUS_BUTTON = By.cssSelector("input[value='single']");
//		public final By HOBBY_BUTTON = By.cssSelector("input[value='dance']");
//		public final By COUNTRY = By.id("dropdown_7");
//		public final By MONTH = By.id("mm_date_8");
//		public final By DAY = By.id("dd_date_8");
//		public final By YEAR = By.id("yy_date_8");
//		public final By PHONE_NUMBER = By.id("phone_9");
//		public final By USER_NAME = By.id("username");
//		public final By EMAIL = By.id("email_1");
//		public final By PROFILE_PIC = By.id("profile_pic_10");
//		public final By DESCRIPTION = By.id("description");
//		public final By PASSWORD_INPUT = By.id("password_2");
//		public final By CONFIRM_PASSWORD_INPUT = By.id("confirm_password_password_2");
//		public final By SUBMIT_REGISTRATION = By.name("pie_submit");
//		public final String VERY_WEAK_PASSWORD = "password";
//		public final String WEAK_PASSWORD = "CONFIRM33@!";
//		public final String MEDIUM_PASSWORD = "CONFIRM33@!12";
//		public final String STRONG_PASSWORD = "CONFIRM33@!1234TT";
//		public final String VERY_WEAK_STRENGTH = "piereg_pass_v_week";
//		public final String WEAK_STRENGTH = "piereg_pass_week";
//		public final String MEDIUM_STRENGTH = "piereg_pass_medium";
//		public final String STRONG_STRENGTH = "piereg_pass_strong";
	//}//package pageObjects;
	//
	//import org.openqa.selenium.By;
	//
	//public class FramesAndWindowsPage {
//		public FramesAndWindowsPage(){}
//	    public final String FRAMESANDWINDOWS_URL = "http://demoqa.com/frames-and-windows/";
//		public final By NEW_BROWSER_TAB_FAW = By.linkText("New Browser Tab");
	//}
	//package pageObjects;
	//
	//import org.openqa.selenium.By;
	//
	//public class DroppablePage extends SelectablePage {
//		public DroppablePage(){}
//	    public final String DROPPABLE_URL = "http://demoqa.com/droppable/";
//		public final By DRAGGAGBLE_ITEM_DP = By.className("ui-draggable");
//		public final By DROP_HERE_BOX = By.className("ui-droppable");
//		public final By DROPPED_BOX = By.className("ui-state-highlight");
	//}
	//package pageObjects;
	//
	//import org.openqa.selenium.By;
	//
	//public class AutoCompletePage extends FramesAndWindowsPage {
//		public AutoCompletePage(){}
//	    public final String AUTOCOMPLETE_URL = "http://demoqa.com/autocomplete/";
//		public final By AUTOCOMPLET_INPUT = By.id("tagss");
//		public final By EXPECTED_AUTOCOMPLETE_RETURN = By.xpath(".//*[@id='ui-id-1']/li[contains(.,'ActionScript')]");
	//}
	//package pageObjects;
	//
	//import org.openqa.selenium.By;
	//
	//public class AccordionPage extends DroppablePage {
//		public AccordionPage(){}
//		public final String ACCORDION_URL = "http://demoqa.com/accordion/";
//		public final By DEFAULTFUNCTIONALITYTAB =  By.id("ui-id-1");
//		public final By CUSTOMIZEICONSTAB =  By.id("ui-id-2");
//		public final By FILLSPACETAB =  By.id("ui-id-3");
//		public final By SECTION1SELECTOR = By.id("ui-accordion-accordion-header-0");
//		public final By SECTION1DIV = By.id("ui-accordion-accordion-panel-0");
//		public final By SECTION2SELECTOR = By.id("ui-accordion-accordion-header-1");
//		public final By SECTION2DIV = By.id("ui-accordion-accordion-panel-1");
//		public final By SECTION3SELECTOR = By.id("ui-accordion-accordion-header-2");
//		public final By SECTION3DIV = By.id("ui-accordion-accordion-panel-2");
//		public final By SECTION4SELECTOR = By.id("ui-accordion-accordion-header-3");
//		public final By SECTION4DIV = By.id("ui-accordion-accordion-panel-3");
	//}//package abstractPackage;
	//
	//import org.openqa.selenium.By;
	//
	//public class AccordionLogic extends DroppableLogic {
//		public AccordionLogic() {
//		}
	//
//		public boolean accordionWork(By locator, By locator2, By locator3) {
//			goToPage(ACCORDION_LINK, ACCORDION_URL);
//			clickOn(locator);
//			clickOn(locator2);
//			if (driver.findElement(locator3).isDisplayed()) {
//				return true;
//			}
//			return false;
//		}
	//}
	//package abstractPackage;
	//
	//import org.openqa.selenium.By;
	//
	//public class AccordionLogic extends DroppableLogic {
//		public AccordionLogic() {
//		}
	//
//		public boolean accordionWork(By locator, By locator2, By locator3) {
//			goToPage(ACCORDION_LINK, ACCORDION_URL);
//			clickOn(locator);
//			clickOn(locator2);
//			if (driver.findElement(locator3).isDisplayed()) {
//				return true;
//			}
//			return false;
//		}
	//}
	//package abstractPackage;
	//
	//import org.openqa.selenium.By;
	//
	//public class DraggableLogic extends RegistrationLogic {
//		public DraggableLogic() {
//		}
	//
//		public void getToDraggin() {
//			goToPage(DRAGGABLE_LINK, DRAGGABLE_URL);
//			dragItemTo(By.id("draggable"), 178, 63);
//		}
	//}
	//package abstractPackage;
	//
	//import org.openqa.selenium.By;
	//
	//public class DroppableLogic extends DraggableLogic {
//		public DroppableLogic() {
//		}
	//
//		public boolean dragAndDrop(By locator, int num1, int num2, By locator2) {
//			goToPage(DROPPABLE_LINK, DROPPABLE_URL);
//			dragItemTo(locator, num1, num2);
//			return isElementvisible(locator2);
//		}
	//}
	//package abstractPackage;
	//
	//import java.util.ArrayList;
	//
	//public class FramesAndWindowsLogic extends AutoCompleteLogic {
//		public FramesAndWindowsLogic() {
//		}
	//
//		public boolean switchingToNewPage() throws InterruptedException {
//			goToPage(FRAMESANDWINDOWS_LINK, FRAMESANDWINDOWS_URL);
//			badWait();
//			clickOn(NEW_BROWSER_TAB_FAW);
//			badWait();
//			ArrayList<String> tabs2 = new ArrayList<String>(
//					driver.getWindowHandles());
//			driver.switchTo().window(tabs2.get(1));
//			String currentUrl = driver.getCurrentUrl();
//			if (currentUrl == "http://demoqa.com/frames-and-windows/#") {
//				return true;
//			}
//			return false;
//		}
	//}
	//package abstractPackage;
	//
	//import static org.junit.Assert.assertEquals;
	//
	//import org.openqa.selenium.By;
	//
	//public class RegistrationLogic extends AbstractPage{
//		public RegistrationLogic(){}
//		public void verifyPasswordStrengthBar(String input, String strength)
//				throws InterruptedException {
//			goToPage(REGISTRATION_LINK, "http://demoqa.com/registration/");
//			type(PASSWORD_INPUT, input);
//			badWait();
//			type(CONFIRM_PASSWORD_INPUT, input);
//			badWait();
//			String passwordMeter = driver.findElement(
//					By.id("piereg_passwordStrength")).getAttribute("class");
//			assertEquals(passwordMeter, strength);
//		}
//		public void register() {
//			goToPage(REGISTRATION_LINK, "http://demoqa.com/registration/");
//			type(FIRST_NAME_INPUT, "User");
//			type(LAST_NAME_INPUT, "Dev");
//			clickOn(MARITAL_STATUS_BUTTON);
//			clickOn(HOBBY_BUTTON);
//			selectDropdown(COUNTRY, "United States");
//			selectDropdown(MONTH, "5");
//			selectDropdown(DAY, "25");
//			selectDropdown(YEAR, "1989");
//			type(PHONE_NUMBER, "5035551285");
//			type(USER_NAME, "Dev1");
//			type(EMAIL, "BRRRRATTT@catalystitservices.com");
//			type(DESCRIPTION, "All the Stuffs you needs to know breh!");
//			type(PASSWORD_INPUT, "Workforfood33@!");
//			type(CONFIRM_PASSWORD_INPUT, "Workforfood33@!");
//			clickOn(SUBMIT_REGISTRATION);
//			implicitWait(driver);
//			String toastSuccessMessage = driver.findElement(
//					By.className("piereg_login_error")).getText();
//			assertEquals(toastSuccessMessage, "Error: Username already exists");
//		}
	//}
	//package abstractPackage;
	//
	//import org.openqa.selenium.By;
	//
	//public class SelectableLogic extends AccordionLogic {
//		public SelectableLogic() {
//		}
	//
//		public boolean selectSelectee(By locator, By locator2) {
//			goToPage(SELECTABLE_LINK, SELECTABLE_URL);
//			clickOn(locator);
//			return isElementvisible(locator2);
//		}
	//}

}
