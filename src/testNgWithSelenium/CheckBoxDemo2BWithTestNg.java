package testNgWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBoxDemo2BWithTestNg {
	@Test
	public void CheckBoxDemo2BWithTestNg()
	{

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/mortgage-calculator.html");
		driver.manage().window().maximize();
		WebElement checkBox =driver.findElement(By.xpath("//input[@id='caddoptional']"));
		WebElement checkBoxSelectedOne=driver.findElement(By.xpath( "//*[@id='content']/div[4]/div/form/table/tbody/tr[6]/td/label/span" ));


		boolean checkButtondiplayed = checkBoxSelectedOne.isDisplayed();

		if(checkButtondiplayed==true)
		{
			System.out.println("check button is dispalying");
		}
		else
		{
			System.out.println("check button is not dispalying");
		}
		boolean checkBoxEnabled= checkBoxSelectedOne.isEnabled();

		if(checkBoxEnabled==true)
		{
			System.out.println("check button is enabled");
		}
		else
		{
			System.out.println("check button is enabled");
		}
		Dimension size=checkBox.getSize();
		System.out.println(size);
		boolean checkBoxSelected =checkBox.isSelected();

		if(checkBoxSelected==true)
		{
			System.out.println("Before click check button is selected");
		}
		else
		{System.out.println("Before click check box is not selected");
		}

		checkBoxSelectedOne.click();

		boolean checkBoxSelectedbox = checkBox.isSelected();

		if(checkBoxSelectedbox==true)
		{
			System.out.println("After click check box is selected");
		}
		else
		{System.out.println("After clicking check box is not selected");
		}



	}


}
