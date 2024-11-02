package testNgWithSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class EpayLoginPg {
@Test
public void epaySlider(){
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.epay.com/epayweb/user/login");
		WebElement userName= driver.findElement(By.xpath("//input[@name='userName']"));
		userName.sendKeys("rbg");
		WebElement passWrd=driver.findElement(By.xpath("//input[@name='password']"));
		passWrd.sendKeys("1234567");
		WebElement button=driver.findElement(By.xpath("//span[text()='Login']"));
		button.click();
		driver.switchTo().parentFrame();
		WebElement slider=driver.findElement(By.xpath("//div[@class='slider']"));
		String s1=slider.getText();
		System.out.println(s1);
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		Actions act=new Actions(driver);
		act.dragAndDropBy(slider, 154, 0).perform();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(180));

	}

}
