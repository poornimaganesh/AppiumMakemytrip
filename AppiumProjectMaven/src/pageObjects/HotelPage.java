package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HotelPage {
private AndroidDriver<MobileElement> driver;

	//	public static MobileElement homeicon(AppiumDriver<AndroidElement> driver) {
//		// TODO Auto-generated method stub
//		element=driver.findElement(By.id("com.makemytrip:id/bb_home"));
//		return element;
//	}
	
	public HotelPage() {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Hotels')]")
	public static MobileElement hoteloption;
	
	@AndroidFindBy(xpath="//android.widget.RadioButton[contains(@text,'INTERNATIONAL')]")
	public static MobileElement international;
	
	@AndroidFindBy(xpath="//android.widget.CheckBox[contains(@resource-id,'com.makemytrip:id/rb_travel_type_leisure')]")
	public static MobileElement romanticcheckbox;
	
	@AndroidFindBy(xpath="//android.widget.RelativeLayout[contains(@resource-id,'com.makemytrip:id/guest_layout')]")
	public static MobileElement guestlayout;

	public boolean isDisplayed()
	{
		return hoteloption.isDisplayed();
	}
	

}
