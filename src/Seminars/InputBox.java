package Seminars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBox {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("RBGtechnologies1");
		driver.findElement(By.name("pass")).sendKeys("rbg2");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.cssSelector("input[name='email'][placeholder='Email address or mobile number']")).sendKeys("7358420121");//multiple attributes
		driver.findElement(By.xpath("//a[@href='/login.php']")).click();

	
	}

}
