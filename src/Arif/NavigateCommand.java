package Arif;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NavigateCommand {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://rbgtechnoloies");
		driver.navigate().to("https://gmail.com");
	}
		
}