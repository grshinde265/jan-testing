import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class jsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "/Selenium_java_Jan22/Binary/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
	//	driver.get("https://www.browserstack.com/users/sign_in");
	//	driver.navigate().to("https://www.browserstack.com/users/sign_in");
		// launching a url using window.location 
		js.executeScript("window.location='https://www.browserstack.com/users/sign_in'");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// for against sendkeys
		js.executeScript("document.getElementById('user_email_login').value='ravinangare@gmail.com'");
		
		WebElement Password = driver.findElement(By.xpath("//input[@name='user[password]']"));
		// for against sendkeys
		js.executeScript("arguments[0].value='123565776543';", Password);
		
		WebElement SubmitBtn = driver.findElement(By.xpath("//input[@id='user_submit']"));
		//SubmitBtn.click();
		
		// For click
	//	js.executeScript("arguments[0].click();", SubmitBtn);
		
		// custom alert
	//	js.executeScript("alert('Hi Vivek please enter correct login credentials to continue');");
		
	//	driver.switchTo().alert().accept();
		driver.get("https://www.flipkart.com/");
		
		WebElement Treding = driver.findElement(By.xpath("//h2[text()='Grocery/Supermart']"));
		// For scroll 
		js.executeScript("arguments[0].scrollIntoView();", Treding);
		//js.executeScript("window.scrollBy(0,1000)");

	}

}
