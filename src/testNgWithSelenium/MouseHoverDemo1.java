package testNgWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverDemo1 {
	@Test
	public void TestCase1()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement countryFlag=driver.findElement(By.xpath("//*[@id='icp-nav-flyout']/span/span[2]/span[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(countryFlag).perform();
		WebElement changeCountry=driver.findElement(By.xpath("//*[@id='icp-nav-flyout']"));
		changeCountry.click();
		//driver.quit();
	}
}


