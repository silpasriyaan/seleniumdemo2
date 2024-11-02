package SeleniumDemosPgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LabelText2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://gmail.com");
		//driver.navigate().to("https://gmail.com");
		driver.manage().window().maximize();
		WebElement label=driver.findElement(By.xpath("//span[text()='to continue to Gmail']"));
		String actualLabelValue=label.getText();
		System.out.println(actualLabelValue);
		System.out.println("actualLabelValue : " +actualLabelValue);
		
		String expectedLabelValue="to continue to gmail";
		if(actualLabelValue.equals(expectedLabelValue))
		{
			System.out.println("Data is matching");
			
		}
		else
		{
			System.out.println("data is not matching");
		}
	}

}
