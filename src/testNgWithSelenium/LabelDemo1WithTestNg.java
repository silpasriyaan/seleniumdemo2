package testNgWithSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class LabelDemo1WithTestNg {
	@Test
	public void LabelDemo1WithTestNg()
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://gmail.com");
	driver.manage().window().maximize();
	boolean inputBoxDisplay=driver.findElement(By.xpath("//input[@id='identifierId']")).isDisplayed();
	Assert.assertTrue(inputBoxDisplay);
	boolean inputBoxisEnabled=driver.findElement(By.xpath("//input[@id='identifierId']")).isEnabled();
	Assert.assertTrue(inputBoxisEnabled);
	String actualWaterMarkValue=driver.findElement(By.xpath("//input[@id='identifierId']")).getAttribute("aria-label");
	String expectedWaterMarkValue="Email or phone";
	Assert.assertEquals(actualWaterMarkValue, expectedWaterMarkValue);
	//driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("rbg tech");
	String enteredData=driver.findElement(By.xpath("//input[@id='identifierId']")).getAttribute("value");
	System.out.println("enteredData : "+ enteredData);
	//driver.findElement(By.xpath("//input[@id='identifierId']")).clear();

}
}
