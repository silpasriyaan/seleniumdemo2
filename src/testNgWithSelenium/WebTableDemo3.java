package testNgWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://mock.bseindia.com/markets/equity/EQReports/mktwatchR.html?filter=gainer*all$all$");
        driver.manage().window().maximize();
       String xpath1="//*[@id='fontSize']/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/thead/tr";
      // String xpath2="]/td[";
       //String xpath3="]";
       
       int rowcount=driver.findElements(By.xpath("//*[@id='fontSize']/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/thead/tr")).size();
       System.out.println(rowcount);
//       for(int i=1;i<=rowcount;i++)
//       {
//           int coloumncount=driver.findElements(By.xpath("/html/body/table/tbody/tr["+i+"]/td")).size();
//           for(int j=1;j<=coloumncount;j++)
//           {
        	//   String data=driver.findElement(By.xpath(xpath1+i+xpath2+j+xpath3)).getText();
          // System.out.println(data);
//           }
//       }
//    	   
      
	}

}
