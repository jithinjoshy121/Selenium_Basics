package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("dssad");;
		driver.findElement(By.xpath("//span[@class='CwaK9']")).click();
		
		Thread.sleep(3000);
		
		String expectedmsg="Couldn't find your Google Account";
		String actualmsg=driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();
		System.out.println(actualmsg);
		
		if(expectedmsg.equals(actualmsg))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Faile");
		}
	}

}
