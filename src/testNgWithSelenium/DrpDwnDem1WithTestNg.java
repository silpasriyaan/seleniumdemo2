package testNgWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DrpDwnDem1WithTestNg {

	@Test
	public void dropDown(){

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.meghanabus.in/index.html");
		driver.manage().window().maximize();
		WebElement dropDown = driver.findElement(By.xpath("//*[@id='search-origin']/div[1]/div"));
		dropDown.click();
		WebElement list = driver.findElement(By.xpath("//*[@id='search-origin']/div[2]/div/div/div/ul/li[6]"));
		list.click();
		WebElement text = driver.findElement(By.xpath("//*[@id='search-origin']/div[1]/div/div/div[2]"));
		String actualText = text.getAttribute("title");
		System.out.println(actualText);
	} 	
	
		
}
