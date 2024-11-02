package testNgWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
//import org.testng.asserts.Assertion;

public class PageTitleDemo2 {
	@Test
	public void PageTitleDemo_2()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		WebElement userName=driver.findElement(By.xpath("//input[@name='userName']"));
		userName.sendKeys("mercury");
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("mercury");
		WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		String titleOfWebPage=driver.getTitle();
		System.out.println(titleOfWebPage);
		String actual=titleOfWebPage;
		String Expected="Login: Mercury Tours";
		Assert.assertEquals(actual, Expected);

	}
}
