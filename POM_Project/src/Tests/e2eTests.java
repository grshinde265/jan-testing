package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import Pages.DashboardPage;
import Pages.LoginPage;

public class e2eTests {
	
public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.edge.driver","D:\\Selenium_java_Jan22\\Binary\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://kite.zerodha.com");
	driver.manage().window().maximize();
	
	LoginPage login = new LoginPage(driver);
	
	DashboardPage dpage = new DashboardPage(driver);
	
	login.clickLogin("XA0634","Sarika699!");
	Thread.sleep(2000);
	
	login.clickPin("691991");
	Thread.sleep(2000);
	
	dpage.updateWatchList();
	
	dpage.logout();
}
}
