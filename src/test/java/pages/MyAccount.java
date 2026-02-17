package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyAccount extends BaseClass {
	
	public MyAccount(ChromeDriver driver) {
		
		this.driver = driver;
		
	}
	
	public MyAccount verifyPage() {
		
		driver.findElement(By.className("info-account")).getText().contains("Welcome to your account. Here you can manage all of your personal information and orders.");
		return this;
		
	}

}
