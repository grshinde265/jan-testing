package TestNG_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass {
	public WebDriver driver;
	@Test
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Selenium_java_Jan22/Binary/chromedriver.exe");
		
		driver = new ChromeDriver();	
		
		driver.get("https://www.facebook.com");
	}
	@Test(priority = 1)
	public void closeBrowser()
	{
		driver.close();
	}
}
