package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import abstractPackage.AbstractPage;

public class QAPage extends AbstractPage {
	
	WebDriver driver;
		
	public QAPage (WebDriver driver)
		{
			super(driver);
		}
		public final By TOOLS_QA_LINK = By.className("site-anchor");
		public final By REGISTRATION_LINK = By.linkText("Registration");
		public final By NAVBAR_HOME_LINK = By.id("menu-item-38");
		public final By NAVBAR_SERVICES_LINK = By.id("menu-item-155");
		public final By NAVBAR_BLOG_LINK = By.id("menu-item-65");
		public final By NAVBAR_CONTACT_LINK = By.id("menu-item-64");
		
}
