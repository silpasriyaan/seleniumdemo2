package SeleniumDemosPgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BrokenLinkDemo3 {
	@Test
	public void funA()
	{
	    SoftAssert sAssrt=new SoftAssert();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/Downloads/link2.html");
		driver.manage().window().maximize();
		WebElement link=driver.findElement(By.tagName("a"));
	    String actualLinkValue=link.getAttribute("href");
		sAssrt.assertEquals(actualLinkValue,"","link is broken");
		System.out.println("Done");
	}

}
