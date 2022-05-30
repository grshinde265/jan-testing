import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class handleWindowDEmo {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "/Selenium_java_Jan22/Binary/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String MainWindow = driver.getWindowHandle();
		
		WebElement NewTab = driver.findElement(By.xpath("//button[@id='tabButton']"));
		
		NewTab.click();
		
		Set<String> childWindows = driver.getWindowHandles();
		
		Iterator<String> itr = childWindows.iterator();
		
		while(itr.hasNext())
		{
			
			String childWindow = itr.next();
			if(!MainWindow.equalsIgnoreCase(childWindow))
			{
				driver.switchTo().window(childWindow);
				String pageText = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
				System.out.println(pageText);
			}
		}
		driver.switchTo().window(MainWindow);
		driver.quit();
	}
}
