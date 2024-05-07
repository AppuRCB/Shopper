package BusinessLogic.Cart;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import ElementRepo.Cart_page;
import ElementRepo.Home_page;
import Generic.Base_class;
import Generic.utility_javascript;

public class AddproductCart extends Base_class {
	
	public static Home_page home;
	public static Cart_page cart;
	
	@Test
	public void add_product() throws InterruptedException
	{
		home= new Home_page(driver);
		cart= new Cart_page(driver);
		WebElement skinny_product = home.getSkinny_Add_to_cart_btn();
		WebElement Featured_products = home.getFeatured_products();
		utility_javascript.javascript_scroll(driver, Featured_products);
		Thread.sleep(2000);
		skinny_product.click();
		Thread.sleep(2000);
		home.getcart_icon().click();;
		WebElement cart_text = cart.getCart_text();
		String expected="Cart";	
		Assert.assertTrue(cart_text.isDisplayed(), expected);
		System.out.println("pass: cart text is displayed");
		Thread.sleep(2000);
		
	}

}
