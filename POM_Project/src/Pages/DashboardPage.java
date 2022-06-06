package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DashboardPage {

	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
	}
	
// Object Repository	
	By searchBox = By.xpath("//input[contains(@placeholder,'Search')]");
	By MRF_NSE = By.xpath("//span[contains(text(),'MRF')]//following-sibling::span[contains(text(),'NSE')]");
	By Add_Btn = By.xpath("//button[@class='button-green']");
	By ProfileBtn = By.xpath("//span[contains(text(),'XA0634')]");
	By Logout = By.xpath("//a[contains(text(),'Logout')]");
	
	public void updateWatchList() {
		driver.findElement(searchBox).sendKeys("MRF");
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'MRF')]//following-sibling::span[contains(text(),'NSE')]"))).build().perform();
//		actions.moveToElement((WebElement) MRF_NSE).build().perform();
		driver.findElement(Add_Btn).click();
	}
	public void logout() {
		driver.findElement(ProfileBtn).click();
		driver.findElement(Logout).click();
	}
}
