package Seminars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		driver.manage().window().maximize();
		WebElement radioButton = driver.findElement(By.xpath("//input[@value='oneway' and @name='tripType']"));
		boolean radioButtonDisplayed = radioButton.isDisplayed();
		if(radioButtonDisplayed==true)
		{
			System.out.println("radio button is dispalying");
		}
		else
		{
			System.out.println("radio button is not dispalying");
		}
		boolean radioButtonEnabled= radioButton.isEnabled();

		if(radioButtonEnabled==true)
		{
			System.out.println("radio button is enabled");
		}
		else
		{
			System.out.println("radio button is enabled");
		}
		boolean radioButtonSelected=radioButton.isSelected();
		if(radioButtonSelected==true)
		{
			System.out.println("radio button is selected");
		}
		else{
			System.out.println("radio button is not selected");
		}
		radioButton.click();
		boolean radioButtonSelectedAfterClick=radioButton.isSelected();
		if(radioButtonSelectedAfterClick == true)
		{
			System.out.println("radio button selected after click");
		}
		else
		{
			System.out.println("radio button not selected after click");
		}
	

	}

}
