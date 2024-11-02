package testNgWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableDemo2 {
	
	@Test
	public void DynamicWebTableDemo_2()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/table.html");
		driver.manage().window().maximize();
		String data= driver.findElement(By.xpath("//table[@border='1']")).getText();
		System.out.println(data);

}
}