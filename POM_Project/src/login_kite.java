import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class login_kite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","D:\\Selenium_java_Jan22\\Binary\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://kite.zerodha.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("XA0634");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sarika699!");
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("691991");
		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("mrf");
		
		WebElement MRF_NSE =driver.findElement(By.xpath("//span[contains(text(),'MRF')]//following-sibling::span[contains(text(),'NSE')]"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(MRF_NSE).build().perform();
		
		driver.findElement(By.xpath("//button[@class='button-green']")).click();
		
	}

}
