package basefiles;

import io.appium.java_client.MobileElement;

public class CommonMethods extends BaseClass {

	public CommonMethods()
	{
		
	}
	
	public boolean isElementPresent(String elementid)
	{
		System.err.println("Check if element is present");
		try {
			MobileElement element=driver.findElementByXPath(elementid);
			if(element.getSize()!=null)
			{
				System.out.println("Element size >>> "+element.getSize());
				return true;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("No such element present!!");
			e.getMessage();
		}
		return false;
		
	}
}
