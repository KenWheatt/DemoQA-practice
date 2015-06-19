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
	public final By MARITAL_STATUS_BUTTON = By.cssSelector("input[value='single']");
	public final By HOBBY_BUTTON = By.cssSelector("input[value='dance']");
	public final By COUNTRY = By.id("dropdown_7");
	public final By MONTH = By.id("mm_date_8");
	public final By DAY = By.id("dd_date_8");
	public final By YEAR = By.id("yy_date_8");
	public final By PHONE_NUMBER = By.id("phone_9");
	public final By USER_NAME = By.id("username");
	public final By EMAIL = By.id("email_1");
	public final By PROFILE_PIC = By.id("profile_pic_10");
	public final By DESCRIPTION = By.id("description");
	public final By PASSWORD = By.id("password_2");
	public final By CONFIRM_PASSWORD = By.id("confirm_password_password_2");
}
