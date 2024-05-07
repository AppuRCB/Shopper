package ElementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_page {
	
	@FindBy(xpath = "//button[@aria-label='Account settings']")
	private WebElement AS_dropdown;
	
	@FindBy(xpath = "//*[local-name()='svg' and @data-testid='LogoutIcon']")
	private WebElement Logout_btn;
	
	public Logout_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getAS_dropdown()
	{
		AS_dropdown.click();
	}
	
	public void getLogout_btn()
	{
		Logout_btn.click();
	}

}
