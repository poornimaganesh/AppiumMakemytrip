/*package utilityFunctionLibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import basefiles.BaseClass;
import io.appium.java_client.MobileElement;

public class CommonMethods extends BaseClass{
	
	public static void highlight(MobileElement ele)
	{
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
	}
	
	public void MouseHover(MobileElement ele)
	{
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
	}
	
}
*/