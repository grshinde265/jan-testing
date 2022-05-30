import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardactDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "/Selenium_java_Jan22/Binary/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement FullName = driver.findElement(By.xpath("//input[@id='userName']"));
		
		act.sendKeys(FullName, "Ravi Nangare").perform();
		
		act.sendKeys(Keys.TAB).perform();
		
		act.sendKeys("ravinangre@gmail.com").perform();
		
		act.sendKeys(Keys.TAB).perform();
		
		act.sendKeys("At Post Lokhandi Sawargaon Tal Ambajogai Dist Beed Pin 431517").perform();
		
		// selecting the Text
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.build().perform();
		
		act.keyUp(Keys.CONTROL).perform();
		
		// Copy the Selected Text
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.build().perform();
		
		act.keyUp(Keys.CONTROL).perform();

		// Paste the Selected Text
		act.sendKeys(Keys.TAB).perform();
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.build().perform();
		
		act.keyUp(Keys.CONTROL).perform();
		
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.ENTER).perform();
	}

}
