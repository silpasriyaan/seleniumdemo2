package Arif;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Verify_Text2 {

	public static void main(String[] args) {

WebDriver dr=new ChromeDriver();
dr.get("https://gmail.com/");
WebElement text= dr.findElement(By.xpath("//span[text()='to continue to Gmail']"));
String actualText=text.getText();
String expectedText="to continue to Gmail";
if(actualText.equals(expectedText) )
{
System.out.println("true");

}
else
{
	System.out.println("false");
}
	}

}
