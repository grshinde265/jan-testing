import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAxesDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Selenium_java_Jan22/Binary/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://www.facebook.com");
		
		//WebElement UserId = driver.findElement(By.xpath("//*[@name='email']"));
		
		// Preceding Xpath Axes
		WebElement UserId = driver.findElement(By.xpath("//div[@class='_6luv _52jv']//descendant::input[3]"));
		
	
		WebElement UserPass = driver.findElement(By.xpath("//button[@name='login']//preceding::input[3]"));
		
		UserId.sendKeys("ravinangre");
		UserPass.sendKeys("1234554321");
		
		// Child Xpath Axes
	//	WebElement Loginbtn = driver.findElement(By.xpath("//form[@class='_9vtf']//child::button"));
	//	Loginbtn.click();
		
	//	WebElement ForgotPassLink = driver.findElement(By.xpath("//form[@class='_9vtf']//child::a[text()='Forgotten password?']"));
	//	ForgotPassLink.click();
		
		// Following-sibling 
//		WebElement Messenger = driver.findElement(By.xpath("//a[text()='Sign Up']//ancestor::li//following-sibling::li[2]"));
//		Messenger.click();

		WebElement Languages = driver.findElement(By.xpath("//a[@title='Gujarati']//parent::li//preceding-sibling::li[3]"));
		Languages.click();
	}

}
