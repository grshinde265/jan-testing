import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Selenium_java_Jan22/Binary/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://www.facebook.com");
		
		
		//Basic XPath
		WebElement UserEmail = driver.findElement(By.xpath("//input[@id='email']"));
		UserEmail.sendKeys("ravinangre@gmail.com");
		
		// Contains XPath
		WebElement UserPass = driver.findElement(By.xpath("//input[contains(@class,'_9npi')]"));
		UserPass.sendKeys("1234567876543");
	
		// Contains XPath
		
		//WebElement LoginBtn = driver.findElement(By.xpath("//button[contains(@id,'u_0_d')]"));
		//LoginBtn.click();
		
		//Or
		
	//	WebElement LoginBtn = driver.findElement(By.xpath("//button[@id='u_0_d_Rj' or @name='login']"));
	//	LoginBtn.click();
		
		//and
	//	WebElement LoginBtn = driver.findElement(By.xpath("//button[@type='submit' and @name='login']"));
	//	LoginBtn.click();
		
		// Starts With
		
	//	WebElement LoginBtn = driver.findElement(By.xpath("//button[starts-with(@class,'_42ft ')]"));
//		WebElement LoginBtn = driver.findElement(By.xpath("//button[starts-with(@id,'u_0')]"));

	//	LoginBtn.click();

		// Xpath Text Method
	//	WebElement CreateAcc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	//	CreateAcc.click();
		
		// Xpath Contains Text Method
		WebElement CreateAcc = driver.findElement(By.xpath("//a[contains(text(),'Acco')]"));
		CreateAcc.click();
		
		
	}

}
