package CollectionDemo;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ListDemo4B {
	public static void main(String[] args) {
		List<WebElement> list=new ArrayList<WebElement>();
WebDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/newtours/index.php");
WebElement userName= driver.findElement(By.xpath("//input[@name='userName']"));
WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
list.add(userName);
list.add(password);
list.add(submit);
WebElement userName1=list.get(0);
userName1.sendKeys("RBG technologies");
WebElement passWord1=list.get(1);
passWord1.sendKeys("12345");
WebElement submit1=list.get(2);
submit1.sendKeys("ffg");
submit1.click();
}

}
