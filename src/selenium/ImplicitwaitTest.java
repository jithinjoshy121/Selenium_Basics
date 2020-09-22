package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitwaitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("lastname")).sendKeys("dffds");
		driver.findElement(By.name("reg_email__")).sendKeys("6475453534");
		driver.findElement(By.name("reg_passwd__")).sendKeys("dfdgfgf");
		
		WebElement month=driver.findElement(By.id("month"));
		Select m=new Select(month);
		m.selectByIndex(3);
		WebElement day=driver.findElement(By.id("day"));
		Select d=new Select(day);
		d.selectByValue("15");
		WebElement year=driver.findElement(By.id("year"));
		Select y=new Select(year);
		y.selectByVisibleText("2000");
		
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		driver.findElement(By.name("websubmit")).click();
		
	
		String actualMsg="What’s your name?";
		
		String expectedMsg=driver.findElement(By.xpath("//div[contains(@id,'js_')]")).getText();
		if(expectedMsg.equals(actualMsg))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Faile");
		}

	}

}
