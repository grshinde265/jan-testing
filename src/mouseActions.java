import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "/Selenium_java_Jan22/Binary/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Actions act = new Actions(driver);
		
		WebElement Jobs = driver.findElement(By.xpath("//div[text()='Jobs']"));
		
		act.moveToElement(Jobs).perform();
		driver.get("https://demoqa.com/buttons");
		
		
		WebElement DoubleClickBtn = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		WebElement RightClickBtn = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		WebElement DynamicClick = driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		
		
		// Double Click with same method name as doubleClick()
		act.doubleClick(DoubleClickBtn).perform();
		
		// For Right Click we use contextClick()
		act.contextClick(RightClickBtn).perform();

		// For regular click we use click()
		act.click(DynamicClick).perform();
		
		driver.get("https://demoqa.com/droppable");
		
		WebElement Source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement Target = driver.findElement(By.xpath("//div[@id='draggable']//following-sibling::div[@id='droppable']"));
		
		// for Drag and Drop Actions we use deagAndDrop
		act.dragAndDrop(Source, Target).perform();
		
		WebElement dragable = driver.findElement(By.xpath("//div[text()='Book Store Application']"));
		
		// for scrolling the page we use moveToelement Method
		act.moveToElement(dragable).perform();
		
		driver.get("https://demoqa.com/tool-tips");
		
		WebElement toolTipButton = driver.findElement(By.xpath("//button[@id='toolTipButton']"));
		
		// for mouse hover the page we use moveToelement Method
		act.moveToElement(toolTipButton).perform();
		
		WebElement ToolTipText = driver.findElement(By.xpath("//div[@id='buttonToolTip']"));
		
		System.out.println(ToolTipText.getText());
		
		driver.get("https://demoqa.com/frames");
		
		String MainWindow = driver.getWindowHandle(); 
		
		driver.switchTo().frame("frame2");
		WebElement frametext = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(frametext.getText());
		
		driver.switchTo().window(MainWindow);
		
		WebElement pageText = driver.findElement(By.xpath("//div[contains(text(),'Sample Iframe')]"));
		System.out.println(pageText.getText());
		
	}

}
