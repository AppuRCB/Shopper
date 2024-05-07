package BusinessLogic;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import ElementRepo.Home_page;
import Generic.Base_class;
import Generic.utility_Robot;
import Generic.utility_actions;
import Generic.utility_javascript;

public class Helpcenter extends Base_class {
	
	@Test
	public void help_center() throws InterruptedException, AWTException
	{
		Home_page home= new Home_page(driver);
		WebElement help_center = home.gethelpCenter_link();
		utility_javascript.javascript_scroll(driver, help_center);
		Thread.sleep(3000);
		utility_actions.right_click(driver, help_center);
		Thread.sleep(2000);
		utility_Robot.keyboard_utility(KeyEvent.VK_DOWN, KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		utility_Robot.keyboard_utility(KeyEvent.VK_ENTER, KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	
		
	}

}
