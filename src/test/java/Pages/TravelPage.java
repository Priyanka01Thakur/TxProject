package Pages;
import static org.testng.Assert.assertEquals;

import java.awt.color.ProfileDataException;
import java.util.List;

import org.json.simple.JSONObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.sun.tools.javac.jvm.Profile;

import Commons.CommonMethod;
import Elements.TravelElements;
import Selectors.TravelSelectors;

public class TravelPage {
	
	private TravelElements travelElements = null;
	
	public CommonMethod commonMethod = null;
	 
	public TravelPage(WebDriver driver) {
		
		travelElements = new TravelElements(driver);
		commonMethod = new CommonMethod(driver); 
		
	}
		
	public TravelPage getTravelPage() {
		
		travelElements.getTravelPage().click();
	  	commonMethod.refereshPage();
		return this;
		
	}
	
	public TravelPage validateTravelPageTitle() {
		
		String travelPageTitle = travelElements.getPageTitle().getText();
		assertEquals(travelPageTitle, "Travel");
		return this;
		
	}

	public TravelPage enterFromDestination(String fromdest) {
		
		 commonMethod.waitForSec(2);
	   //  commonMethod.refereshPage();
	    
	     
	    commonMethod.waitForElementToBeVisible(travelElements.getTravelFrom());
		travelElements.getTravelFrom().click();
		//travelElements.getTravelFrom().sendKeys(fromdest);
		commonMethod.waitForSec(3);
		commonMethod.waitForElementToBeVisible(travelElements.getTravelFromIInput1());
		travelElements.getTravelFromIInput1().sendKeys(fromdest);
		travelElements.getTravelFromIInput1().click();
		//commonMethod.hoverOverElementAndClick(travelElements.getTravelFrom(), travelElements.verifyValueOfTravelForm1());
		
		commonMethod.waitForSec(5);
		 
	
		 
	//	 List<String> gettxt = new ArrayList<String>();
		   
		   // for(WebElement element: fv){ 
		    	
		    	//String noSpaceStr = str.replaceAll("\\s", ""); 	
		    	
		    	//if (element.getText().contains("chandigarh")){
		    	
		    	//if(ele ment.getText().equalsIgnoreCase("Chandigarh, India IXC")){
		    		
		    	//	System.out.println("First Value is"+ fv); 
		    		//element.click();
		    	//}
		    	
		
		    	
		    	//else{
		    	//	
		    		//System.out.println("First Value is different"+element.getText());
		    	//}
		//commonMethod.waitForSec(3);
		//    }
		 return this;
	}
	
	public TravelPage enterToDestination(String todest) {
		
		commonMethod.waitForElementToBeVisible(travelElements.getTravelTo());
		travelElements.getTravelTo().click();
		travelElements.getTravelTo().sendKeys(todest);
		travelElements.getTravelFromIInput2().click();
	    //travelElements.verifyValueOfTravelForm2()
	    
	   
		return this;
		
	}
	
	public TravelPage enterDepartOnDate(String departdate) {
		
		commonMethod.waitForElementToBeVisible(travelElements.getDepartOnDate());
	
		
		return this;
		
	}
	
	public TravelPage enterReturnOnDate(String returndate) {
		
		commonMethod.waitForElementToBeVisible(travelElements.getReturnOnDate());
		
		return this;
		
	}
	
	public TravelPage searchFlights() {
		
		travelElements.getSearchbtn().click();
		return this;
		
	}

}
