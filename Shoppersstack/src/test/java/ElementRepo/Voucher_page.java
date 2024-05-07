package ElementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Voucher_page {
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email_TF;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement pasword_Tf;
	
	@FindBy(xpath = "//button[text()='login']")
	private WebElement login_btn;
	
	@FindBy(xpath = "//input[@id=':r2:']")
	private WebElement email_cc_TF;
	
	@FindBy(xpath = "//input[@id=':r3:']")
	private WebElement Full_name_TF;
	
	@FindBy(xpath = "//input[@id=':r4:']")
	private WebElement Cost_cc_Tf;
	
	@FindBy(xpath = "//input[@id='startDate']")
	private WebElement start_date_TF;
	
	@FindBy(xpath = "//input[@id='endDate']")
	private WebElement end_date_TF;
	
	@FindBy(xpath = "//div[@id='demo-simple-select']")
	private WebElement ArrowDropDownIcon;
	
	@FindBy(xpath = "//li[@data-value='ShoppingKart']")
    private WebElement shopping_kart_name_list;
	
	@FindBy(xpath = "//input[@placeholder='Number of vouchers to generate']")
	private WebElement Voucher_count_TF;
	
	@FindBy(xpath = "//button[text()='Generate']")
	private WebElement Generate_button;
	
	public Voucher_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getEmail_TF()
	{
		return email_TF;
	}
	
	public WebElement getpassword_Tf()
	{
		return pasword_Tf;
	}
	
	public WebElement getlogin_btn()
	{
		return login_btn;
	}
	
	public WebElement getEmail_cc_TF()
	{
		return email_cc_TF;
	}
	
	public WebElement getFull_name_TF()
	{
		return Full_name_TF;
	}
	
	public WebElement getCost_cc_TF()
	{
		return Cost_cc_Tf;
	}
	
	public WebElement getstart_date_TF()
	{
		return start_date_TF;
	}
	
	public WebElement getend_date_TF()
	{
		return end_date_TF;
	}
	
	public WebElement getArrowDropDownIcon()
	{
		return ArrowDropDownIcon;
	}
	
	public WebElement getshopping_kart_name_list()
	{
		return shopping_kart_name_list;
	}
	
	public WebElement getVoucher_count_TF()
	{
		return Voucher_count_TF;
	}
	
	public WebElement getGenerate_button()
	{
		return Generate_button;
	}

}
