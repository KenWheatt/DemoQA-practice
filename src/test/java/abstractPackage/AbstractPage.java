package abstractPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractPage {
	
	 protected WebDriver driver;
	
	 public  AbstractPage(WebDriver driver)
	{
		this.driver = driver;
	}
	 
	public  WebDriver openChromeDriver() 
	 {
		  System.setProperty("webdriver.chrome.driver", "C:\\dev\\tools\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  return driver;
	 }
	 public void  openHomePage(WebDriver driver)
	 {
		  driver.get("http://demoqa.com");
		  
	 }
	 
	 public void clickOn(By locator)
	 {
		 driver.findElement(locator).click();
	 }
	 
	 public  String getURL()
	 {
		 String URL = driver.getCurrentUrl();
		 return URL;
	 }
}
