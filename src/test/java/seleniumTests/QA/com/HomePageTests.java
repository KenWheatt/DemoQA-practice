package seleniumTests.QA.com;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pageObjects.HomePageObjects;
import abstractPackage.HomePageLogic;

public class HomePageTests {
	WebDriver driver;
	HomePageLogic HPL;
	HomePageObjects HPO;

	@Before
	public void setUp() throws InterruptedException {
		HomePageLogic HPL = new HomePageLogic(driver);
		HomePageObjects HPO = new HomePageObjects(driver);
		driver = HPL.openChromeDriver();
		HPL.openPage(driver, HPO.HOME_PAGE);
		HPL.badWait();
	}

	@Test
	public void isSiteAchorLinkVisible() throws InterruptedException {
		HPL.badWait();
		assertTrue(HPL.isLinkClickable(HPO.AUTOCOMPLETE_LINK));
	}

	// @After
	// public void closeShop(){
	// driver.close();
	// }
}
