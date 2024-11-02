package testNgWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LabelText2WithTestNg {
	@Test
	public void LabelText2WithTestNg()
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://gmail.com");
	//driver.navigate().to("https://gmail.com");
	driver.manage().window().maximize();
	WebElement label=driver.findElement(By.xpath("//span[text()='to continue to Gmail']"));
	String actualLabelValue=label.getText();
	System.out.println(actualLabelValue);
	System.out.println("actualLabelValue : " +actualLabelValue);
	
	String expectedLabelValue="to continue to gmail";
	Assert.assertEquals(actualLabelValue, expectedLabelValue);

}


}
