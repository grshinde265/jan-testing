import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class launch_chrome {

	public static void main(String[] args) throws InterruptedException, IOException  {

		
		FileInputStream srcfile = new FileInputStream("D:\\Selenium_java_Jan22\\data.properties");
		
		Properties prop = new Properties();
		
		prop.load(srcfile);
		
		System.setProperty(prop.getProperty("driverkey"), prop.getProperty("driverpath"));
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		
		
		
		
		driver.get(prop.getProperty("URL"));

		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
	//	WebElement Jobs = driver.findElement(By.xpath("//div[text()='Jobs']"));
		
//		WebElement comp = driver.findElement(By.xpath("//div[text()='Companies']"));
		
		
	//	Jobs.click();
		
	//	comp.click();
		
	//	Thread.sleep(2000);
		
	//	driver.quit();
		
		WebElement Login = driver.findElement(By.xpath("//div[text()='Login']"));
		Login.click();
		
		Thread.sleep(1000);
		
		WebElement UserName = driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]"));
		
		UserName.sendKeys(prop.getProperty("username"));
		
		WebElement Password = driver.findElement(By.xpath("//input[contains(@placeholder,'password')]"));
		Password.sendKeys(prop.getProperty("password"));
		
	}

}
