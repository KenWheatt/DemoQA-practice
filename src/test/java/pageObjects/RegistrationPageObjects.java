package pageObjects;

import org.openqa.selenium.By;

public class RegistrationPageObjects {
	public RegistrationPageObjects(){}
	public static final String REGISTRATION_URL = "http://demoqa.com/registration/";
	public static final By FIRST_NAME_INPUT = By.name("first_name");
	public static final  By LAST_NAME_INPUT = By.name("last_name");
	public static final  By MARITAL_STATUS_BUTTON = By.cssSelector("input[value='single']");
	public static final  By HOBBY_BUTTON = By.cssSelector("input[value='dance']");
	public static final  By COUNTRY = By.id("dropdown_7");
	public static final  By MONTH = By.id("mm_date_8");
	public static final  By DAY = By.id("dd_date_8");
	public static final  By YEAR = By.id("yy_date_8");
	public static final  By PHONE_NUMBER = By.id("phone_9");
	public static final  By USER_NAME = By.id("username");
	public static final  By EMAIL = By.id("email_1");
	public static final  By PROFILE_PIC = By.id("profile_pic_10");
	public static final  By DESCRIPTION = By.id("description");
	public static final  By PASSWORD_INPUT = By.id("password_2");
	public static final  By CONFIRM_PASSWORD_INPUT = By.id("confirm_password_password_2");
	public static final  By SUBMIT_REGISTRATION = By.name("pie_submit");
	public static final  String VERY_WEAK_PASSWORD = "password";
	public static final  String WEAK_PASSWORD = "CONFIRM33@!";
	public static final  String MEDIUM_PASSWORD = "CONFIRM33@!12";
	public static final  String STRONG_PASSWORD = "CONFIRM33@!1234TT";
	public static final  String VERY_WEAK_STRENGTH = "piereg_pass_v_week";
	public static final  String WEAK_STRENGTH = "piereg_pass_week";
	public static final  String MEDIUM_STRENGTH = "piereg_pass_medium";
	public static final  String STRONG_STRENGTH = "piereg_pass_strong";

}
