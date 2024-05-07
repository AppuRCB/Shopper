package ElementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Footer_page {

	@FindBy(xpath = "//a[text()='Voucher']")
	private WebElement voucher_link;
	
	@FindBy(xpath = "//a[text()='Help Center']")
	private WebElement Helpcenter_link;
	
	@FindBy(xpath = "//a[text()='Create Admin Account']")
	private WebElement Create_Admin_Account;
	
	public Footer_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getVoucher_link()
	{
		return voucher_link;
	}
	
	public WebElement getHelp_center_link()
	{
		return Helpcenter_link;
	}
	
	public WebElement getCreat_admin_Account()
	{
		return Create_Admin_Account;
	}
	
}
