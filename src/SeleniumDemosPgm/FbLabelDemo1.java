package SeleniumDemosPgm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FbLabelDemo1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		boolean inputBoxDisplay=driver.findElement(By.xpath("//input[@id='email']")).isDisplayed();
		if(inputBoxDisplay==true){
			System.out.println("Username input box is displayed");}
		else{
			System.out.println("Username input box is not displayed");}
		boolean inputBoxisEnabled=driver.findElement(By.xpath("//input[@id='email']")).isEnabled();
		if(inputBoxisEnabled==true){
			System.out.println("inbut box is enabled");}
		else {
			System.out.println("input box is disabled");}
		String actualWaterMarkValue=driver.findElement(By.xpath("//input[@id='email']")).getAttribute("placeholder");
		String expectedWaterMarkValue="Email address or phone number";
		if(actualWaterMarkValue.contentEquals(expectedWaterMarkValue)){
			System.out.println("WaterMark is displayed correctly");}
		else{
			System.out.println("WaterMark is not displayed correctly");
		}
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rbg hyd");
		//getAttribute() - method ki value aney attribute ye vaadaali kanipichina kanipeekapoyina --
		//right click chesinappudu

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(" Telangana");
		String enteredData=driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value");
		System.out.println("enteredData : "+ enteredData);
		//driver.findElement(By.xpath("//input[@id='email']")).clear();
	}
}


