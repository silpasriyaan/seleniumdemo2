import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAss {

	public static void main(String[] args) {
	
	}{
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://mail.google.com/mail/u/0/#inbox");
WebElement text=driver.findElement(By.xpath("//span[text()='to continue to Gmail']"));
	}

}
