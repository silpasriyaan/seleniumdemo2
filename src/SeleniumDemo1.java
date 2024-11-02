import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumDemo1 {

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("RBG technologies");
		System.out.println("Done");
	}

}
