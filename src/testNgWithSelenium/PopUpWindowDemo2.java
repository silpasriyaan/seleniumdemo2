package testNgWithSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopUpWindowDemo2 {
@Test
public void PopUpWindowDemo1() throws InterruptedException
{
WebDriver driver=new ChromeDriver();
driver.get("http://gmail.com");
driver.manage().window().maximize();
WebElement link = driver.findElement(By.xpath("//a[@href='https://support.google.com/chrome/answer/6130773?hl=en-US']"));
link.click();

Set<String> windowsId=driver.getWindowHandles();
Iterator<String> windowsList=windowsId.iterator();
String parentWindowId=windowsList.next();
System.out.println(parentWindowId);

String childWindowId=windowsList.next();
System.out.println(childWindowId);
driver.switchTo().window(childWindowId);
String text=driver.findElement(By.xpath("//*[@id='page-width-container']")).getText();
System.out.println(text);
//Thread.sleep(4000);
//WebElement text = driver.findElement(By.xpath("//h1[text()='Browse Chrome as a guest']"));
//text.getText();
}
}
