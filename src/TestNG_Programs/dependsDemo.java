package TestNG_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dependsDemo {
	public WebDriver driver;
	@Test
	public void signIn()
	{
		driver.findElement(By.id("email")).sendKeys("ravinangre@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("1234543234");
		
		driver.findElement(By.name("login")).click();
		
	}
	@Test
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Selenium_java_Jan22/Binary/chromedriver.exe");
		
		driver = new ChromeDriver();	
		
		driver.get("https://www.facebook.com");
	}
	@Test(dependsOnMethods = {"signIn","openBrowser"})
	public void closeBrowser()
	{
		driver.close();
	}
}

