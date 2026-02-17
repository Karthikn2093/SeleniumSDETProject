package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import utility.BrowserUtility;


public class HomePage extends BaseClass {
	
	public HomePage(ChromeDriver driver) {
		
		this.driver = driver;
	}
	
	public LoginPage clickSignIn() {
		
		BrowserUtility.clickOn(By.className("login"));
		return new LoginPage(driver);
		
	}
	
	

}
