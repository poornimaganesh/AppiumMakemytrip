package tests.sample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import basefiles.BaseClass;
import io.appium.java_client.MobileElement;

public class AppiumNative extends BaseClass{
	BaseClass base = new BaseClass();	
		
//	public static void main(String[] args) throws IOException {
	@Test
	public void NativeTest1() throws IOException{
		// TODO Auto-generated method stub
		try
				{
					System.err.println("Getting into Find element part !! ");
					MobileElement Googleplay = (MobileElement) driver.findElement(By.className("android.widget.TextView"));
					Reporter.log("element Found!!");
					System.err.println("Googleplay.getText() == > "+Googleplay.getText());
					MobileElement Install = driver.findElement(By.id("android:id/button1"));
					System.err.println("Install.getText() ==>" +Install.getText());
					Install.click();
					Thread.sleep(30);
				}
				catch(Exception e1)
				{
					System.err.println(e1);
				}
	}
}
