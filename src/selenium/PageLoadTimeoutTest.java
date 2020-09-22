package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageLoadTimeoutTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("http://www.echoecho.com/javascript4.htm");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		WebDriverWait wait =new WebDriverWait(driver, 30);
		driver.findElement(By.name("B2")).click();
		
		wait.until(ExpectedConditions.alertIsPresent());
	    
		
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();

	}

}
