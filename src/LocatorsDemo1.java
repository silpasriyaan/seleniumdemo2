import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("RBG technologies1");
		//driver.findElement(By.name("password")).sendKeys("RBG technologies2");
		//driver.findElement(By.className("whsOnd")).sendKeys("RBG technologies3");
	}

}
