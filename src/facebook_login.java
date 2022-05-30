import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_login {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Selenium_java_Jan22/Binary/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		WebElement UserEmail =	driver.findElement(By.cssSelector("input[id^='em']"));
		
		UserEmail.sendKeys("ravinangre@gmail.com");
		
		UserEmail.clear();
	
		UserEmail.sendKeys("9423111564");
		
	// id	
		
		WebElement UserPassword = driver.findElement(By.cssSelector("input[id$='ss']"));
		
		UserPassword.sendKeys("12345654321");
		
	// name	
		
		WebElement LoginBtn = driver.findElement(By.cssSelector("button[class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
		
		
	// tagname	
	//	WebElement LoginBtn = driver.findElement(By.tagName("button"));
		
		LoginBtn.click();
		
    //partial link text  & Link Text		
		
	//	WebElement ForgotPass = driver.findElement(By.partialLinkText("password"));
	//	ForgotPass.click();

	//	WebElement CreateNewAcc = driver.findElement(By.LinkText("Create New Account"));
	//	CreateNewAcc.click();
		
	//	driver.findElement(By.partialLinkText("Voting")).click();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		driver.quit();
		
	}

}
