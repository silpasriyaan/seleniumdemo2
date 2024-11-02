package testNgWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FbPassWdLabelDemo2WithTestNg {
	@Test
	public WebElement FbPassWdLabelDemo2WithTestNg()
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement inputbox=driver.findElement(By.xpath("//input[@name='pass']"));
	return inputbox;
	}
	
	@Test
	public void display()
	{
		Assert.assertTrue(inputbox.isDisplayed(), "PassWdinput box is displaying");
	}
	boolean PassWdinputBoxisEnabled=driver.findElement(By.xpath("//input[@name='pass']")).isEnabled();
	if(PassWdinputBoxisEnabled==true){
		System.out.println("inbut box is enabled");}
	else {
		System.out.println("input box is disabled");}
	String actualWaterMarkValue=driver.findElement(By.xpath("//input[@name='pass']")).getAttribute("placeholder");
	String expectedWaterMarkValue="Password";
	if(actualWaterMarkValue.contentEquals(expectedWaterMarkValue)){
		System.out.println("WaterMark is displayed correctly");}
	else{
		System.out.println("WaterMark is not displayed correctly");
	}
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Hello world");
	String enteredData=driver.findElement(By.xpath("//input[@name='pass']")).getAttribute("value");
	System.out.println("enteredData : "+ enteredData);
	//driver.findElement(By.xpath("//input[@name='pass']")).clear();
}

}
