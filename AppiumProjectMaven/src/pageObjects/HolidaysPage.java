package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HolidaysPage {
private AndroidDriver<MobileElement> driver;

	//	public static MobileElement homeicon(AppiumDriver<AndroidElement> driver) {
//		// TODO Auto-generated method stub
//		element=driver.findElement(By.id("com.makemytrip:id/bb_home"));
//		return element;
//	}
	
	public HolidaysPage() {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Holidays')]")
	public static MobileElement holidaysoption;
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'EXPAND SEARCH')]")
	public static MobileElement expandbutton;
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'BUDGET')]")
	public static MobileElement budgettitle;
	

	public boolean isDisplayed()
	{
		return holidaysoption.isDisplayed();
	}
	

}
