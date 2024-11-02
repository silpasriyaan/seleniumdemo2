package SeleniumDemosPgm;

import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class BrokenLinkDemo3B {
	@Test
	public void BrokenLinkDemo3B() throws Exception
	{
	  
		
			URL url=new URL("https://rbgtechnologies.com/");
			driver.manage().window().maximize();
			//DownCating---parent class object to child class variable
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
			System.out.println(getResponseCode);
			System.out.println("done");
	}
	    
	}


