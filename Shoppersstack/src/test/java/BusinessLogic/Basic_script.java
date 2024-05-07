package BusinessLogic;

import org.testng.annotations.Test;

import Generic.Base_class;

public class Basic_script extends Base_class{
	
	@Test
	public void fetch_title()
	{
		String title = driver.getTitle();
		System.out.println(title);
	}
	
}
