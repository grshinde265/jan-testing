import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "/Selenium_java_Jan22/Binary/msedgedriver.exe");
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new EdgeDriver(options);
		driver.get("https://www.facebook.com");
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 //	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);   old selenium method 3.141.59
		
		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement CreateNewAcc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		CreateNewAcc.click();
		
	//	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='firstname']"))).sendKeys("Ravi");
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		FirstName.sendKeys("Ravi");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='websubmit']"))).click();
		
		WebElement SubmitBtn = driver.findElement(By.xpath("//button[@name='websubmit']"));
		SubmitBtn.click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert('Welcome to Utkarshaa Academy');");
			
		FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		wait1.until(ExpectedConditions.alertIsPresent()).accept();
		
		
	}

}
