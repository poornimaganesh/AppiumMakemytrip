package tests.makemytrip;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import basefiles.BaseClass;
import basefiles.CommonMethods;
import io.appium.java_client.MobileElement;
@Listeners(listeners.ListenerTest.class)
public class Checkboxtest extends BaseClass{
	
	BaseClass base;
//	CommonMethods cm;
	String hotels = "//android.widget.TextView[contains(@text,'Hotels')]";
	String internation = "//android.widget.RadioButton[contains(@text,'INTERNATIONAL')]";
	String romantic ="//android.widget.CheckBox[contains(@resource-id,'com.makemytrip:id/rb_travel_type_leisure')]";
	String guests ="//android.widget.RelativeLayout[contains(@resource-id,'com.makemytrip:id/guest_layout')]";
	@Test
	public void checkbox()
	{
		try
		{
			MobileElement HOTEL=driver.findElementByXPath(hotels);
//			cm.isElementPresent(hotels);
			HOTEL.click();
			MobileElement INTERNATION = driver.findElementByXPath(internation);
			INTERNATION.click();
			try {
				MobileElement ROMANTIC=driver.findElementByXPath(romantic);
				ROMANTIC.click();
				
			} catch (Exception e) {
				// TODO: handle exception
				e.getMessage();
			}
			
			MobileElement GUESTS=driver.findElementByXPath(guests);
			GUESTS.click();
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
		
	}
	

}
