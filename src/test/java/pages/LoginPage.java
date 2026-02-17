package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import utility.BrowserUtility;

public class LoginPage extends BaseClass {
	
	public LoginPage(ChromeDriver driver) {
		
		this.driver = driver;
		
	}
	
	
	public LoginPage enterEmail(String username) {
		BrowserUtility.enterText(By.id("email"), username);
		return this;
		
	}
	
	public LoginPage enterPassword(String password) {
		
		BrowserUtility.enterText(By.id("passwd"), password);
		return this;
		
	}
	
	public LoginPage clickSignIn() {
		
		BrowserUtility.clickOn(By.id("SubmitLogin"));
		return this;
	}
	
	public MyAccount navigateToMyAccount() {
		
		if(isOnMyAccountPage()) {
		return new MyAccount(driver);
		}else {
			throw new RuntimeException("Login failed");
		}
		
	}
	
	private boolean isOnMyAccountPage() {
		return driver.getCurrentUrl().contains("my-account");
	}
	
	
}
