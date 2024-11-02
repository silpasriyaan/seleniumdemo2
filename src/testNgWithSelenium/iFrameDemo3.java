package testNgWithSelenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class iFrameDemo3 {
	@Test
	public void lable() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/Downloads/Iframe1%20(1).html");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		Thread.sleep(50000);		
	
		WebElement label = driver.findElement(By.xpath("//span[contains(text(),'31 January')]"));
		
		String actualLabel = label.getText();
		System.out.println("actualLabel :"+ actualLabel);
		String expectedLabel = "Saturday 31 January 2015";
		Assert.assertEquals(actualLabel, expectedLabel);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(actualLabel);
	}
}

