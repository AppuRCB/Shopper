package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class utility_actions {
	
	public static void mouse_Hover(WebDriver driver, WebElement element)
	{
		utility_object.action_utility(driver).moveToElement(element).perform();
	}
    public static void mouse_click(WebDriver driver, WebElement element)
    {
    	utility_object.action_utility(driver).moveToElement(element).click().perform();
    }
    
    public static void mouse_doubleclick(WebDriver driver, WebElement element)
    {
    	utility_object.action_utility(driver).doubleClick(element).perform();
    }
    
    public static void right_click(WebDriver driver, WebElement element)
    {
    	utility_object.action_utility(driver).contextClick(element).perform();
    }
}
