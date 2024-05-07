package Generic;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility_Select {
	
	public static Select sel;
	
 public static void Select_options(WebElement element, Object data)
	{
		Select sel = utility_object.select_utility(element);
		if (data instanceof Integer) 
		{
		     sel.selectByIndex((Integer) data);	
		}
		else if (data instanceof String) 
		{
		   try 
		   {
			  sel.selectByValue((String)data);   
		   } 
	      catch (Exception e) {
			// TODO: handle exception
	    	  sel.selectByVisibleText((String)data);
		  }	
		}
		
	}
    
    public static void deselect_options(Object data)
    {
    	if (data instanceof Integer) {
    		sel.deselectByIndex((Integer)data);
		}
    	else if (data instanceof String) {
    		
    		try {
    			sel.deselectByValue((String)data);
				
			} catch (Exception e) {
				// TODO: handle exception
				sel.deselectByVisibleText((String)data);
			}
		}
    }
    
    public static List<WebElement> get_options()
    {
    	List<WebElement> value = sel.getOptions();
    	return value;
    }

}
