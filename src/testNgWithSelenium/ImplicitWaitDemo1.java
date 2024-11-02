package testNgWithSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ImplicitWaitDemo1 {
	@Test
	public void ImplicitWaitDemoCase2() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get(	"https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement checkBox=driver.findElement(By.xpath("//*[@id='ContentHolder_lbFeatures_TG_D']"));
	checkBox.click();
		
	WebElement checkBox2=driver.findElement(By.xpath("//*[text()='Model10']"));
	checkBox2.click();
	System.out.println("Done");
	
	WebElement checkBox3=driver.findElement(By.xpath("//*[@id='ContentHolder_lbFeatures_LBI1T1']"));
	checkBox3.click();
																																																					
		
	WebElement checkBox4=driver.findElement(By.xpath("//*[text()='Model11']"));
	checkBox4.click();
	}
	
}
