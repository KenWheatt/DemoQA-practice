package seleniumTests.QA.com;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import abstractPackage.AbstractPage;

public class Testforpage extends AbstractPage {

	public Testforpage() {
	}

	@Before
	public void SetUp() {
		driver = openChromeDriver();
		openHomePage(driver);
	}

	@Test
	public void verifyRegistrationPageNavigation() {
		goToRegistrationPage();
	}

	@Test
	public void isDraggableLinkClickable() {
		assertTrue(clickThisLink(DRAGGABLE_LINK));
	}

	@Test
	public void isRegistrationLinkClickable() {
		assertTrue(clickThisLink(REGISTRATION_LINK));
	}

	@Test
	public void isDroppableLinkClickable() {
		assertTrue(clickThisLink(DROPPABLE_LINK));
	}

	@Test
	public void isReziableLinkClickable() {
		assertTrue(clickThisLink(RESIZABLE_LINK));
	}

	@Test
	public void isSelectableLinkClickable() {
		assertTrue(clickThisLink(SELECTABLE_LINK));
	}

	@Test
	public void isSortableLinkClickable() {
		assertTrue(clickThisLink(SORTABLE_LINK));
	}

	@Test
	public void isAccordionLinkClickable() {
		assertTrue(clickThisLink(ACCORDION_LINK));
	}

	@Test
	public void isDatepickerLinkClickable() {
		assertTrue(clickThisLink(DATEPICKER_LINK));
	}

	@Test
	public void isMenuLinkClickable() {
		assertTrue(clickThisLink(MENU_LINK));
	}

	@Test
	public void isSliderLinkClickable() {
		assertTrue(clickThisLink(SLIDER_LINK));
	}

	@Test
	public void isTabsLinkClickable() {
		assertTrue(clickThisLink(TABS_LINK));
	}

	@Test
	public void isToolsTipLinkClickable() {
		assertTrue(clickThisLink(TOOLTIP_LINK));
	}

	@Test
	public void isFramesandWindowsLinkClickable() {
		assertTrue(clickThisLink(FRAMESANDWINDOWS_LINK));
	}
	
	@Test
	public void verifyPasswordVeryWeakBar() throws InterruptedException{
		verifyPasswordStrengthBar(VERY_WEAK_PASSWORD,VERY_WEAK_STRENGTH);
	}
	
	@Test
	public void verifyPasswordWeakBar() throws InterruptedException{
		verifyPasswordStrengthBar(WEAK_PASSWORD,WEAK_STRENGTH);
	}
	
	@Test
	public void verifyPasswordMediumBar() throws InterruptedException{
		verifyPasswordStrengthBar(MEDIUM_PASSWORD,MEDIUM_STRENGTH);
	}
	
	@Test
	public void verifyPasswordStrongBar() throws InterruptedException{
		verifyPasswordStrengthBar(STRONG_PASSWORD,STRONG_STRENGTH);
	}

	
	@After
	public void tearDown() {
		driver.close();
	}

}
