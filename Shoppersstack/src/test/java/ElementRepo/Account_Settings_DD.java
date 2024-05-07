package ElementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account_Settings_DD {
	
	@FindBy(xpath = "//li[text()='My Profile']")
	private WebElement Myprofile_AS;
	
	@FindBy(xpath = "//li[text()='Wish List']")
	private WebElement Wishlist_AS;
	
	@FindBy(xpath = "//li[text()='My Orders']")
	private WebElement my_orders_AS;
	
	@FindBy(xpath = "//li[text()='My Wallet']")
	private WebElement my_wallet_As;
	
	@FindBy(xpath = "//li[text()='My Likes']")
	private WebElement my_likes_AS;
	
	@FindBy(xpath = "//li[text()='Logout']")
	private WebElement logout_AS;
	
	public Account_Settings_DD(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getMyprofile_AS()
	{
		Myprofile_AS.click();
	}
	
	public void getWishlist_As()
	{
		Wishlist_AS.click();
	}
	
	public void getMy_order_AS()
	{
		my_orders_AS.click();
	}
	
	public void getMy_Wallet_AS()
	{
		my_wallet_As.click();
	}
	
	public void getMy_like_AS()
	{
		my_likes_AS.click();
	}
	
	public void getlogout_AS()
	{
		logout_AS.click();
	}

}
