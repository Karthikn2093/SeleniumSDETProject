package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	
	@Test
	public void loginTest() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.automationpractice.pl/index.php");
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email")).sendKeys("nocipe8339@amcret.com");
		driver.findElement(By.id("passwd")).sendKeys("password");
		driver.findElement(By.id("SubmitLogin")).click();
		
	}

}
