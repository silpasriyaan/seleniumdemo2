package testNgWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class iFrameDemo1 {
	@Test
public void iFrameDemo_1()//dheello koncham errors vunnai
{
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://only-testing-blog.blogspot.com/2015/01/iframe1.html");
		driver.manage().window().maximize();

		
		
	//WebDriver driver=new FirefoxDriver();
	//driver.get("http://only-testing-blog.blogspot.com/2015/01/iframe1.html");
	driver.switchTo().frame("frame_a");
	WebElement Xpath=driver.findElement(By.xpath("//span[text()='Saturday 3 January 2015']"));
System.out.println(Xpath);
String expectedData="Saturday 3 January 2015";
String actualData=Xpath.getText();
Assert.assertEquals(actualData, expectedData);

}
}

