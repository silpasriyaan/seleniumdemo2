import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.safari.SafariDriver;
//import org.openqa.selenium.InternetExplorer.InternetExplorerDriver;
public class LocatorsDemo2 {

	public static void main(String[] args) {
//WebDriver dr=new FirefoxDriver();
		//WebDriver dr=new SafariDriver();
		//WebDriver tq=(WebDriver) new InternetExplorerDriverService(null, 0, null, null, null);
WebDriver bsi=new ChromeDriver();
	//WebDriver nq=new EdgeDriver();
	//nq.get("https://gmail.com");
	//nq.get("https://www.youtube.com");
	//nq.get("https://www.facebook.com");
	//nq.findElement(By.id("identifierId")).sendKeys("silpaece.ece@gmail.com");
bsi.get("https://www.facebook.com");
bsi.findElement(By.id("identifierId")).sendKeys("silpaece.ece@gmail.com");
	
	}

}
