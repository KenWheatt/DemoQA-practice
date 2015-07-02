package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Drivers {
	public static WebDriver driver = null;

	public static void openChromeDriver() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/kenwheatt/Desktop/dev/tools/chromedriver");

		driver = new ChromeDriver();
	}

	public void onpenFireFoxDriver() {

		driver = new FirefoxDriver();
	}

	public void openSafariDriver() {
		
		driver = new SafariDriver();
	}
}