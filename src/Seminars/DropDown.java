package Seminars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");	
		driver.manage().window().maximize();
		 WebElement dropDown= driver.findElement(By.xpath("//select[@name='fromMonth'] "));
		 Select obj=new Select(dropDown);
		 obj.selectByIndex(2);
		 obj.selectByVisibleText("June");
	
	}

}