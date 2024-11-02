package SeleniumDemosPgm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FbPassWdLabelDemo2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		boolean PassWdinputBoxDisplay=driver.findElement(By.xpath("//input[@name='pass']")).isDisplayed();
		if(PassWdinputBoxDisplay==true){
			System.out.println("Password input box is displayed");}
		else{
			System.out.println("Password input box is not displayed");}
		boolean PassWdinputBoxisEnabled=driver.findElement(By.xpath("//input[@name='pass']")).isEnabled();
		if(PassWdinputBoxisEnabled==true){
			System.out.println("inbut box is enabled");}
		else {
			System.out.println("input box is disabled");}
		String actualWaterMarkValue=driver.findElement(By.xpath("//input[@name='pass']")).getAttribute("placeholder");
		String expectedWaterMarkValue="Password";
		if(actualWaterMarkValue.contentEquals(expectedWaterMarkValue)){
			System.out.println("WaterMark is displayed correctly");}
		else{
			System.out.println("WaterMark is not displayed correctly");
		}
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Hello world");
		String enteredData=driver.findElement(By.xpath("//input[@name='pass']")).getAttribute("value");
		System.out.println("enteredData : "+ enteredData);
		//driver.findElement(By.xpath("//input[@name='pass']")).clear();
	}
}


