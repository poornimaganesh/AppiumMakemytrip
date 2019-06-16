package tests.makemytrip;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import basefiles.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
@Listeners(listeners.ListenerTest.class)
public class Dragdroptest extends BaseClass {
	BaseClass base;
	String holidays="//android.widget.TextView[contains(@text,'Holidays')]";
	String expand="//android.widget.TextView[contains(@text,'EXPAND SEARCH')]";
	String budget="//android.widget.TextView[contains(@text,'BUDGET')]";
	
	@Test
	public void dragdrop() throws InterruptedException
	{
		try {
			MobileElement HOLIDAY=driver.findElementByXPath(holidays);
			HOLIDAY.click();
			Thread.sleep(10000);
			MobileElement EXPAND=driver.findElementByXPath(expand);
			EXPAND.click();
			Thread.sleep(3000);
			MobileElement BUDGET=driver.findElementByXPath(budget);
			assertTrue(BUDGET.isDisplayed());
//			MobileElement STARTElement=driver.findElementByXPath(StartElement);
//			MobileElement ENDElement=driver.findElementByXPath(endElement);
			TouchAction action = new TouchAction(driver);
//			action.press(STARTElement).perform();
			action.press(1053,1287).moveTo(529,1287).release().perform();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
				
		
	}
}
