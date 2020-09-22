package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MississuagaTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		
		Actions builder=new Actions(driver);
		driver.get("http://www.mississauga.ca/portal/home");
		WebElement city=driver.findElement(By.xpath("//img[@alt='City Hall']"));
		builder.moveToElement(city).build().perform();
		Thread.sleep(5000);
		List<WebElement> element = driver.findElements(By.xpath("//div[@id='tnNavHallMenu']/a"));
		System.out.println(element.size());
		for(WebElement e:element) {
			
			System.out.println(e.getText());
			if(e.getText().equals("City Clerk's Office"))
			{
				e.click();
				Thread.sleep(5000);
			     System.out.println(driver.getTitle());
				break;
						
			}
		}
		
		
		
	}

}
