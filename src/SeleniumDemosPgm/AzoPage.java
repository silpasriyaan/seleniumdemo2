package SeleniumDemosPgm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class AzoPage 
{
public static void main(String[] args)
{
WebDriver driver=new ChromeDriver();
driver.get("https://www.ajio.com/puma-crafty-unisex-lace-up-shoes/p/469177725_black");
System.out.println(driver.getTitle());
}
}