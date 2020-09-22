package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("About")).click();
		//driver.findElement(By.partialLinkText("Abo")).click();
String expectedTitle="Google - About Google, Our Culture & Company News";
String actualTitle=driver.getTitle();

if(expectedTitle.equals(actualTitle)) {
	System.out.println("test passed");
}else
{
	System.out.println("test failed");
}

String expectedUrl="https://about.google/?fg=1&utm_source=google-CA&utm_medium=referral&utm_campaign=hp-header";
String actualUrl=driver.getCurrentUrl();
System.out.println(actualUrl);

if(expectedUrl.equals(actualUrl))
{
	System.out.println("url test passed");
}
else
{
	System.out.println("url test failed");
}
	}

}
