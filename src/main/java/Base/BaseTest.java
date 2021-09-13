package Base;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Drivers.DriverManager;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public WebDriver driver = null ;
	private DriverManager drivermanager = null;
	public ExtentTest test;
	public ExtentReports extent;
	public ExtentSparkReporter htmlReporter;
	
	@BeforeTest
	public void setExtent() {
		htmlReporter = new ExtentSparkReporter(new File(System.getProperty("user.dir")+"/test-output/myReport.html"));
		htmlReporter.config().setDocumentTitle("Automation Report"); //Title of the report
		htmlReporter.config().setReportName("Smoke Testing Report"); //Name of the report
		htmlReporter.config().setTheme(Theme.DARK);
		
		extent =  new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Hostname", "LocalHost");
		System.out.print("set extent is running");
	}
	
	@BeforeMethod (alwaysRun=true) //alwaysRun=true
	public void startUp() {
		
		    
		drivermanager = new DriverManager();
		
	  	driverSet(drivermanager.initDriver(getBrowser()));
		
	  	driver.get("https://www.flipkart.com/");
	  	
	}
	
	@AfterTest
	public void endReport() {
		
			extent.flush();
			
		}
	
	@AfterMethod //(alwaysRun=true)
	public void tearDown(ITestResult result) throws IOException {
		
		
		if (result.getStatus() == ITestResult.FAILURE) {
			
			test.log(Status.FAIL, "Test case failed is " + result.getName());
			test.log(Status.FAIL, "Test case failed is " + result.getThrowable());
			
			String screenshotPath = BaseTest.getScreenshot(driver, result.getName());
			
			test.addScreenCaptureFromPath(screenshotPath);
		}
			
		else if(result.getStatus() == ITestResult.SKIP)  {
			
			test.log(Status.PASS, "Test case skipped is " + result.getName());
		}
		
		
		else if(result.getStatus() == ITestResult.SUCCESS)  {
			
			test.log(Status.PASS, "Test case passed is " + result.getName());
		}
		
		driver.quit();

	
	}
	
	
	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
		
	
	
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		
		String destination = System.getProperty("user.dir") + "/screenshots/" + screenshotName + dateName + ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	
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
