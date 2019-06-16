package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
private AndroidDriver<MobileElement> driver;

	//	public static MobileElement homeicon(AppiumDriver<AndroidElement> driver) {
//		// TODO Auto-generated method stub
//		element=driver.findElement(By.id("com.makemytrip:id/bb_home"));
//		return element;
//	}
	
	public HomePage() {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
	
	@AndroidFindBy(id="com.makemytrip:id/bb_home")
	public static MobileElement homeicon;
	
	@AndroidFindBy(id="com.makemytrip:id/bb_mytrips")
	public static MobileElement TripsIcon;

	public boolean isDisplayed()
	{
		return homeicon.isDisplayed();
	}
	

}
