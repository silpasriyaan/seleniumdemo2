package SeleniumDemosPgm;//InvalidSelector Exception vasthundhi not working
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CheckboxDemo3 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://faculty.washington.edu/chudler/java/boxes.html");
		driver.manage().window().maximize();
		WebElement multipleCheckBoxes = driver.findElement(By.xpath("(//input[@type='checkbox'])[5])"));
		boolean checkBoxDisplayed=multipleCheckBoxes.isDisplayed();
		if(checkBoxDisplayed==true){
			System.out.println("MultipleCheckboxes are displayed");
		}
		else{
			System.out.println("MultipleCheckBoxes are not displayed");
		}
		boolean checkBoxEnabled=multipleCheckBoxes.isEnabled();
		if(checkBoxEnabled==true){
			System.out.println("MultipleCheckBoxes are enabled");
		}
		else{
			System.out.println("MultipleCheckboxes are not enabled");
		}
		boolean checkBoxSelected=multipleCheckBoxes.isSelected();
		if(checkBoxSelected==true){
			System.out.println("MultipleCheckBoxes are Selected");
		}
		else
		{
			System.out.println("MultipleCheckBoxes are not selected");
		}
		multipleCheckBoxes.click();
		boolean checkBoxSelected1=multipleCheckBoxes.isSelected();
		if(checkBoxSelected1==true){
			System.out.println("MultipleCheckBoxes selected after click");
		}
		else{
			System.out.println("MultipleCheckBoxes not selected after click");
		}
	}
}
