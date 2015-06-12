package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends QAPage {

	WebDriver driver;
	
	public RegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	public  final By FIRST_NAME_INPUT = By.name("first_name");
	public final By LAST_NAME_INPUT = By.name("last_name");
}
