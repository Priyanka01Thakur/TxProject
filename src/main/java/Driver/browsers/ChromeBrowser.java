package Driver.browsers;

import java.util.HashMap;
import java.util.Map;
//import java.io.UnsupportedEncodingException;
//import java.net.URLDecoder;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import Drivers.DriverFactory;

public class ChromeBrowser extends DriverFactory{ 
	
	public WebDriver generateDriver() {
     
		try {
	String browserpath = System.getProperty("user.dir")+"/drivers/chromedriver.exe" ;
	
	//String decodedPath = URLDecoder.decode(browserpath, "UTF-8") ;
	System.setProperty("webdriver.chrome.driver", browserpath);
    
	//driver =  new ChromeDriver();
	  ChromeOptions options = new ChromeOptions();
	    Map<String, Object> prefs = new HashMap<String, Object>();
	    prefs.put("profile.managed_default_content_settings.geolocation", 2);
	    options.setExperimentalOption("prefs", prefs);
	    driver = new ChromeDriver(options);
			
	 driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       
     return driver; 
		}
     
    catch(Exception ex){
    	
    	ex.printStackTrace();
    }
		return null;
	
     
	}
	
	
	
	
	
}
