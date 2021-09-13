package Drivers;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import Driver.browsers.ChromeBrowser;
import Driver.browsers.FirefoxBrowser;
import Driver.browsers.IEBrowser;

public class DriverManager {

	private static WebDriver driver =  null;
	
	
	public WebDriver initDriver(String type) {
		
		
		if(type.equals("Chrome")) {
			
			driver = new ChromeBrowser().generateDriver();
		}

		else if(type.equals("Firefox")) {
        	
        	
        	driver = new FirefoxBrowser().generateDriver();
        	
        }
		
		else if(type.equals("IE")) {
			
			driver = new IEBrowser().generateDriver();			
		} 
		
		else {
			
			driver = null;
		}
		
		return driver;
	}
	
	
	public static WebDriver getDriver() {
		
		
		return driver;
		
	}
	
	
	
	
	
	
	
	
}
