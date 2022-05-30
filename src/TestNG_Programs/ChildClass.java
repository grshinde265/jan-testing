package TestNG_Programs;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ChildClass extends BaseClass {

	@Test(dependsOnMethods = "openBrowser")
	public void signIn()
	{
		driver.findElement(By.id("email")).sendKeys("ravinangre@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("1234543234");
		
		driver.findElement(By.name("login")).click();
		
	}
}
