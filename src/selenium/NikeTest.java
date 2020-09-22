package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.List;
public class NikeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://www.nike.com/ca/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions builder=new Actions(driver);
		WebElement men=driver.findElement(By.linkText("MEN"));
		builder.moveToElement(men).build().perform();
		Thread.sleep(3000);
		List<WebElement>  li = driver.findElements(By.xpath("//div[@id='NavigationMenu-0-1']//div[2]/a"));
		System.out.println(li.size());
		for(WebElement e:li)
		{
			System.out.println(e.getText());
		}
	}

}
