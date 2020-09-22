package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		List<WebElement> link=driver.findElements(By.linkText("Sortable"));
		
		if(link.size()>0)
		{
			System.out.println("sortable present");
		}
		else
		{
			System.out.println("sortable not present");
		}
		List<WebElement> block=driver.findElements(By.linkText("draggable"));
		if(block.size()>0)
		{
			System.out.println("draggable present");
		}
		else
		{
			System.out.println("draggable not present");
		}
		
		//driver.switchTo().frame(0); index
		//driver.switchTo().frame("demoframe"); Id only
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		System.out.println("--------after switching to frame-----");
 link=driver.findElements(By.linkText("Sortable"));
		
		if(link.size()>0)
		{
			System.out.println("sortable present");
		}
		else
		{
			System.out.println("sortable not present");
		}
		 block=driver.findElements(By.id("draggable"));
		if(block.size()>0)
		{
			System.out.println("draggable present");
		}
		else
		{
			System.out.println("draggable not present");
		}
		
		System.out.println("Switch to main page");
		driver.switchTo().defaultContent();
link=driver.findElements(By.linkText("Sortable"));
		
		if(link.size()>0)
		{
			System.out.println("sortable present");
		}
		else
		{
			System.out.println("sortable not present");
		}
		 block=driver.findElements(By.id("draggable"));
		if(block.size()>0)
		{
			System.out.println("draggable present");
		}
		else
		{
			System.out.println("draggable not present");
		}
		
		//driver.switchTo().parentFrame();
		
		

	}

}
