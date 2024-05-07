package ElementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	@FindBy(id = "loginBtn")
	private WebElement Login_btn;
	
	@FindBy(id = "Email")
	private WebElement Email_TF;
	
	@FindBy(id = "Password")
	private WebElement password_TF;
	
	@FindBy(id = "Login")
	private WebElement Login2_Btn;
	
	public Login_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getLogin_btn()
	{
		Login_btn.click();
	}
	
	public void getEmail_TF(String key)
	{
		Email_TF.sendKeys(key);
	}
	
	public void getPassword_TF(String key)
	{
		password_TF.sendKeys(key);
	}
	
	public void getLogin2_btn()
	{
		Login2_Btn.click();
	}
}
