package testNgWithSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitDemo3 {
	@Test
	public void ExplicitWaitDemoCase2() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get(	"https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		driver.manage().window().maximize();
	WebElement checkBox=driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']"));
	checkBox.click();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ContentHolder_lbModels_LBI16T1']")));
	WebElement checkBox2=driver.findElement(By.xpath("//*[@id='ContentHolder_lbModels_LBI16T1']"));
	checkBox2.click();
	System.out.println("Done");
	}
	
}
