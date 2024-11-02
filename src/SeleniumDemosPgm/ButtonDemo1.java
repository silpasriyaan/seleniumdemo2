	package SeleniumDemosPgm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ButtonDemo1 {
public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	//ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement loginButton=driver.findElement(By.xpath("//button[@name='login']"));
		boolean buttonDisplayed=driver.findElement(By.xpath("//button[@name='login']")).isDisplayed();
        if(buttonDisplayed==true){
        	System.out.println("loginButton is dislayed");
        }
        else{
        	System.out.println("loginButton is not displayed");
        }
        boolean Button=driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
        if(Button==true){
        	
        	System.out.println("Button is enabled");
        }
        else{
        	System.out.println("Button is not enabled");
        }
        
        String actualLoginButtonText= loginButton.getText();
		String expectedLoginButtonText="Log In";
		if(actualLoginButtonText.contentEquals(expectedLoginButtonText)){
			System.out.println("Log in button is displayed correctly");}
		else{
			System.out.println("Log in button is not displayed correctly");
		} 
        loginButton.click();
        
	}

}
