package ElementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_profile_Page {
	
	@FindBy(xpath = "//div[text()='My Addresses']")
	private WebElement My_Addresses;
	
	@FindBy(xpath = "//div[text()='My Wallet']")
    private WebElement My_Wallet;
	
	@FindBy(xpath = "//div[text()='My Likes']")
	private WebElement My_likes;
	
	@FindBy(xpath = "//*[local-name()='svg' and @data-testid='ModeEditIcon']")
	private WebElement edit_profile;
	
	public My_profile_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getMy_addresses()
	{
		My_Addresses.click();
	}
	
	public void getMy_wallet()
	{
		My_Wallet.click();
	}
	
	public void getMy_likes()
	{
		My_likes.click();
	}
	
	public void getedit_profile()
	{
		edit_profile.click();
	}
	
}
