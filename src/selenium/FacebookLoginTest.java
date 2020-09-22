package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class FacebookLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("sdsafdsf");
		driver.findElement(By.name("pass")).sendKeys("fsgfssf");
		driver.findElement(By.id("loginbutton")).click();
	}

}
