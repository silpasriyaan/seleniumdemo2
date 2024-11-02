package SeleniumDemosPgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test
public class DropDownDemo2 {
	
	public void DropDownDemo_2(){
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.meghanabus.in/index.html");	
		driver.manage().window().maximize();
		// WebElement dropDown= driver.findElement(By.xpath("//div[@title='Allagadda'] "));
		driver.findElement(By.xpath("//*[@id='search-origin']/div[2]/div/div/div/ul/li[6]")).click();

		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='search-origin']/div[2]/div/div/div/ul/li[6]")),"Allagadda", null);
	//boolean	dropDownSelected =driver.findElement(By.xpath("//*[@id='search-origin']/div[2]/div/div/div/ul/li[6]")).isSelected();
	WebElement dropDownSelected;
	Assert.assertFalse(dropDownSelected.isSelected(),"dropDownSelected is Not Selected");

	
	//@Test(priority=2)
	public void click()
	{
		dropDownSelected.click();
		Assert.assertFalse(dropDownSelected.isSelected(),"dropDownSelected is Not Selected");
	}

	
	
		//Select obj=new Select(option);
		//obj value="Allagadda";

		//obj.selectByIndex(6);
		//obj.selectByVisibleText("Allagadda");//accurate ga eee data kavali
		//obj.selectByValueattribute----localization testinng diff countries langs
	}

}
