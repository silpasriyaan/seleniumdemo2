package testNgWithSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class CheckBoxDemo2WithTestNg {
	@Test
	public WebElement CheckBoxDemo2WithTestNg()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		driver.manage().window().maximize();
		WebElement checkBox=driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']"));
		return checkBox;
	}
	WebElement checkBox=CheckBoxDemo2WithTestNg();
	@Test(priority=1)
	public void display(){
		Assert.assertTrue(checkBox.isDisplayed(),"CheckBox is Displayed");
	}
	@Test(priority=2)
	public void enabled(){
		Assert.assertTrue(checkBox.isEnabled(),"CheckBox is Enabled");
	}
	@Test(priority=3)
	public void selected()
	{
		checkBox.click();
		Assert.assertFalse(checkBox.isSelected(),"CheckBox is Selected");
	}

	//@Test(priority=4)
	//public void click(){
	//	checkBox.click();
		//Assert.assertTrue(checkBox.isSelected(),"CheckBox is Not Selected");
	//}

}


