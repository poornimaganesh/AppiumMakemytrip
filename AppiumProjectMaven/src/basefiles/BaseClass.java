
package basefiles;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BaseClass {
	public static AppiumDriver<AndroidElement> driver;
//	public static AppiumDriver<MobileElement> driver;
	@SuppressWarnings("static-access")
	@DataProvider
	public Object[][] getExcelData() throws IOException, EncryptedDocumentException, InvalidFormatException 
	{
		ReadExcel read=new ReadExcel();
		return read.getCellData("C:\\Users\\G.ThoppanGangadharan\\OneDrive - Shell\\Documents\\Poornima_Workspace\\AppiumProjectMaven\\src\\datasources\\datasheet.xlsx","Sheet1");
	}
	

	@BeforeMethod
	public void initiate() throws IOException
	{
		//Set Desired Capabilities
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("deviceName",ReadFile.getInstance().getdevice());
			cap.setCapability("udid", ReadFile.getInstance().getudid());
			cap.setCapability(CapabilityType.BROWSER_NAME, ReadFile.getInstance().getPLatformName());
			cap.setCapability(CapabilityType.VERSION, ReadFile.getInstance().getVersion());
			cap.setCapability("platformName", ReadFile.getInstance().getPLatformName());			
			cap.setCapability("appPackage", ReadFile.getInstance().getAppPackage());
			cap.setCapability("appActivity", ReadFile.getInstance().getAppActivity());
			cap.setCapability("noReset", "true");
		
//			HomePage hp=new HomePage();
//			HolidaysPage hol=new HolidaysPage();
//			FlightsPage fp=new FlightsPage();
//			HotelPage hot=new HotelPage();
//			CommonMethods cm=new CommonMethods();
			
			//Instantiate Driver
					try
					{
						driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
//						driver.resetApp();
//						PageFactory.initElements(driver, HomePage.class);
					}
					catch(Exception e)
					{
						System.err.println("e Exception is ==> "+e.getMessage());
					}
					Reporter.log("======Application opened=====",true);
	}
	
	/*public static WebDriver getDriver()
	{
		if(driver==null)
		{
			return driver;
		}
		else
		{
			return driver;
		}
	}*/
	
	@AfterMethod
	public void exit() throws InterruptedException
	{
		driver.quit();
		Reporter.log("===Driver quit completed===",true);
	}


	public String timestamp() {
		// TODO Auto-generated method stub
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
}
