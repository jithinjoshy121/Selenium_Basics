package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
	/*String msg=driver.findElement(By.xpath("//input[@id='gh-ac']")).getAttribute("placeholder");
		System.out.println(msg);
		
		if(msg.equals("Search for anything"))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("failed");
		}
		
		driver.findElement(By.id("gh-ac")).sendKeys("Iphone");
		
		String msg2=driver.findElement(By.id("gh-ac")).getAttribute("value");
		System.out.println(msg2);*/
	}

	
}


