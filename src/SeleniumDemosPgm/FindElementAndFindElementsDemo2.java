package SeleniumDemosPgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementAndFindElementsDemo2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.findElements(By.xpath("//input[@id='rbg']"));
		System.out.println("Done");
	}

}
