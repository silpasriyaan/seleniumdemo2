package testNgWithSelenium;// We cannot inspect alert, scroll cheyalemu ye other action cheyyalemu

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo2 {


	@Test	
	public void LabelDemo3() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.meghanabus.in/manage-bookings.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='navbar-menu']/ul[2]/li[2]/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		String alertText=driver.switchTo().alert().getText();
		System.out.println("Alert text is :"+ alertText);
		
		driver.switchTo().alert().accept();
		
		String text= driver.findElement(By.xpath("//div[@class='print_footer']")).getText();
		System.out.println(text);

	}
}



