package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public  class Drivers {
	
	public  void openChromeDriver() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/kenwheatt/Desktop/dev/tools/chromedriver");
	@SuppressWarnings("unused")
	WebDriver driver = new ChromeDriver();

	}
	public void onpenFireFoxDriver(){
		@SuppressWarnings("unused")
		WebDriver driver = new FirefoxDriver();
	}
}
