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
		
	

		public final By REGISTRATION_LINK = By.linkText("Registration");
}
