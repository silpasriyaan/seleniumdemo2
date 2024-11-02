package SeleniumDemosPgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class DrpDwnDem1 {

	@Test
	public void testCase1()
	{
		 WebDriver driver = new FirefoxDriver();
	     driver.get("meghanabus.in/index.html/");
	 	driver.manage().window().maximize();
	     WebElement dropdown= driver.findElement(By.xpath("//select[@name='toMonth']"));
	     Select x = new Select(dropdown);
	    // x.selectByIndex(2);
	       x.selectByVisibleText("Allagadda");
	     
	    
	}	     
	
	
	
	
	
	
	
	
	
}
