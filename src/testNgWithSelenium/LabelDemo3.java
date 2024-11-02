package testNgWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class LabelDemo3 {
	@Test	
public void LabelDemo3() throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.meghanabus.in/manage-bookings.html");
	driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id='navbar-menu']/ul[1]/li[2]/a")).click();
Thread.sleep(4000);

}
}
