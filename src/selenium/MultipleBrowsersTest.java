package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowsersTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
FileInputStream fs=new FileInputStream("C:\\testing\\prop.properties");
		
		Properties prop =new Properties();
		prop.load(fs);
		String browser=prop.getProperty("browser");
		
		WebDriver driver=null;
		
		if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe");
			 driver =new FirefoxDriver();
		}else if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Seleniumjars\\chromedriver.exe");
			driver =new ChromeDriver();
		}

		driver.get("https://www.facebook.com/");
		
		List<WebElement> allLinks=driver.findElements(By.xpath("//div[@id='pageFooterChildren']//li"));
		System.out.println(allLinks.size());
		
		for(int i=0;i<allLinks.size();i++)
		{
			System.out.println(allLinks.get(i).getText());
		}
	}

}
