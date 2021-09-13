package Driver.browsers;

//import java.net.URLDecoder;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Drivers.DriverFactory;

public class FirefoxBrowser extends DriverFactory {
 
	
	public WebDriver generateDriver() {
	     
		try {
	String browserpath = System.getProperty("user.dir")+"/drivers/geckodriver.exe" ;
	
	//String decodedPath = URLDecoder.decode(browserpath, "UTF-8") ;
	System.setProperty("webdriver.firefox.driver", browserpath);
    
			
	 driver =  new FirefoxDriver();
	
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
	
	
	
	
	

