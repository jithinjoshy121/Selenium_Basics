package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTestList {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		//WebElement footer=driver.findElement(By.xpath("//span[@id='fsl']"));
		//List<WebElement> allLinks=footer.findElements(By.tagName("a"));
		List<WebElement> allLinks=driver.findElements(By.xpath("//span[@id='fsl']/a"));
		System.out.println(allLinks.size());
		
        for(int i=0;i<allLinks.size();i++)
        {
        	System.out.println(allLinks.get(i).getText());
        }
	}

}
