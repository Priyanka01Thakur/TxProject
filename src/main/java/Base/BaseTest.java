package Base;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Drivers.DriverManager;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public WebDriver driver = null ;
	private DriverManager drivermanager = null;
	
	@BeforeMethod
	public void startUp() {
		
		drivermanager = new DriverManager();
		
	  	driverSet(drivermanager.initDriver(getBrowser()));
		
	  	driver.get("https://www.flipkart.com/");
	  	
	}
	
	
	@AfterClass
	public void tearDown() {
		
		
		driver.quit();
		
		
	}

	
	public void driverSet(WebDriver driver) {
		
		this.driver = driver;
		
	
	}
	
	
	public String getBrowser() {
		
	//	String browser = System.getProperty("Browser"); 
		

		String browser = "Chrome";
		
		if(browser.isEmpty()||(!browser.contains("Chrome")) && (!browser.contains("Firefox")) && (!browser.contains("IE") ) ){
			
			return "Chrome";
			
		}
		
		else {
			
			return browser;
			
		}
        	
		
	}
	
	public void Homepgae() {
		
		
		driver.get("https://www.flipkart.com/");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
