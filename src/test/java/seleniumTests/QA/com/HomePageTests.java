package seleniumTests.QA.com;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pageObjects.HomePageObjects;
import util.Drivers;
import abstractPackage.HomePageLogic;

public class HomePageTests {

	protected HomePageLogic HPL;
	protected HomePageObjects HPO;

	@Before
	public void setUp() {
		HPL = new HomePageLogic();
        Drivers.openSafariDriver();
		HPO = new HomePageObjects();
		HPL.openPage(HPO.HOME_PAGE);

	}

	@Test
	public void isSiteAchorLinkVisible() {
		assertTrue(HPL.isElementvisible(HPO.TOOLS_QA_ANCHOR_LINK));
	}

	@Test
	public void isNavbarHomeLinkVisible() {
		assertTrue(HPL.isElementvisible(HPO.NAVBAR_HOME_LINK));
	}

	@Test
	public void isNavbarAboutUsLinkVisible() {
		assertTrue(HPL.isElementvisible(HPO.NAVBAR_ABOUT_US_LINK));
	}

	@Test
	public void isNavbarServicesLinkVisible() {
		assertTrue(HPL.isElementvisible(HPO.NAVBAR_SERVICES_LINK));
	}

	@Test
	public void isNavbarDropdownLinkVisible() {
		assertTrue(HPL.isElementvisible(HPO.NAVBAR_DROPDOWN_LINK));
	}

	@Test
	public void isNavbarDraggableDropdownOptionLinkVisible() {
		HPL.clickOn(HPO.NAVBAR_DROPDOWN_LINK);
		assertTrue(HPL.isElementvisible(HPO.NAVBAR_DROPDOWN_DRAGGABLE_LINK));
	}

	@Test
	public void isNavbarTabsDropdownLinkVisible() {
		HPL.clickOn(HPO.NAVBAR_DROPDOWN_LINK);
		assertTrue(HPL.isElementvisible(HPO.NAVBAR_DROPDOWN_TABS_LINK));
	}

	@Test
	public void isNavbarBlogLinkVisible() {
		assertTrue(HPL.isElementvisible(HPO.NAVBAR_BLOG_LINK));
	}

	@Test
	public void isNavbarContactLinkVisible() {
		assertTrue(HPL.isElementvisible(HPO.NAVBAR_CONTACT_LINK));
	}

	@Test
	public void isRegistrationLinkVisible() {
		assertTrue(HPL.isElementvisible(HPO.REGISTRATION_LINK));
	}

	@Test
	public void isDraggableLinkVisible() {
		assertTrue(HPL.isElementvisible(HPO.DRAGGABLE_LINK));
	}

	@Test
	public void isDroppableLinkVisible() {
		assertTrue(HPL.isElementvisible(HPO.DROPPABLE_LINK));
	}

	@Test
	public void isResizableLinkVisible() {
		assertTrue(HPL.isElementvisible(HPO.RESIZABLE_LINK));
	}

	@Test
	public void isSelectableLinkVisible() {
		assertTrue(HPL.isElementvisible(HPO.SELECTABLE_LINK));
	}

	@Test
	public void isSortableLinkVisible() {
		assertTrue(HPL.isElementvisible(HPO.SORTABLE_LINK));
	}

	@Test
	public void isAccordionLinkVisible() {
		assertTrue(HPL.isElementvisible(HPO.ACCORDION_LINK));
	}

	@Test
	public void isAutocompleteLinkVisible() {
		assertTrue(HPL.isElementvisible(HPO.AUTOCOMPLETE_LINK));
	}

	@Test
	public void isDatepickerLinkVisible() {
		assertTrue(HPL.isElementvisible(HPO.DATEPICKER_LINK));
	}

	@Test
	public void isMenuLinkVisible() {
		assertTrue(HPL.isElementvisible(HPO.MENU_LINK));
	}

	@Test
	public void isSliderLinkVisible() {
		assertTrue(HPL.isElementvisible(HPO.SLIDER_LINK));
	}

	@Test
	public void isTabsLinkVisible() {
		assertTrue(HPL.isElementvisible(HPO.TABS_LINK));
	}

	@Test
	public void isTooltipLinkVisible() {
		assertTrue(HPL.isElementvisible(HPO.TOOLTIP_LINK));
	}

	@Test
	public void isFramesAndWindowsLinkVisible() {
		assertTrue(HPL.isElementvisible(HPO.FRAMESANDWINDOWS_LINK));
	}

	@Test
	public void isFlexibleImgLinkVisible() {
		assertTrue(HPL.isElementvisible(HPO.FLEXIBLE_IMG_LINK));
	}

	@Test
	public void isUnigueImgLinkVisible() {
		assertTrue(HPL.isElementvisible(HPO.UNIQUE_IMG_LINK));
	}

	@Test
	public void isCustomerImgLinkVisible() {
		assertTrue(HPL.isElementvisible(HPO.CUSTOMER_IMG_LINK));
	}

	@Test
	public void isFacebookGlyphVisible() {
		assertTrue(HPL.isElementvisible(HPO.FOOTER_FACEBOOK_GLYPH));
	}

	@Test
	public void isGPlusGlyphVisible() {
		assertTrue(HPL.isElementvisible(HPO.FOOTER_GPLUS_GLYPH));
	}

	@Test
	public void isTwitterGlyphVisible() {
		assertTrue(HPL.isElementvisible(HPO.FOOTER_TWITTER_GLYPH));
	}

	@Test
	public void isToolsQAFooterLinkVisible() {
		assertTrue(HPL.isElementvisible(HPO.FOOTER_TOOLSQA_LINK));
	}

	@Test
	public void isPoweredByFooterLinkVisible() {
		assertTrue(HPL.isElementvisible(HPO.FOOTER_POWEREDBY_LINK));
	}

	@Test
	public void isTab1Visible() {
		assertTrue(HPL.isElementvisible(HPO.HOMEPAGE_TAB1));
	}

	@Test
	public void isTab2LinkVisible() {
		assertTrue(HPL.isElementvisible(HPO.HOMEPAGE_TAB2));
	}

	@Test
	public void isTab3LinkVisible() {
		assertTrue(HPL.isElementvisible(HPO.HOMEPAGE_TAB3));
	}

	@Test
	public void isTab4LinkVisible() {
		assertTrue(HPL.isElementvisible(HPO.HOMEPAGE_TAB4));
	}

	@Test
	public void isTab5LinkVisible() {
		assertTrue(HPL.isElementvisible(HPO.HOMEPAGE_TAB5));
	}

	@Test
	public void doesAboutUsLinkNavigateToNewPage() {
		assertTrue(HPL.linkgoesSomewhere(HPO.NAVBAR_ABOUT_US_LINK,
				HPO.HOME_PAGE));
	}

	@Test
	public void doesBlogLinkNavigateToNewPage() {
		assertTrue(HPL.linkgoesSomewhere(HPO.NAVBAR_BLOG_LINK, HPO.HOME_PAGE));
	}

	@Test
	public void doesContactLinkNavigateToNewPage() {
		assertTrue(HPL
				.linkgoesSomewhere(HPO.NAVBAR_CONTACT_LINK, HPO.HOME_PAGE));
	}

	@Test
	public void doesServicesLinkNavigateToNewPage() {
		assertTrue(HPL.linkgoesSomewhere(HPO.NAVBAR_SERVICES_LINK,
				HPO.HOME_PAGE));
	}

	@Test
	public void doesAccordionLinkNavigateToNewPage() {
		assertTrue(HPL.linkgoesSomewhere(HPO.ACCORDION_LINK, HPO.HOME_PAGE));
	}

	@Test
	public void doesAutocompleteLinkNavigateToNewPage() {
		assertTrue(HPL.linkgoesSomewhere(HPO.AUTOCOMPLETE_LINK, HPO.HOME_PAGE));
	}

	@Test
	public void doesCustomerImgLinkNavigateToNewPage() {
		assertTrue(HPL.linkgoesSomewhere(HPO.CUSTOMER_IMG_LINK, HPO.HOME_PAGE));
	}

	@Test
	public void doesDatepickerLinkNavigateToNewPage() {
		assertTrue(HPL.linkgoesSomewhere(HPO.DATEPICKER_LINK, HPO.HOME_PAGE));
	}

	@Test
	public void doesDraggableLinkNavigateToNewPage() {
		assertTrue(HPL.linkgoesSomewhere(HPO.DRAGGABLE_LINK, HPO.HOME_PAGE));
	}

	@Test
	public void doesDroppableLinkNavigateToNewPage() {
		assertTrue(HPL.linkgoesSomewhere(HPO.DROPPABLE_LINK, HPO.HOME_PAGE));
	}

	@Test
	public void doesFlexibleImgLinkNavigateToNewPage() {
		assertTrue(HPL.linkgoesSomewhere(HPO.FLEXIBLE_IMG_LINK, HPO.HOME_PAGE));
	}

	@Test
	public void doesFramesAndWindowsLinkNavigateToNewPage() {
		assertTrue(HPL.linkgoesSomewhere(HPO.FRAMESANDWINDOWS_LINK,
				HPO.HOME_PAGE));
	}

	@Test
	public void doesMenuLinkNavigateToNewPage() {
		assertTrue(HPL.linkgoesSomewhere(HPO.MENU_LINK, HPO.HOME_PAGE));
	}

	@Test
	public void doesRegistrationLinkNavigateToNewPage() {
		assertTrue(HPL.linkgoesSomewhere(HPO.REGISTRATION_LINK, HPO.HOME_PAGE));
	}

	@Test
	public void doesSelectableLinkNavigateToNewPage() {
		assertTrue(HPL.linkgoesSomewhere(HPO.SELECTABLE_LINK, HPO.HOME_PAGE));
	}

	@Test
	public void doesSliderLinkNavigateToNewPage() {
		assertTrue(HPL.linkgoesSomewhere(HPO.SLIDER_LINK, HPO.HOME_PAGE));
	}

	@Test
	public void doesSortableLinkNavigateToNewPage() {
		assertTrue(HPL.linkgoesSomewhere(HPO.SORTABLE_LINK, HPO.HOME_PAGE));
	}

	@Test
	public void doesTabsLinkNavigateToNewPage() {
		assertTrue(HPL.linkgoesSomewhere(HPO.TABS_LINK, HPO.HOME_PAGE));
	}

	@Test
	public void doesTooltipLinkNavigateToNewPage() {
		assertTrue(HPL.linkgoesSomewhere(HPO.TOOLTIP_LINK, HPO.HOME_PAGE));
	}

	@Test
	public void doesUniqueImgLinkNavigateToNewPage() {
		assertTrue(HPL.linkgoesSomewhere(HPO.UNIQUE_IMG_LINK, HPO.HOME_PAGE));
	}

	@Test
	public void doesTab1LinkDisplayTabContent() {
		HPL.clickTheTab(HPO.HOMEPAGE_TAB1, HPO.TAB1_CONTENT);
	}

	@Test
	public void doesTab2LinkDisplayTabContent() {
		HPL.clickTheTab(HPO.HOMEPAGE_TAB2, HPO.TAB2_CONTENT);
	}

	@Test
	public void doesTab3LinkDisplayTabContent() {
		HPL.clickTheTab(HPO.HOMEPAGE_TAB3, HPO.TAB3_CONTENT);
	}

	@Test
	public void doesTab4LinkDisplayTabContent() {
		HPL.clickTheTab(HPO.HOMEPAGE_TAB4, HPO.TAB4_CONTENT);
	}

	@Test
	public void doesTab5LinkDisplayTabContent() {
		HPL.clickTheTab(HPO.HOMEPAGE_TAB5, HPO.TAB5_CONTENT);
	}

	@After
	public void closeShop() {
		HPL.closeThisPage();
	}
}
