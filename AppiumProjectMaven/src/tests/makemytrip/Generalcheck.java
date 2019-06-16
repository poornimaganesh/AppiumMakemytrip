package tests.makemytrip;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import basefiles.BaseClass;
import io.appium.java_client.MobileElement;

public class Generalcheck extends BaseClass {
	BaseClass base;
	private String flight= "//android.widget.TextView[contains(@text,'Flights')]";
	private String Fromcity = "//android.widget.TextView[contains(@content-desc,'fromCity')]";
	private String verfromcity="//android.widget.TextView[contains(@text,'Madurai')]";
	private String dest = "//android.widget.TextView[contains(@content-desc,'destinationCity')]";
	private String textsearch="//android.widget.EditText[contains(@content-desc,'textBoxToSearch')]";
	private String bangselect= "//android.widget.TextView[contains(@text,'Bangalore, India')]";
	private String verdestcity="//android.widget.TextView[contains(@text,'Bangalore')]";
	private String search="//android.widget.TextView[contains(@content-desc,'searchFlight')]";
	private String fromto="//android.widget.TextView[contains(@text,'Madurai to Bangalore')]";
	private String enterfromcity="Madurai";
	private String enterdestcity="Bangalore";
	private String fromcity_tocity="Madurai to Bangalore";
	
//	@Test(dataProvider="getExcelData")
	@Test
//	public void Flightavailable(String enterfromcity, String enterdestcity, String fromcity_tocity)
	public void Flightavailable()
	{
					try {
						MobileElement flightsel=driver.findElementByXPath(flight);
						flightsel.click();
						Thread.sleep(2000);
//						MobileElement fromcity=(MobileElement) driver.findElementsByName("fromCity");
						MobileElement fromcity=driver.findElementByXPath(Fromcity);
//						MobileElement fromcity=(MobileElement) driver.findElementByXPath("//android.widget.TextView[@contains(@text,'FROM')]");
//						assertTrue(fromcity.isDisplayed());
						if(fromcity.isDisplayed())
						{
							try
							{
								fromcity.click();
							}
							catch (Exception e) {
								// TODO: handle exception
								e.getMessage();
							}
						}
						
						
						
						MobileElement fromtype = driver.findElementByXPath("//android.widget.EditText[contains(@content-desc,'textBoxToSearch')]");
						assertTrue(fromtype.isDisplayed());
						fromtype.click();
//						fromtype.sendKeys("Madurai");
						fromtype.sendKeys(enterfromcity);
//						fromtype.sendKeys(Keys.ENTER);
						Thread.sleep(3000);
						
						MobileElement selectfromcity = driver.findElementByXPath("//android.widget.TextView[contains(@text,'IXM')]");
						assertTrue(selectfromcity.isDisplayed());
						selectfromcity.click();
						
						MobileElement veriFrom = driver.findElementByXPath(verfromcity);
//						assertEquals(veriFrom.getText(), "Madurai");
						assertEquals(veriFrom.getText(), enterfromcity);
						
						MobileElement destclick = driver.findElementByXPath(dest);
						destclick.click();
						
						MobileElement endtype = driver.findElementByXPath(textsearch);
						endtype.click();
//						endtype.sendKeys("Bangalore");
						endtype.sendKeys(enterdestcity);
						
						MobileElement selectdest = driver.findElementByXPath(bangselect);
						selectdest.click();
						
						MobileElement veridest = driver.findElementByXPath(verdestcity);
//						assertEquals(veridest.getText(), "Bangalore");
						assertEquals(veridest.getText(), enterdestcity);
						
						MobileElement searc = driver.findElementByXPath(search);
						searc.click();
						
						MobileElement fromtoo = driver.findElementByXPath(fromto);
//						assertEquals(fromtoo.getText(), "Madurai to Bangalore");
						assertEquals(fromtoo.getText(), fromcity_tocity);
						
												
					} catch (Exception e) {
						// TODO: handle exception
						System.err.println(e.getMessage());
					}
		}

}
