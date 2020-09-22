package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe");
		//FirefoxDriver driver =new FirefoxDriver();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		//File scrFile=driver.getScreenshotAs(OutputType.FILE);
		File scrfile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(scrfile, new File("C:/testing/screenshot.png"));
	}

}
