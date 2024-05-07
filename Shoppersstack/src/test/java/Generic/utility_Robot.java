package Generic;

import java.awt.AWTException;

public class utility_Robot {
	
	public static void keyboard_utility(int keypress, int keyrelease) throws AWTException
	{
		utility_object.Robot_utility().keyPress(keypress);
		utility_object.Robot_utility().keyRelease(keyrelease);
	}

}
