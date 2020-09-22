package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSuggestionList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://www.yahoo.com/");
		driver.findElement(By.xpath("//input[@id='uh-search-box']")).click();
		driver.findElement(By.xpath("//input[@id='uh-search-box']")).sendKeys("canada");
		
		Thread.sleep(1000);
		
		List<WebElement> all=driver.findElements(By.className("yui3-aclist-list"));
		
		for(WebElement e:all)
		{
			System.out.println(e.getText());
		}
					

	}

}
