import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class windowHandleDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "/Selenium_java_Jan22/Binary/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String MainWindow = driver.getWindowHandle();
		
		WebElement Jobs = driver.findElement(By.xpath("//div[text()='Jobs']"));
		
		Jobs.click();
		
		WebElement Companies = driver.findElement(By.xpath("//div[text()='Companies']"));
		
		Companies.click();
		
		WebElement Services = driver.findElement(By.xpath("//div[text()='Services']"));
		
		Services.click();
		
		
		Set<String> childWindows = driver.getWindowHandles();
		
		Iterator<String> itr = childWindows.iterator();
		
		while(itr.hasNext())
		{
			
			String childWindow = itr.next();
			if(!MainWindow.equalsIgnoreCase(childWindow))
			{
				driver.switchTo().window(childWindow);
				if (driver.getTitle().contains("Browse Jobs by Company")) {
				WebElement skils = driver.findElement(By.xpath("//input[contains(@placeholder,'Skills, Designations, Companies')]"));
				WebElement location = driver.findElement(By.xpath("//input[contains(@placeholder,'Location/Locality')]"));
				WebElement SearchButton = driver.findElement(By.xpath("//button[@class='qsbSrch blueBtn']"));
				
				skils.sendKeys("Selenium webdriver");
				location.sendKeys("Pune");
				SearchButton.click();
				}	
				else if(driver.getTitle().contains("Resume Writing Services")) {
					System.out.println(driver.getTitle());
				}
				
			}
		}
		driver.switchTo().window(MainWindow);
		driver.quit();
	}

}
