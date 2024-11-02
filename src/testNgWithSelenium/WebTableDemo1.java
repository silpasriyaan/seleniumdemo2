package testNgWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


@Test
public class WebTableDemo1 {
	public void WebTableDemo_1()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");
		driver.manage().window().maximize();
		String data= driver.findElement(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[1]/td[1]")).getText();

		System.out.println(data);
		String data2= driver.findElement(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[1]/td[2]")).getText();

		System.out.println(data2);
		String data3= driver.findElement(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[2]/td[1]")).getText();

		System.out.println(data3);
		String data4= driver.findElement(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table")).getText();

		System.out.println(data4);
		String xpath1 = "//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[";  //Direct Literal object
		System.out.println(xpath1);
		String xpath2 = "]/td[";
		String xpath3 = "]";

		int totalRows = driver.findElements(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr")).size();
		int totalColoumns= driver.findElements(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[1]/td")).size();

		for(int i=1; i<=totalRows;i++)
		{
			for(int j=1; j<=totalColoumns; j++)
			{
				System.out.println("xpath :" +xpath1+xpath2+xpath3);
				String totalData= driver.findElement(By.xpath(xpath1+i+xpath2+j+xpath3)).getText();
				System.out.println(totalData);
			}
		}
	}
}
