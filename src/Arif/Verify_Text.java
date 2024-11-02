package Arif;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Verify_Text {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement text= driver.findElement(By.xpath("//h2[text()=Facebook helps you connect and share with  the people in your life.']"));
	String actualText=text.getText();
	String expectedText="Facebook helps you connect and share with the people in your life.";
if(actualText.equals(expectedText) )
{
	System.out.println("text is matched");
	
}
else
	{
	System.out.println("text is not matched");
	}
	}

}
