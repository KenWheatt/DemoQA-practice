package seleniumTests.QA.com;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import abstractPackage.SelectableLogic;

public class Testforpage extends SelectableLogic {

	public Testforpage() {
	}

	@Before
	public void SetUp() {
		driver = openChromeDriver();
		openHomePage(driver);
	}

	@Test
	public void isDraggableLinkClickable() {
		assertTrue(clickThisLink(DRAGGABLE_LINK));
	}

	@Test
	public void verifyDraggablePageNavigation() {
		goToPage(DRAGGABLE_LINK, DRAGGABLE_URL);
	}

	@Test
	public void isRegistrationLinkClickable() {
		assertTrue(clickThisLink(REGISTRATION_LINK));
	}

	@Test
	public void verifyRegistrationPageNavigation() {
		goToPage(REGISTRATION_LINK, REGISTRATION_URL);
	}

	@Test
	public void isDroppableLinkClickable() {
		assertTrue(clickThisLink(DROPPABLE_LINK));
	}

	@Test
	public void verifyDroppablePageNavigation() {
		goToPage(DROPPABLE_LINK, DROPPABLE_URL);
	}

	@Test
	public void isResizableLinkClickable() {
		assertTrue(clickThisLink(RESIZABLE_LINK));
	}

	@Test
	public void verifyResizablePageNavigation() {
		goToPage(RESIZABLE_LINK, RESIZABLE_URL);
	}

	@Test
	public void isSelectableLinkClickable() {
		assertTrue(clickThisLink(SELECTABLE_LINK));
	}

	@Test
	public void verifySelectablePageNavigation() {
		goToPage(SELECTABLE_LINK, SELECTABLE_URL);
	}

	@Test
	public void isSortableLinkClickable() {
		assertTrue(clickThisLink(SORTABLE_LINK));
	}

	@Test
	public void verifySortablePageNavigation() {
		goToPage(SORTABLE_LINK, SORTABLE_URL);
	}

	@Test
	public void isAccordionLinkClickable() {
		assertTrue(clickThisLink(ACCORDION_LINK));
	}

	@Test
	public void verifyAccordionPageNavigation() {
		goToPage(ACCORDION_LINK, ACCORDION_URL);
	}

	@Test
	public void isDatepickerLinkClickable() {
		assertTrue(clickThisLink(DATEPICKER_LINK));
	}

	@Test
	public void verifyDatepickerPageNavigation() {
		goToPage(DATEPICKER_LINK, DATEPICKER_URL);
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
	public void verifyPasswordVeryWeakBar() throws InterruptedException {
		verifyPasswordStrengthBar(VERY_WEAK_PASSWORD, VERY_WEAK_STRENGTH);
	}

	@Test
	public void verifyPasswordWeakBar() throws InterruptedException {
		verifyPasswordStrengthBar(WEAK_PASSWORD, WEAK_STRENGTH);
	}

	@Test
	public void verifyPasswordMediumBar() throws InterruptedException {
		verifyPasswordStrengthBar(MEDIUM_PASSWORD, MEDIUM_STRENGTH);
	}

	@Test
	public void verifyPasswordStrongBar() throws InterruptedException {
		verifyPasswordStrengthBar(STRONG_PASSWORD, STRONG_STRENGTH);
	}

	@Test
	public void verifyRegistrationModal() {
		register();
	}

	@Test
	public void dragImage() {
		getToDraggin();
	}

	@Test
	public void accordionDefaultFunctionalityTestSection1() {
		assertTrue(accordionWork(DEFAULTFUNCTIONALITYTAB, SECTION1SELECTOR,
				SECTION1DIV));
	}

	@Test
	public void accordionDefaultFunctionalityTestSection2() {
		assertTrue(accordionWork(DEFAULTFUNCTIONALITYTAB, SECTION2SELECTOR,
				SECTION2DIV));
	}

	@Test
	public void accordionDefaultFunctionalityTestSection3() {
		assertTrue(accordionWork(DEFAULTFUNCTIONALITYTAB, SECTION3SELECTOR,
				SECTION3DIV));
	}

	@Test
	public void accordionDefaultFunctionalityTestSection4() {
		assertTrue(accordionWork(DEFAULTFUNCTIONALITYTAB, SECTION4SELECTOR,
				SECTION4DIV));
	}

	@Test
	public void dragAndDropTest() {
		assertTrue(dragAndDrop(DRAGGAGBLE_ITEM_DP, 123, 10, DROPPED_BOX));

	}

	@Test
	public void selectableTest() {
		assertTrue(selectSelectee(SELECTABLE_SELECTEE, SELECTABLE_SELECTED));
	}

	@After
	public void tearDown() {
		driver.close();
	}

}
