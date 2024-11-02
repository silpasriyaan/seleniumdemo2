package testNgWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MercuryLabelDemo2WithTestNg {
	@Test
	public WebElement MercuryLabelDemo2WithTestNg()
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		WebElement userNameInputBox=driver.findElement(By.xpath("//input[@name='userName']"));
		return userNameInputBox;
	}
	WebElement userNameInputBox=MercuryLabelDemo2WithTestNg();
	@Test(priority=1)
		public void display()
		{
			
		Assert.assertTrue(userNameInputBox.isDisplayed(), "UserName InputBox is Displaying");
		
		}
	@Test(priority=2)
	public void enabled()
	{
		Assert.assertTrue(userNameInputBox.isEnabled(),"UserName InputBox is enabled");
	}
		
			@Test(priority=3)
		public void dataMatched()
		{
		userNameInputBox.sendKeys("SilpaPamula");
		String enteredValue=userNameInputBox.getAttribute("value");
		System.out.println("EnteredData : "+enteredValue);
		
		String actualData=userNameInputBox.getAttribute("value");
		String expectedData="SilpaPamula";
		Assert.assertEquals(actualData, expectedData,"Data is matching");
		//userNameInputBox.clear();
	}

}
