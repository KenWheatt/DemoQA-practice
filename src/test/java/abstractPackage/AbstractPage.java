package abstractPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import pageObjects.QAPage;

public class AbstractPage extends QAPage{
	
	protected WebDriver driver;

	 public  AbstractPage()
	{
	}
	 public  WebDriver openChromeDriver() 
	 {
		  System.setProperty("webdriver.chrome.driver", "/Users/kenwheatt/Desktop/dev/tools/chromedriver");
		  WebDriver driver = new ChromeDriver();
		  return driver;
	 }
	 protected void  openHomePage(WebDriver driver)
	 {
		  driver.get("http://demoqa.com");
		  
	 }
	 
	 protected void clickOn(By locator)
	 {
		 driver.findElement(locator).click();
	 }
	 
	 protected  String getURL()
	 {
		 String URL = driver.getCurrentUrl();
		 return URL;
	 }
	 protected void type(By locator,String input)
	 {
		 driver.findElement(locator).sendKeys(
				 input);
	 }
	 protected void selectDropdown(By locator,String value)
	 {
		 Select selectDrop = new Select(driver.findElement(locator));
			selectDrop.selectByValue(value);
	 }
}
