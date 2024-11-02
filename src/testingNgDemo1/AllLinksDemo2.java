package testingNgDemo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksDemo2 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	   driver.get("https://www.bbc.com/");
	  // List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
	   List<WebElement> allLinks=  driver.findElements(By.tagName("a"));
		int linksCount=allLinks.size();
		for(int i=0;i<linksCount;i++)
		{
		WebElement linkElement=allLinks.get(i);
		String linkText=linkElement.getText();
		System.out.println("linkText :" +linkText);
		}
}
	
}
