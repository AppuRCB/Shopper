package BusinessLogic;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import ElementRepo.Home_page;
import ElementRepo.Voucher_page;
import Generic.Base_class;
import Generic.getDataFromPropertyFile;
import Generic.utility_Robot;
import Generic.utility_actions;
import Generic.utility_javascript;

public class Generate_voucher extends Base_class {
	
	@Test
	public void voucher_generate() throws InterruptedException, AWTException, IOException
	{
		Home_page home= new Home_page(driver);
		WebElement Voucher = home.getVoucher_link();
		utility_javascript.javascript_scroll(driver, Voucher);
		Thread.sleep(2000);
		utility_actions.right_click(driver, Voucher);
		Thread.sleep(2000);
		utility_Robot.keyboard_utility(KeyEvent.VK_RIGHT, KeyEvent.VK_RIGHT);
		utility_Robot.keyboard_utility(KeyEvent.VK_ENTER, KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		Set<String> tabs = driver.getWindowHandles();
		ArrayList<String> arraylist= new ArrayList<String>(tabs);
		String child1 = arraylist.get(1);
		driver.switchTo().window(child1);
		Thread.sleep(2000);
		Voucher_page voucher= new Voucher_page(driver);
		String voucher_email = getDataFromPropertyFile.getData("voucheremail");
		String voucher_pwd = getDataFromPropertyFile.getData("voucherpwd");
		voucher.getEmail_TF().sendKeys(voucher_email);
		voucher.getpassword_Tf().sendKeys(voucher_pwd);
		voucher.getlogin_btn().click();
		Thread.sleep(2000);
		String v_email = getDataFromPropertyFile.getVoucherData("email");
		String v_Fullname = getDataFromPropertyFile.getVoucherData("Fullname");
		String v_cost = getDataFromPropertyFile.getVoucherData("cost");
		String v_startdate = getDataFromPropertyFile.getVoucherData("startdate");
		String v_enddate = getDataFromPropertyFile.getVoucherData("enddate");
		String v_vouchercount = getDataFromPropertyFile.getVoucherData("vouchercount");
		Thread.sleep(1000);
		voucher.getEmail_cc_TF().click();
		Thread.sleep(1000);
		voucher.getEmail_cc_TF().sendKeys(v_email);
		Thread.sleep(1000);
		voucher.getFull_name_TF().sendKeys(v_Fullname);
		Thread.sleep(1000);
		voucher.getCost_cc_TF().sendKeys(v_cost);
		Thread.sleep(1000);
		voucher.getstart_date_TF().sendKeys(v_startdate); Thread.sleep(1000);
		voucher.getend_date_TF().sendKeys(v_enddate); Thread.sleep(1000);
		voucher.getArrowDropDownIcon().click();
		Thread.sleep(1000);
		voucher.getshopping_kart_name_list().click();
		Thread.sleep(1000);
		voucher.getVoucher_count_TF().sendKeys(v_vouchercount);
		Thread.sleep(1000);
		voucher.getGenerate_button().click();
		Thread.sleep(1000);
		String parent = arraylist.get(0);
		driver.switchTo().window(parent);
	}

}
