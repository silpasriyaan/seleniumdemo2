package testNgWithSelenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class AlertDemo4 {
	@Test	
	public void TestCase1alertbox() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		WebElement button=driver.findElement(By.xpath("//button[@id='alertBox']"));
		button.click();
		Alert alert=driver.switchTo().alert();
		String actualText=alert.getText();
		System.out.println("Alert text is :"+ actualText);
		String expectedText="I am an alert box!";
		Assert.assertEquals(actualText, expectedText);
		alert.accept();
		WebElement button2= driver.findElement(By.xpath("//*[@id='output']"));
		String actualText2=button2.getText();
		System.out.println(actualText2);
		String expectedText2="You selected alert popup";
		Assert.assertEquals(actualText2, expectedText2);
	}
	@Test
	public void Testcase2confirmBox()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		WebElement button=driver.findElement(By.xpath("//button[@id='confirmBox']"));
		button.click();
		Alert alert=driver.switchTo().alert();
		String actualText=alert.getText();
		System.out.println("Alert text is :"+ actualText);
		String expectedText="Press a button!";
		Assert.assertEquals(actualText, expectedText);
		alert.accept();
		WebElement button2= driver.findElement(By.xpath("//*[@id='output']"));
		String actualText2=button2.getText();
		System.out.println(actualText2);
		String expectedText2="You pressed OK in confirmation popup";
		Assert.assertEquals(actualText2, expectedText2);
	}
	@Test
	public void TestCase3ConfirmBoxDismiss()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		WebElement button=driver.findElement(By.xpath("//button[@id='confirmBox']"));
		button.click();
		Alert alert=driver.switchTo().alert();
		String actualText=alert.getText();
		System.out.println("Alert text is :"+ actualText);
		String expectedText="Press a button!";
		Assert.assertEquals(actualText, expectedText);
		alert.dismiss();
		WebElement cancelButton= driver.findElement(By.xpath("//*[@id='output']"));
		String actualText2=cancelButton.getText();
		System.out.println(actualText2);
		String expectedText2="You pressed Cancel in confirmation popup";
		Assert.assertEquals(actualText2, expectedText2);

	}
	@Test
	public void TestCase4PromptAcceptBox()
	{
		WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		WebElement button=driver.findElement(By.xpath("//*[@id='promptBox']"));
		button.click();
		Alert alert=driver.switchTo().alert();
		String actualText=alert.getText();
		System.out.println("Alert text is :"+ actualText);
		alert.sendKeys("RBG Technologies");
		alert.accept();
		WebElement entereddata=driver.findElement(By.xpath("//*[@id='output']"));
		System.out.println(entereddata);
	}


	@Test
	public void TestCase5PromptDimissBox()
	{
		//WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		WebElement button=driver.findElement(By.xpath("//*[@id='promptBox']"));
		button.click();
		Alert alert=driver.switchTo().alert();
		String actualText=alert.getText();
		System.out.println("Alert text is :"+ actualText);
		alert.sendKeys("RBG Technologies");
		alert.dismiss();
		WebElement entereddata=driver.findElement(By.xpath("//*[@id='output']"));
		System.out.println(entereddata);
		
	}

}



