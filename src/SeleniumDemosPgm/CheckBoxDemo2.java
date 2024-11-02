package SeleniumDemosPgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo2 {
	public static void main(String[] args)
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']"));
	boolean checkButtondiplayed = driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']")).isDisplayed();
	if(checkButtondiplayed==true){
		System.out.println("check button is dispalying");
	}
	else
	{
		System.out.println("check button is not dispalying");
	}
	boolean checkButtonenabled= driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']")).isEnabled();

	if(checkButtonenabled==true){
		System.out.println("check button is enabled");   }
	else
	{
		System.out.println("check button is enabled");
	}
	
   boolean checkBoxSelected =driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']")).isSelected();
   if(checkBoxSelected==true){
		System.out.println("check button is selected before click");
	}
	else
	{System.out.println("check box is not selected before click");
	}
  driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']")).click();

	checkBoxSelected =driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']")).isSelected();

	if(checkBoxSelected==true)
	{
		System.out.println("check box is selected after click");
	}
	else
	{System.out.println("check box is not selected after click");
	}
}
}
