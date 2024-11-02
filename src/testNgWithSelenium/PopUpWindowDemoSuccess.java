package testNgWithSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopUpWindowDemoSuccess {
@Test
public void popUpWindowDemo1() throws InterruptedException
{
WebDriver driver=new ChromeDriver();
driver.get("http://gmail.com");
driver.manage().window().maximize();
WebElement link = driver.findElement(By.xpath("//a[@href='https://support.google.com/chrome/answer/6130773?hl=en-US']"));
link.click();
Thread.sleep(4000);
Set<String> windowsIds=driver.getWindowHandles();
Iterator<String> windowsList=windowsIds.iterator();
String parentWindowId=windowsList.next();
String childWindow=windowsList.next();
driver.switchTo().window(childWindow);
WebElement text = driver.findElement(By.xpath("//h1[text()='Browse Chrome as a guest']"));
text.getText();
//driver.switchTo().window(); ivvaali
WebElement browseText=driver.findElement(By.xpath("//h1[text()='Browse Chrome as a guest']"));
String getBrowseText=browseText.getText();
System.out.println("getBrowseText :"+ getBrowseText);
}
}
