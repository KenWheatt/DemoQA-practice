package pageObjects;

import org.openqa.selenium.By;

public class RegistrationPage {
	RegistrationPage(){}
	
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
	public final By PASSWORD_INPUT = By.id("password_2");
	public final By CONFIRM_PASSWORD_INPUT = By.id("confirm_password_password_2");
	public final By SUBMIT_REGISTRATION = By.name("pie_submit");
	public final String VERY_WEAK_PASSWORD = "password";
	public final String WEAK_PASSWORD = "CONFIRM33@!";
	public final String MEDIUM_PASSWORD = "CONFIRM33@!12";
	public final String STRONG_PASSWORD = "CONFIRM33@!1234TT";
	public final String VERY_WEAK_STRENGTH = "piereg_pass_v_week";
	public final String WEAK_STRENGTH = "piereg_pass_week";
	public final String MEDIUM_STRENGTH = "piereg_pass_medium";
	public final String STRONG_STRENGTH = "piereg_pass_strong";
}
