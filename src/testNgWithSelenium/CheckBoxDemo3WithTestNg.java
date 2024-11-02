package testNgWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxDemo3WithTestNg {
	@Test
	public WebElement CheckBoxDemo3WithTestNg()
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://faculty.washington.edu/chudler/java/boxes.html");
	WebElement multipleCheckBoxes = driver.findElement(By.xpath("(//input[@type='checkbox'])[5])"));
	return multipleCheckBoxes;
	}
	WebElement multipleCheckBoxes=CheckBoxDemo3WithTestNg();
	
	//boolean checkBoxDisplayed=multipleCheckBoxes.isDisplayed();
	@Test(priority=1)
	public void checkBoxDisplayed(){
		Assert.assertTrue(multipleCheckBoxes.isDisplayed(),"CheckBox is Not Displayed");
	}	
	//boolean checkBoxEnabled=multipleCheckBoxes.isEnabled();
	@Test(priority=2)
	public void checkBoxEnabled(){
		Assert.assertTrue(multipleCheckBoxes.isEnabled(),"CheckBox is Not Enabled");
	}
	//boolean checkBoxSelected=multipleCheckBoxes.isSelected();
	
	//boolean checkBoxSelected1=multipleCheckBoxes.isSelected();

	@Test(priority=3)
	public void selected(){
		multipleCheckBoxes.click();
		Assert.assertTrue(multipleCheckBoxes.isSelected(),"CheckBox is Not Selected");
	}	

	@Test(priority=4)
	public void click(){
		multipleCheckBoxes.click();
		Assert.assertFalse(multipleCheckBoxes.isSelected(),"CheckBox is Not Selected");
	}


}
