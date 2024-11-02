package Seminars;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckBox {
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://faculty.washington.edu/chudler/java/boxes.html");
		int k[]={15,7,23};
		clickCheckboxes(k);

	}
	public static void clickCheckboxes(int[] arr)
	{
		List<WebElement>checkList=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0;i<arr.length;i++)
		{
			checkList.get(arr[i]-1).click();
		}
	}
}