package SeleniumDemosPgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BrokenLinkDemo2 {


	@Test
	public void funA()
	{
	    
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/Downloads/link2.html");
		driver.manage().window().maximize();
		WebElement link=driver.findElement(By.tagName("a"));
	    String actualLinkValue=link.getAttribute("href");
       Assert.assertNotEquals(actualLinkValue,"","link is broken");
		System.out.println("Done");
	}

}
