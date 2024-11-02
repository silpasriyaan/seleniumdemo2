package SeleniumDemosPgm;//get attribute vaadalli dheeniki
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ButtonDemo2 {
public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/button/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		WebElement button=driver.findElement(By.xpath("/html/body/input"));
		boolean buttonDisplay=button.isDisplayed();
        if(buttonDisplay==true){
        	System.out.println("loginButton is dislayed");
        }
        else{
        	System.out.println("loginButton is not displayed");
        }
        boolean buttonEnable=button.isEnabled();
        if(buttonEnable==true)
        {
        	System.out.println("loginButton is enabled");
        }
        else
        {
        	System.out.println("loginButton is not enabled");
        }
        boolean buttonSelect=button.isSelected();
        if(buttonSelect==true)
        {
        	System.out.println("loginButton is selected");
        }
        else
        {
        	System.out.println("loginButton is not selected");
        }
        button.click();//get attribute vaadalli dheeniki
	}

}
