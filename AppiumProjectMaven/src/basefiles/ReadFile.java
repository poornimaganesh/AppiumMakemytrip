package basefiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadFile {
	private static String config = "config.properties";
	private static String config1 = "config1.properties";
	private static String facebook = "Facebook.properties";
	private static String makemytrip = "MakeMyTrip.properties";
	
	private static final String propertyfilepath = "C:\\Users\\G.ThoppanGangadharan\\OneDrive - Shell\\Documents"
			+ "\\Poornima_Workspace\\AppiumSetup\\src\\resources\\"+makemytrip;
	private static String device;
	private static String udid;
	private static String version;
	private static String plaformname;
	private static String appPackage;
	private static String appActivity;
	private static ReadFile instance;
	private static final Object lock = new Object();
	
	//Create instance of ReadFile
	public static ReadFile getInstance() throws IOException
	{
		if(instance == null)
		{
			synchronized (lock) {
				instance = new ReadFile();
				instance.loadData();
				
			}
		}
		return instance;
	}
//	public static void main(String[] args) throws IOException {
	
	public void loadData() throws IOException{
		// TODO Auto-generated method stub
		BufferedReader buff;
		buff = new BufferedReader(new FileReader(propertyfilepath));
		Properties prop=new Properties();
		try
		{
//			buff = new BufferedReader(new FileReader(propertyfilepath));
//			Properties prop=new Properties();
//			FileInputStream fis = new FileInputStream("C:\\Users\\G.ThoppanGangadharan\\OneDrive - Shell\\Documents\\Poornima_Workspace\\AppiumSetup\\src\\resources\\config.properties");
			prop.load(buff);
			System.out.println("Testing Property file == > "+prop.getProperty("plaformname"));
			buff.close();
		}
		catch(Exception prope)
		{
			prope.getMessage();
		}
		
		//Get properties from property file
		device = prop.getProperty("device");
		udid = prop.getProperty("udid");
		version = prop.getProperty("version");
		plaformname = prop.getProperty("plaformname");
		appPackage = prop.getProperty("appPackage");
		appActivity = prop.getProperty("appActivity");
		
	}
	
	public String getdevice()
	{
		return device;
	}
	
	public String getudid()
	{
		return udid;
	}
	
	public String getVersion()
	{
		return version;
	}
	
	public String getPLatformName()
	{
		return plaformname;
	}
	
	public String getAppPackage()
	{
		return appPackage;
	}

	public String getAppActivity()
	{
		return appActivity;
	}
}
