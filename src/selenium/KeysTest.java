package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeysTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.id("login-username")).sendKeys("test50");
		driver.findElement(By.id("login-username")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.id("login-passwd")).sendKeys("fgdfgfd");
		driver.findElement(By.id("login-passwd")).sendKeys(Keys.ENTER);;
	}

}
