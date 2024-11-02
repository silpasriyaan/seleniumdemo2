import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Partial_LinkText1 {

	public static void main(String[] args) {
		
WebDriver driv=new ChromeDriver();
driv.get("https://www.facebook.com/");
driv.findElement(By.partialLinkText("Forgett"));
//System.out.println()
	}

	

}
