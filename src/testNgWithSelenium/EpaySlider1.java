package testNgWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class EpaySlider1 {
	@Test
	public void EpaySliderDemo1()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.epay.com/epayweb/user/login");
		driver.manage().window().maximize();
		//driver.switchTo().frame(0);
		WebElement slider=driver.findElement(By.className("slider"));

		Actions act=new Actions(driver);
		act.dragAndDropBy(slider, 120, 0).perform();

	}

}
