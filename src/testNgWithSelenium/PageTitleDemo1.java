package testNgWithSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

public class PageTitleDemo1 {
	@Test
	public void PageTitleDemo_1()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		driver.manage().window().maximize();
		String expectedTitle="Find a Flight: Mercury Tours:";
		System.out.println("expectedTitle: " + expectedTitle);
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		// TODO Auto-generated method stub
	}

}

