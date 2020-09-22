package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> li=driver.findElements(By.xpath("//table[@id='customers']//tr"));
		List<WebElement> li2=driver.findElements(By.xpath("//div[@class='w3-example']//tr/th"));
		System.out.println("size of row:"+li.size());
		System.out.println("size of column:"+li2.size());
		System.out.println("Table Elements");
		
		for(int i=2;i<=li.size();i++)
		{
			for(int j=1;j<=li2.size();j++)
			{
				System.out.print(driver.findElement(By.xpath("//div[@class='w3-example']//tr["+i+"]/td["+j+"]")).getText());
				System.out.print("          ");	
			}
			System.out.println();

		}

	}

}
