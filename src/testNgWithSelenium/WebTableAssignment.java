package testNgWithSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableAssignment 
{

	@Test
	public void bse_webTable() throws Exception 
	{

		WebDriver driver = new ChromeDriver();
		driver.get("https://mock.bseindia.com/markets/equity/EQReports/mktwatchR.html?filter=gainer*all$all$");
		Thread.sleep(4000);

		WebElement columnName = driver.findElement(By.xpath("//*[@id='fontSize']/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/thead/tr/td[2]"));
		String columnHead = columnName.getText();
		System.out.println(columnHead);

		int totalRowsCount = driver.findElements(By.xpath("//*[@id='fontSize']/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/tbody/tr/td[2]")).size();
		System.out.println(totalRowsCount);

		String xpath1 = "//*[@id='fontSize']/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/tbody/tr[";
		String xpath2 = "]/td[2]";


		for(int i=1;i<=totalRowsCount;i++)
		{

			String securityName = driver.findElement(By.xpath(xpath1+i+xpath2)).getText();
			System.out.println(" securityName : "+securityName);
		}

		WebTableAssignment obj = new WebTableAssignment();
		obj.sendColumnData("Security Name");
		obj.sendColumnData("Security Code", "500016", "LTP");
	}



	public void sendColumnData(String name) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://mock.bseindia.com/markets/equity/EQReports/mktwatchR.html?filter=gainer*all$all$");
		Thread.sleep(9000);

		int rowsCount = driver.findElements(By.xpath("//*[@id='fontSize']/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/tbody/tr/td[2]")).size();
		System.out.println(rowsCount);

		int columnCount =driver.findElements(By.xpath("//*[@id='fontSize']/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td")).size();
		System.out.println(columnCount);

		String xpath1 = "//*[@id='fontSize']/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/thead/tr[";
		String xpath2 = "]/td[";
		String xpath3 ="]";

		int i=1;
		int j=1;
		for(j=1;j<=columnCount;j++)
		{
			String columnName =driver.findElement(By.xpath(xpath1+i+xpath2+j+xpath3)).getText();

			if(name.equals(columnName))
			{
				System.out.println("column "+j+" Matching");
				xpath1 = "//*[@id='fontSize']/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/tbody/tr[";
				int k =1;
				for(k=1;k<=rowsCount;k++)
				{
					String column =driver.findElement(By.xpath(xpath1+k+xpath2+j+xpath3)).getText();
					System.out.println(column);

				}
				System.out.println(columnName +" Column Data Printing Done");
			}
			else
			{
				System.out.println("column "+j+" Not Matching");          
			}
		}
	}
	
	
	public void sendColumnData(String column1,String row,String column2) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://mock.bseindia.com/markets/equity/EQReports/mktwatchR.html?filter=gainer*all$all$");
		driver.manage().window().maximize();

		Thread.sleep(4000);

		String xpath1 = "//*[@id='fontSize']/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/thead/tr[";
		String xpath2 = "]/td[";
		String xpath3 ="]";

		int rowCount = driver.findElements(By.xpath("//*[@id='fontSize']/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/tbody/tr/td[2]")).size();
		System.out.println(rowCount);

		int columnCount =driver.findElements(By.xpath("//*[@id='fontSize']/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td")).size();
		System.out.println(columnCount);

		int i=1;
		int j=1;
		for(i=1;i<=columnCount;i++)
		{
			String columnName = driver.findElement(By.xpath(xpath1+j+xpath2+i+xpath3)).getText();
			System.out.println(i+" "+columnName);

			if(column1.equals(columnName))
			{
				String xpath4 = "//*[@id='fontSize']/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/tbody/tr[";
				int k;

				for(k=1;k<=rowCount;k++)
				{
					String rowData = driver.findElement(By.xpath(xpath4+k+xpath2+i+xpath3)).getText();
					//System.out.println(rowData);

					if(row.equals(rowData))
					{
						System.out.println(k);
						int l=0;
						for(l=1;l<=columnCount;l++)
						{
							String column = driver.findElement(By.xpath(xpath1+j+xpath2+l+xpath3)).getText();

							if(column2.equals(column))
							{
								rowData = driver.findElement(By.xpath(xpath4+k+xpath2+l+xpath3)).getText();
								System.out.println(rowData);

							}
							else
							{

							}
						}
					}
					else
					{

					}
				}
				break;
			}
			else
			{

			}

		}

	}
}













