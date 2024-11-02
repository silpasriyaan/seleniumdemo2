package SeleniumDemosPgm;//Mercury site UserName without xpath at multiple places

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryLabelDemo2 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/");
	driver.manage().window().maximize();
	WebElement userNameInputBox=driver.findElement(By.xpath("//input[@name='userName']"));
	boolean inputBoxDisplyed=userNameInputBox.isDisplayed();
	if(inputBoxDisplyed==true)
	{
		System.out.println("UserName inputbox is displayed");
	}
	else
	{
		System.out.println("UserName inputbox is not displayed");
	}
	
	boolean inputBoxEnabled=userNameInputBox.isEnabled();
	if(inputBoxEnabled==true)
	{
		System.out.println("UserName inputbox is enabled");
	}
	else
	{
		System.out.println("UserName inputbox is not enabled");
	}
	userNameInputBox.sendKeys("SilpaPamula");
	String enteredValue=userNameInputBox.getAttribute("value");
	System.out.println("EnteredData : "+enteredValue);
	
	String actualData=userNameInputBox.getAttribute("value");
	String expectedData="SilpaPamula";
	if(actualData.equals(expectedData))
	{
		System.out.println("ActualData is Matched");
	}
	else{
		System.out.println("ActualData is not matched");
	}
	//userNameInputBox.clear();
}
}
