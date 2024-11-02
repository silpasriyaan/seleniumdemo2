package testNgWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LabelText3 {
	@Test
public void LabelText_3()
{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://only-testing-blog.blogspot.com/2015/01/iframe1.html");
	driver.manage().window().maximize();
	driver.switchTo().frame(1);
	WebElement Xpath=driver.findElement(By.xpath("//span[text()='Saturday 3 January 2015']"));

String expectedData="Saturday, 3 January 2015";
String actualData=Xpath.getText();
Assert.assertEquals(actualData, expectedData);

}
}
