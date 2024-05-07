package ElementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	
	@FindBy(xpath = "//a[text()='Help Center']")
    private WebElement helpcenter_link;
	
	@FindBy(xpath = "//*[local-name()='svg' and @id='cartIcon']")
	private WebElement Cart_icon;
	
	@FindBy(xpath = "//input[@id='search']")
	private WebElement search_TF;
	
	@FindBy(xpath = "//*[local-name()='svg' and @id='searchBtn']")
	private WebElement search_btn;
	
	@FindBy(xpath = "(//span[text()='Skinny Men Blue Jeans'])[1]/../following-sibling::div/button")
	private WebElement skinny_Add_TO_Cart_Btn;
	
	@FindBy(xpath = "//h1[text()='Featured Products']")
	private WebElement Featured_products_txt;
	
	@FindBy(xpath = "//a[text()='Voucher']")
	private WebElement Voucher_link;
	
	public Home_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement gethelpCenter_link()
	{
		return helpcenter_link;
	}
	
	public WebElement getcart_icon()
	{
		return Cart_icon;
	}
	
	public WebElement getSearch_TF()
	{
		return search_TF;
	}
	
	public void getSearch_btn()
	{
		search_btn.click();
	}
	
	public WebElement getSkinny_Add_to_cart_btn()
	{
		return skinny_Add_TO_Cart_Btn;
	}
	
	public WebElement getFeatured_products()
	{
		return Featured_products_txt;
	}
	
	public WebElement getVoucher_link()
	{
		return Voucher_link;
	}
	
}
