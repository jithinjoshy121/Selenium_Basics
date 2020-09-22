package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumjars\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.facebook.com/");
		
		/*driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();*/

	}

}
