package Generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import ElementRepo.Login_page;
import ElementRepo.Logout_page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class implements Framework_Constants{
	
	public static WebDriver driver;
    public static Login_page login;
    public static Logout_page logout;
	
	@BeforeClass
	public void launch_SS()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(SS_url);
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void login_SS() throws IOException, InterruptedException
	{
		String email = getDataFromPropertyFile.getData("email");
		String password = getDataFromPropertyFile.getData("password");
		login= new Login_page(driver);
		login.getLogin_btn();
		login.getEmail_TF(email);
		login.getPassword_TF(password);
		login.getLogin2_btn();
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void logout_SS() throws InterruptedException
	{
	       logout= new Logout_page(driver);
	       logout.getAS_dropdown();
	       logout.getLogout_btn();
	       Thread.sleep(2000);
	}
	
	@AfterClass
	public void close_SS()
	{
		driver.quit();
	}

}
