package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.BrowserUtility;

public class BaseClass {
	
	public ChromeDriver driver;
	
	@BeforeMethod
	public void startApplication() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("http://www.automationpractice.pl/");
		
	}
	
	@AfterMethod
	public void closeApplication() throws Exception {
		Thread.sleep(4000);
		driver.quit();
	}

}
