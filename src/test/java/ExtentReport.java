import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.relevantcodes.extentreports.ExtentTest;

public class ExtentReport {
	
	
	public static void extentReport() {
		
		
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extent.html");
	    
	    ExtentReports extent = new ExtentReports();
	    extent.attachReporter(htmlReporter);
	    
	    //helps to generate the logs in test report.
	    ExtentTest test = extent.createTest("My first test","Sample");
	    
	    test.log(Status.PASS, "This step shows usage of log(status,details)");
	    
	    test.info("This step shows usage of infor(details)");
	    
	  //  test.fail("details",MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build().
	    
	        
	  
	    
		
	}

}
