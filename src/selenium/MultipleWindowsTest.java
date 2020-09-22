package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://moodle.cestarcollege.com/moodle/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Faq")).click();
		
		Set<String> allWindows=driver.getWindowHandles();
		System.out.println(allWindows.size());
		
		Iterator<String> itr=allWindows.iterator();
		String parentWindow=itr.next();
		String childWindow=itr.next();
		System.out.println(parentWindow);
		System.out.println(childWindow);
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		driver.close();//close the window where u are
		
		driver.switchTo().window(childWindow);
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		driver.quit();
		

	}

}
