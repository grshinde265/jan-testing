package TestNG_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupsDependency {

	public WebDriver driver;
	@Test(groups = "SignIn")
	public void signIn()
	{
		driver.findElement(By.id("email")).sendKeys("ravinangre@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("1234543234");
		
		driver.findElement(By.name("login")).click();
		
	}
	@Test(groups = "OpenBrowser")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Selenium_java_Jan22/Binary/chromedriver.exe");
		
		driver = new ChromeDriver();	
		
		driver.get("https://www.facebook.com");
		Reporter.log("We use Chrome driver 100 for lauch chrome browser",true);
	}
	@Test(groups = "CloseBrowser")
	public void closeBrowser()
	{
		driver.close();
	}
	@Test(groups = "ViewAcc")
	public void viewAcc()
	{
		System.out.println("User successfully view there account");
	}
	@Test(enabled = false)
	public void abc()
	{
		System.out.println("abc false");
	}
	
}
