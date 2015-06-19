package abstractPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbstractPage {
	
	 protected WebDriver driver;
	
	 public  AbstractPage(WebDriver driver)
	{
		this.driver = driver;
	}
	 
	public  WebDriver openChromeDriver() 
	 {
		  System.setProperty("webdriver.chrome.driver", "/Users/kenwheatt/Desktop/dev/tools/chromedriver");
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
	 public void type(By locator,String input)
	 {
		 driver.findElement(locator).sendKeys(
				 input);
	 }
	 public void selectDropdown(By locator,String value)
	 {
		 Select selectDrop = new Select(driver.findElement(locator));
			selectDrop.selectByValue(value);
	 }
}
