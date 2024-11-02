package SeleniumDemosPgm;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckBoxDemo2A {
	public static void main(String[] args)
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.calculator.net/mortgage-calculator.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='caddoptional']"));
	boolean checkButtondiplayed = driver.findElement(By.xpath("//input[@id='caddoptional']")).isDisplayed();
	if(checkButtondiplayed==true)
	{
		System.out.println("check button is displaying");
	}
	else
	{
		System.out.println("check button is not dispalying");
	}
	boolean checkButtonenabled= driver.findElement(By.xpath("//input[@id='caddoptional']")).isEnabled();

	if(checkButtonenabled==true)
	{
		System.out.println("check button is enabled");
	}
	else
	{
		System.out.println("check button is enabled");
	}

	boolean checkBoxSelected =driver.findElement(By.xpath("//input[@id='caddoptional']")).isSelected();

	if(checkBoxSelected==true)
	{
		System.out.println("check button is selected");
	}
	else
	{System.out.println("check box is not selected");
	}
	Dimension size=driver.findElement(By.xpath("//input[@id='caddoptional']")).getSize();

	driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']")).click();

	checkBoxSelected =driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']")).isSelected();

	if(checkBoxSelected==true)
	{
		System.out.println("check box is selected");
	}
	else
	{System.out.println("check box is not selected");
	}
}
}



