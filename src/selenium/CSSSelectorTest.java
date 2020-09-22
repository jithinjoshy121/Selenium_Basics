package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSSelectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("#email"));
		driver.findElement(By.cssSelector("input[name='pass']"));
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		

	}

}
