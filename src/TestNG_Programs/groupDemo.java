package TestNG_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class groupDemo {

	public WebDriver driver;
	
	@Test(groups = {"openbrowser"}) 
	public void starting_Point()
	{
		System.setProperty("webdriver.chrome.driver", "/Selenium_java_Jan22/Binary/chromedriver.exe");
		
		driver = new ChromeDriver();	
		
		driver.get("https://demoqa.com/select-menu");
		
		
	}
	
	@Test(groups = {"clickNth"},dependsOnGroups = "openbrowser")
	public void click_nth() {
		driver.findElement(By.cssSelector("select>option:nth-of-type(11)")).click();
	}
}
