

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "/Selenium_java_Jan22/Binary/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		Thread.sleep(5000);
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement AlertBtn = driver.findElement(By.xpath("//button[@id='alertButton']"));
		AlertBtn.click();
		
		
		
	String	alertText = driver.switchTo().alert().getText();
	System.out.println(alertText);
	
	driver.switchTo().alert().accept();
	
	WebElement TimerAlertBtn = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
	TimerAlertBtn.click();
	
	wait.until(ExpectedConditions.alertIsPresent()).accept();
		
	Actions actions= new Actions(driver);
	
	WebElement Frames = driver.findElement(By.xpath("//span[text()='Frames']"));
	actions.moveToElement(Frames).build().perform();
	
	WebElement ConfirmBtn = driver.findElement(By.xpath("//button[@id='confirmButton']"));
	ConfirmBtn.click();
	
	driver.switchTo().alert().dismiss();
	
	WebElement PromptBtn = driver.findElement(By.xpath("//button[@id='promtButton']"));
	PromptBtn.click();
	
	driver.switchTo().alert().sendKeys("Utkarshaa Academy");
	driver.switchTo().alert().accept();

	}

}
