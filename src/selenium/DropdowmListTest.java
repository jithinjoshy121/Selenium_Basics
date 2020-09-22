package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdowmListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		Thread.sleep(1000);
		WebElement box=driver.findElement(By.id("gh-cat"));
		List<WebElement> all=box.findElements(By.tagName("option"));
		
		System.out.println(all.size());
		for(WebElement e:all)
		{
			if(e.isSelected()==true)
			{
			System.out.println(e.getText()+"------"+e.isSelected());
			}
		}

		System.out.println("---------------------------------------");
		
		Select s=new Select(box);
		s.selectByIndex(2);
		Thread.sleep(1000);
		s.selectByValue("2984");
		Thread.sleep(1000);
		s.selectByVisibleText("Books");
		for(WebElement e:all)
		{
			if(e.isSelected()==true)
			{
			System.out.println(e.getText()+"------"+e.isSelected());
			}
		}
		
	}

}
