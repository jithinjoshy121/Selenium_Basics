package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://login.yahoo.com/?.src=ym&.partner=none&.lang=en-CA&.intl=ca&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%3F.intl%3Dca%26.lang%3Den-CA%26.partner%3Dnone%26.src%3Dfp");
		driver.findElement(By.id("login-username")).sendKeys("test56");
		driver.findElement(By.name("signin")).click();
        Thread.sleep(5000);
		driver.findElement(By.id("login-passwd")).sendKeys("dfdsfdsf");
		driver.findElement(By.name("verifyPassword")).click();


	}

}
