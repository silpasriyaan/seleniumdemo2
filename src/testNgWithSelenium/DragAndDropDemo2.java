package testNgWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropDemo2 {
@Test
public void DragAndDropDemo_1()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	driver.switchTo().frame(0);
	WebElement dragElement=driver.findElement(By.xpath("//*[@id='draggable']"));
	WebElement dropElement=driver.findElement(By.xpath("//*[@id='droppable']"));
	Actions obj =new Actions(driver);
	obj.dragAndDrop(dragElement,dropElement).perform();
	
}

}
