package testNgWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LabelText1WithTestNg {
	@Test
	public void LabelText1WithTestNg()
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://gmail.com");
	driver.manage().window().maximize();
	WebElement label=driver.findElement(By.xpath("//span[text()='to continue to Gmail']"));
	String actualLabelValue=label.getText();
	
	String expectedLabelValue="to continue to Gmail";
	
	Assert.assertEquals(actualLabelValue, expectedLabelValue);
}

}


