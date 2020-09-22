package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		List<WebElement> li=driver.findElements(By.name("group1"));
		System.out.println(li.size());
		for(WebElement l:li)
		{
			System.out.println(l.getAttribute("value")+"-------"+l.isSelected());
		}
		li.get(2).click();
		System.out.println("--------------");
		for(WebElement l:li)
		{
			System.out.println(l.getAttribute("value")+"-------"+l.isSelected());
		}

	}

}
