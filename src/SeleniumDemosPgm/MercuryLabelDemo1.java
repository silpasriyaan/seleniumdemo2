package SeleniumDemosPgm;//Instead of giving xpath at these many places assign xpath to a variable of WebElement in MercuryLabelDemo2
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class MercuryLabelDemo1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		boolean inputBoxDisplay=driver.findElement(By.xpath("//input[@name='password']")).isDisplayed();
		
		if(inputBoxDisplay==true){
			System.out.println("Username input box is displayed");}
		else{
			System.out.println("Username input box is not displayed");}
		boolean inputBoxisEnabled=driver.findElement(By.xpath("//input[@name='password']")).isEnabled();
		if(inputBoxisEnabled==true){
			System.out.println("inbut box is enabled");}
		else {
			System.out.println("input box is disabled");}
		String actualWaterMarkValue=driver.findElement(By.xpath("//input[@name='password']")).getAttribute("placeholder");
		String expectedWaterMarkValue="Email address or phone number";
		if(actualWaterMarkValue.contentEquals(expectedWaterMarkValue)){
			System.out.println("WaterMark is displayed correctly");}
		else{
			System.out.println("WaterMark is not displayed correctly");
		}
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("rbg tech");
		String enteredData=driver.findElement(By.xpath("//input[@name='password']")).getAttribute("value");
		System.out.println("enteredData : "+ enteredData);
		//driver.findElement(By.xpath("//input[@id='email']")).clear();
	}
}


