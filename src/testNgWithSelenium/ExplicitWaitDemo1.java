package testNgWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExplicitWaitDemo1 {
	@Test
	public void ExplicitWaitDemoCase1()
	{
		WebDriver driver=new ChromeDriver();
		driver.get(	"https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		driver.manage().window().maximize();
	WebElement checkBox=driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']"));
	checkBox.click();
	WebElement checkBox2=driver.findElement(By.xpath("//input[@id='ContentHolder_lbModels_LBI62T1']"));
	checkBox2.click();
	}
	
}
