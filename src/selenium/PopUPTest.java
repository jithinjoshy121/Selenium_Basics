package selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUPTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> link=driver.findElements(By.xpath("//div[@class='_3Njdz7']"));
		if(link.size()>0)
		{
			driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		}
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Iphone");
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();

	}

}
