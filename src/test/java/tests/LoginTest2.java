package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utility.BrowserUtility;

public class LoginTest2 extends BrowserUtility{
	
	public LoginTest2(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	BrowserUtility browserUtility = new BrowserUtility(driver);
	
	@Test
	public void test1() {
		
		By signInLocator = By.className("login");
		browserUtility.clickOn(signInLocator);
		
		By emailLocator = By.id("email");
		browserUtility.enterText(emailLocator, "nocipe8339@amcret.com");
		
		By passwordLocator = By.id("password");
		browserUtility.enterText(passwordLocator, "password");
		
		By submitButton = By.id("SubmitLogin");
		browserUtility.clickOn(submitButton);
	}

}
