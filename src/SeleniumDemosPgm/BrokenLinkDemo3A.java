package SeleniumDemosPgm;

import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Test
public class BrokenLinkDemo3A {
	public void funA() throws Exception
	{
	    SoftAssert sAssrt=new SoftAssert();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/Downloads/BrokenLink1.html");
		driver.manage().window().maximize();
		WebElement link=driver.findElement(By.tagName("a"));
	    String actualLinkValue=link.getAttribute("href");
	    if(actualLinkValue.equals(""))
		{
			throw new Exception("Link is broken");
		
		}
		else
		{
			URL url=new URL(actualLinkValue);
			HttpURLConnection httpURLConnection=(HttpURLConnection) url.openConnection();//zero paramaetised
			httpURLConnection.connect();
		
			int getResponseCode=httpURLConnection.getResponseCode();
			if(getResponseCode>=400)
			{
				System.out.println("link is broken");
			}else
			{
				System.out.println("Link is invoking");
			}
		}
	    System.out.println("done");
	}

}
