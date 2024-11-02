package testNgWithSelenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class iFrameDemo2 {
	@Test
	public void lable() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/Downloads/Iframe1%20(1).html");
		driver.manage().window().maximize();
		driver.switchTo().frame(0).switchTo().frame(0);
		Thread.sleep(50000);		
		//WebElement label = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/h2/span"));
		WebElement label = driver.findElement(By.xpath("//span[contains(text(),'3 January')]"));
		
		String actualLabel = label.getText();
		System.out.println("actualLabel :"+ actualLabel);
		String expectedLabel = "Saturday 3 January 2015";
		Assert.assertEquals(actualLabel, expectedLabel);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		//driver.switchTo().parentFrame();
	driver.findElement(By.xpath("//input[@name='Town']")).sendKeys(actualLabel);
	Thread.sleep(4000);
	driver.quit();
	}
}

