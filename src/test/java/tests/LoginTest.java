package tests;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;


public class LoginTest extends BaseClass{
	
	@Test
	public void validLoginTest() {
		
		new HomePage(driver).clickSignIn().enterEmail("nocipe8339@amcret.com").enterPassword("password")
		.clickSignIn().navigateToMyAccount().verifyPage();
		
	}
	
	@Test
	public void InvalidTest() {
		
		new HomePage(driver).clickSignIn().enterEmail("nocipe8339@amcret.com").enterPassword("asdsads")
		.clickSignIn();
		
		
	}

}
