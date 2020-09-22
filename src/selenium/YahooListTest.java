package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooListTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Learning\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://ca.yahoo.com/");
		
		WebElement trendingBox = driver.findElement(By.xpath("//li[contains(@class,'trending-list selected')]/ul"));
		List<WebElement> trendingLinks1 = trendingBox.findElements(By.tagName("li"));

		
		//List<WebElement> trendingLinks = driver.findElements(By.xpath("//li[contains(@data-category,'trending news')]//li"));
		System.out.println(trendingLinks1.size());
		
		for (WebElement l : trendingLinks1) {
			System.out.println(l.getText());
		}
	}

}
