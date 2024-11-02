package testNgWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ButtonDemo1WithTestNg {
	public void ButtonDemo1WithTestNg()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));

		//		SoftAssert softAssert = new SoftAssert();

		boolean buttonDisplayed = loginButton.isDisplayed();
		Assert.assertTrue(buttonDisplayed,"Button is Not Displayed");

		boolean buttonEnabled = loginButton.isEnabled();
		Assert.assertTrue(buttonEnabled,"Button is Not Enabled");

		String actualLoginButtonText = loginButton.getText();
		System.out.println("Actual Data on a Button : " + actualLoginButtonText);
		String expectedLoginButtonText = "Log In";

		Assert.assertEquals(actualLoginButtonText, expectedLoginButtonText,"TextData is Not Matched");

		loginButton.click();

	}
}
