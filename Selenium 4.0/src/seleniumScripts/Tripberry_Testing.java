package seleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Tripberry_Testing {

	@Test
	public void script() throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://trip.tekopt.com/homepage/home");
		Thread.sleep(2000);
		driver.quit();
	}
}
