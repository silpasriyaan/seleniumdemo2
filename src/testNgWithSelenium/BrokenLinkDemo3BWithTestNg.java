package testNgWithSelenium;

import java.net.HttpURLConnection;
import java.net.URL;

import org.testng.annotations.Test;

public class BrokenLinkDemo3BWithTestNg {
	@Test
	public void BrokenLinkDemo3B() throws Exception
	{
	  
		
			URL url=new URL("https://rbgtechnologies.com/");
			//DownCating---parent class object to child class variable
			driver.manage().window().maximize();
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
