package tests.makemytrip;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import basefiles.BaseClass;
import io.appium.java_client.MobileElement;

@Listeners(listeners.ListenerTest.class)
public class MMTCredentials_01 extends BaseClass {
	BaseClass base;
	
	@Test()
	public void HomepageVerify(){
//		HomePage hp = PageFactory.initElements(driver, HomePage.class);
			  MobileElement homeicon= driver.findElement(By.id("com.makemytrip:id/bb_home")); 
		      assertTrue(homeicon.isDisplayed());
			  MobileElement trips = driver.findElement(By.id("com.makemytrip:id/bb_mytrips"));
			  assertTrue(trips.isDisplayed());
			  assertFalse(trips.isDisplayed());
			  MobileElement profil = driver.findElement(By.id("com.makemytrip:id/bb_myprofile"));
			  assertTrue(profil.isDisplayed());
			  MobileElement wallet = driver.findElement(By.id("com.makemytrip:id/bb_wallet"));
			  assertTrue(wallet.isDisplayed());
			  MobileElement help = driver.findElement(By.id("com.makemytrip:id/bb_help"));
			  assertTrue(help.isDisplayed());
			 	}
	
	

	/*@Test(priority=0)
	public void HomePage() throws IOException
	{
		try
		{
			try {
				MobileElement home = driver.findElement(By.id(homele));
				if(home.isDisplayed())
				{
					try {
						MobileElement profile= driver.findElement(By.id(prof));
						profile.click();
						MobileElement accexists = driver.findElement(By.id(acc_exist));
						Reporter.log(accexists.getText(),true);
						assertEquals(accexists.getText(), "Already have an account");
						home.click();
						
					} catch (Exception e) {
						// TODO: handle exception
						System.err.println(e.getMessage());
					}
			
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println(e.getMessage());
				Reporter.log("HomePage check failed",true);
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
	}*/
	
}
