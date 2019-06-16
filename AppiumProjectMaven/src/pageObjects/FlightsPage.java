package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FlightsPage {
private AndroidDriver<MobileElement> driver;

	//	public static MobileElement homeicon(AppiumDriver<AndroidElement> driver) {
//		// TODO Auto-generated method stub
//		element=driver.findElement(By.id("com.makemytrip:id/bb_home"));
//		return element;
//	}
	
	public FlightsPage() {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Flights')]")
	public static MobileElement flightsoption;
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Madurai')]")
	public static MobileElement fromcityverification;
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@content-desc,'destinationCity')]")
	public static MobileElement destinationcity;
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Bangalore, India')]")
	public static MobileElement selectBangalore;
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Bangalore')]")
	public static MobileElement destcityverify;
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@content-desc,'searchFlight')]")
	public static MobileElement searchbutton;
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Madurai to Bangalore')]")
	public static MobileElement fromtolocation;
	
	@AndroidFindBy(xpath="//android.widget.EditText[contains(@content-desc,'textBoxToSearch')]")
	public static MobileElement searchentertext;
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@content-desc,'fromCity')]")
	public static MobileElement fromcity;
	

	public boolean isDisplayed()
	{
		return flightsoption.isDisplayed();
	}
	

}
