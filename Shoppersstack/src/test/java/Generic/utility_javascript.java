package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class utility_javascript {

	public static void javascript_passValue(WebDriver driver, WebElement element, String data)
	{
		utility_object.javascript_utility(driver).executeScript("arguments[0].value='"+data+"'", element);
	}
	
	public static void javascript_click(WebDriver driver, WebElement element)
	{
		utility_object.javascript_utility(driver).executeScript("arguments[0].click();", element);
	}
	
	public static void javascript_scroll(WebDriver driver, WebElement element)
	{
		utility_object.javascript_utility(driver).executeScript("arguments[0].scrollIntoView();", element);
	}
	
}
