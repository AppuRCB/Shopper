package Generic;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class utility_object {
	
	public static Actions action_utility(WebDriver driver)
	{
		Actions act= new Actions(driver);
		return act;
	}
	
	public static Select select_utility(WebElement element)
	{
		Select sel= new Select(element);
		return sel;
	}
	
	public static JavascriptExecutor javascript_utility(WebDriver driver)
	{
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		return jse;
	}
	
	public static Robot Robot_utility() throws AWTException
	{
		Robot rbt= new Robot();
		return rbt;
	}

}
