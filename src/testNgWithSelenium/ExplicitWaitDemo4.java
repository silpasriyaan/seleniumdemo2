package testNgWithSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitDemo4 {
	@Test
	public void ExplicitWaitDemoCase2() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
	    driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id='ContentHolder_lbFeatures_TG_D']")).click();
	   
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Model10']")));
	    driver.findElement(By.xpath("//*[text()='Model10']")).click();
	    
	   driver.findElement(By.xpath("//*[@id='ContentHolder_lbFeatures_Bluetooth_D']")).click();
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Model11']")));
	    driver.findElement(By.xpath("//*[text()='Model11']")).click();
	
	}
	}