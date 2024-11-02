package testNgWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FBLabelInputBoxDemo1WithTesNg {
	@Test
	public WebElement FBLabelInputBoxDemo1WithTesNg()
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
WebElement inputbox=driver.findElement(By.xpath("//input[@id='email']"));
//Dimension size=inputbox.getSize();//It gives height & width 
//System.out.println(size);

return inputbox;

	}
	WebElement inputbox=FBLabelInputBoxDemo1WithTesNg();
	
	@Test(priority=1)
	public void inputboxdisplayed(){
		Assert.assertTrue(inputbox.isDisplayed(),"CheckBox is Not Displayed");
	}	
	
	
	@Test(priority=2)
	public void inputboxenabled(){
		Assert.assertTrue(inputbox.isEnabled(),"inputbox is Not Enabled");
	}
	@Test(priority=3)
		public void waterMarkDisplayed()
		{
	String actualWaterMarkValue=inputbox.getAttribute("placeholder");
	String expectedWaterMarkValue="Email address or phone number";

	Assert.assertEquals(actualWaterMarkValue,expectedWaterMarkValue,"TextData is  Matched");
	//inputbox.sendKeys("rbg hyd");
	String enteredData=inputbox.getAttribute("value");
	System.out.println("enteredData : "+ enteredData);
	//driver.findElement(By.xpath("//input[@id='email']")).clear();
}

}
