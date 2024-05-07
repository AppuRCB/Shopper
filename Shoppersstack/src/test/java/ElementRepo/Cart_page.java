package ElementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_page {
	
	@FindBy(xpath = "//button[text()='Remove from cart']")
	private WebElement removeFromCart_btn;
	
	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement yes_btn;
	
	@FindBy(xpath = "//button[text()='Cancel']")
    private WebElement cancel_btn;
	
	@FindBy(xpath = "//*[local-name()='svg' and @data-testid='CloseIcon']")
	private WebElement close_btn;
	
	@FindBy(xpath = "//*[local-name()='svg' and @id='increase']")
	private WebElement increase_btn;
	
	@FindBy(xpath = "//*[local-name()='svg' and @id='decrease']")
	private WebElement decrease_btn;
	
	@FindBy(xpath = "//span[text()='Buy Now']")
	private WebElement Buy_now;
	
	@FindBy(xpath = "//span[text()='Continue Shopping']")
	private WebElement continue_shopping_btn;
	
	@FindBy(xpath = "//a[text()='cart']")
	private WebElement cart_txt;
	
	
	public Cart_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getremoveFromCart_btn()
	{
		removeFromCart_btn.click();
	}
	
	public void getYes_btn()
	{
		yes_btn.click();
	}
	
	public void getcancel_btn()
	{
		cancel_btn.click();
	}
	
	public void getclose_btn()
	{
		close_btn.click();
	}
	
	public void getincrease_btn()
	{
		increase_btn.click();
	}
	
	public void getdecrease_btn()
	{
		decrease_btn.click();
	}
	
	public void getbuyNow_btn()
	{
		Buy_now.click();
	}
	
	public void getContinue_shopping()
	{
		continue_shopping_btn.click();
	}
	
	public WebElement getCart_text()
	{
	   return cart_txt;
		
	}
}
