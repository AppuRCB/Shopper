package BusinessLogic.Cart;

import org.testng.Assert;
import org.testng.annotations.Test;

import ElementRepo.Cart_page;
import ElementRepo.Home_page;
import Generic.Base_class;

public class removeproductfromcart extends Base_class {
	
	@Test(dependsOnGroups  = {"add_product"})
	public void removeproductfromCart()
	{
	Home_page home= new Home_page(driver);
	home.getcart_icon().click();
	Cart_page cart = new Cart_page(driver);
	cart.getremoveFromCart_btn();
	cart.getYes_btn();
	String actual = cart.getCart_text().getText();
	Assert.assertEquals(actual, "Cart");
	System.out.println(actual);
	}

}
