 package listeners;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import basefiles.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

public class ListenerTest implements ITestListener {
	protected AppiumDriver<AndroidElement> driver;
	protected static ExtentReports reports;
	protected ExtentTest test;
	BaseClass bc=new BaseClass();
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName()+ ">> Testcase started");
		test = reports.startTest(result.getMethod().getMethodName());
		test.log(LogStatus.INFO, result.getMethod().getMethodName() + "test is started");
		}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("The name of the Testcase passed is >>> "+result.getName());
		test.log(LogStatus.PASS, result.getMethod().getMethodName() + "test is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("The name of the Testcase failed is >>> "+result.getName());
		if(ITestResult.FAILURE==result.getStatus())
		{
			try
			{
				TakesScreenshot screenshot=(TakesScreenshot) driver;
				File src=screenshot.getScreenshotAs(OutputType.FILE);
//				org.apache.commons.io.FileUtils.copyFile(src, new File("C:\\"+res.getName()+".png"));
				FileUtils.copyFile(src, new File("C:\\Users\\G.ThoppanGangadharan\\OneDrive - Shell\\Documents\\"
						+ "Poornima_Workspace\\AppiumProjectMaven\\Screenshot\\"+result.getName()+"_"+bc.timestamp()+".png"));
				System.out.println("Successfully screenshot taken");
			}
			catch(Exception e)
			{
				Reporter.log("Issue while taking screenshot");
				System.err.println(e.getMessage());
			}
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("The name of the test case skipped is >>> "+result.getName());
		test.log(LogStatus.SKIP, result.getMethod().getMethodName() + "test is skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		reports = new ExtentReports("C:\\Users\\G.ThoppanGangadharan\\OneDrive - Shell\\Documents\\Poornima_Workspace"
				+ "\\AppiumProjectMaven\\Reports\\"+bc.timestamp()+ "reports.html");
		 
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		reports.endTest(test);
		  reports.flush();
		
	}


}
