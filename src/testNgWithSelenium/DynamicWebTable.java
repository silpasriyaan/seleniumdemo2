package testNgWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/table.html");
        driver.manage().window().maximize();
       String xpath1="/html/body/table/tbody/tr[";
       String xpath2="]/td[";
       String xpath3="]";
       
       int rowcount=driver.findElements(By.xpath("/html/body/table/tbody/tr")).size();
       System.out.println(rowcount);
       for(int i=1;i<=rowcount;i++)
       {
           int coloumncount=driver.findElements(By.xpath("/html/body/table/tbody/tr["+i+"]/td")).size();
           for(int j=1;j<=coloumncount;j++)
           {
        	   String data=driver.findElement(By.xpath(xpath1+i+xpath2+j+xpath3)).getText();
           System.out.println(data);
           }
       }
    	   
      
	}

}
