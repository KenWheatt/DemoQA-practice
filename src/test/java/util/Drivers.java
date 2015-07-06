package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Drivers {
	public static  WebDriver driver = null;

	public static WebDriver openChromeDriver() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/kenwheatt/Desktop/dev/tools/chromedriver");

		driver = new ChromeDriver();
		return driver;
	}

	public static WebDriver onpenFireFoxDriver() {

		driver = new FirefoxDriver();
		return driver;
	}

	public static WebDriver openSafariDriver() {
		
		driver = new SafariDriver();
		return driver;
	}
}
