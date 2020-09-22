package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe");
		//FirefoxDriver driver =new FirefoxDriver();
		WebDriver driver=new FirefoxDriver();
		Actions builder=new Actions(driver);
		driver.get("https://www.ebay.ca/");
		WebElement electronics=driver.findElement(By.linkText("Electronics"));
		builder.moveToElement(electronics).build().perform();
		
		Thread.sleep(3000);
List<WebElement> allLinks=driver.findElements(By.xpath("(//div[@class='hl-cat-nav__sub-cat-col']/ul)[5]/li\r\n"));
System.out.println(allLinks.size());

for(WebElement a: allLinks)
{
	System.out.println(a.getText());
}
	}

}
