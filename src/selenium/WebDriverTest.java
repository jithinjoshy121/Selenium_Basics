package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}

}
