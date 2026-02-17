package utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class BrowserUtility {
	
	public static ChromeDriver driver;
	
	public BrowserUtility(WebDriver driver) {
		super();
		this.driver = (ChromeDriver) driver;
	}
	
	
	public static void clickOn(By locator) {
		
		WebElement element = driver.findElement(locator);
		element.click();
		
	}
	
	public static void enterText(By locator,String textToEnter) {
		
		WebElement element = driver.findElement(locator);
		element.sendKeys(textToEnter);
		
	}
	
	
	@AfterMethod
	public void closeApplication() throws Exception {
		Thread.sleep(4000);
		driver.quit();
	}

}
