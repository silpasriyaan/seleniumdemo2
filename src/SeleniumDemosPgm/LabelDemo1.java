package SeleniumDemosPgm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LabelDemo1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		boolean inputBoxDisplay=driver.findElement(By.xpath("//input[@id='identifierId']")).isDisplayed();
		if(inputBoxDisplay==true){
			System.out.println("Username input box is displayed");
		}
		else{
			System.out.println("Username input box is not displayed");
		}
		boolean inputBoxisEnabled=driver.findElement(By.xpath("//input[@id='identifierId']")).isEnabled();
		if(inputBoxisEnabled==true){
			System.out.println("inbut box is enabled");
		}
		else {
			System.out.println("input box is disabled");
		}
		String actualWaterMarkValue=driver.findElement(By.xpath("//input[@id='identifierId']")).getAttribute("aria-label");
		String expectedWaterMarkValue="Email or phone";
		if(actualWaterMarkValue.contentEquals(expectedWaterMarkValue)){
			System.out.println("WaterMark is displayed correctly");
		}
		else{
			System.out.println("WaterMark is not displayed correctly");
		}
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("rbg tech");
		String enteredData=driver.findElement(By.xpath("//input[@id='identifierId']")).getAttribute("value");
		System.out.println("enteredData : "+ enteredData);
		//driver.findElement(By.xpath("//input[@id='identifierId']")).clear();
	}
}


