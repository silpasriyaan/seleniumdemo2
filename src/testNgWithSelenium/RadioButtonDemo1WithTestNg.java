package testNgWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonDemo1WithTestNg {
	@Test
	public WebElement RadioButtonDemo1WithTestNg()
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/reservation.php");
	driver.manage().window().maximize();
	WebElement radiobutton = driver.findElement(By.xpath("//input[@value='oneway' and @name='tripType']"));
	return radiobutton;
	}
	WebElement radiobutton =RadioButtonDemo1WithTestNg();
	
	@Test(priority=1)
	public void display(){
		Assert.assertTrue(radiobutton.isDisplayed(),"radioButton is  Displayed");
	}		

	@Test(priority=2)
	public void enabled(){
		Assert.assertTrue(radiobutton.isEnabled(),"radioButton is Enabled");
	}	
	
	
	@Test(priority=3)
	public void selected(){
		radiobutton.click();
		Assert.assertTrue(radiobutton.isSelected(),"radioButton is Not Selected");
	}	
	@Test(priority=4)
	public void click(){
		radiobutton.click();
		Assert.assertFalse(radiobutton.isSelected(),"radioButton is Selected after Click");
	}
}



