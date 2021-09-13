package Elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Commons.CommonMethod;
import Selectors.TravelSelectors;

public class TravelElements {
CommonMethod commonmethod= null;
	
	
	public TravelElements(WebDriver driver) {
		// TODO Auto-generated constructor stub

	commonmethod = new CommonMethod(driver);
	}

	public WebElement getTravelPage() {
		
		return commonmethod.getElement(TravelSelectors.travelPage);
		
	}
	
	public WebElement getPageTitle() {
		
		return commonmethod.getElement(TravelSelectors.pageTitle);
		
		}
	
	public WebElement getTravelFrom() {
		
		return commonmethod.getElement(TravelSelectors.travelFrom);
		
	}
	
	public WebElement getTravelFromIInput1() {
		
		return commonmethod.getElement(TravelSelectors.searchResultFieldInput1);
		
	}
	
	public WebElement getTravelFromIInput2() {
		
		return commonmethod.getElement(TravelSelectors.searchResultFieldInput2);
		
	}
	
	public List<WebElement> verifyValueOfTravelForm(){
		
		
		   return commonmethod.getListOfElements(TravelSelectors.searchResultField);
	}
	
		
	public WebElement verifyValueOfTravelForm1(){
		
		
		   return commonmethod.getElement(TravelSelectors.searchResultFieldInput1);
	}
	

	public WebElement getTravelTo() {
	
	return commonmethod.getElement(TravelSelectors.travelTo);
	
	}

	public WebElement getDepartOnDate() {
	
	return commonmethod.getElement(TravelSelectors.departOndate);
	
	}

	public WebElement getReturnOnDate() {
	
	return commonmethod.getElement(TravelSelectors.returnOndate);
	
	}

	public WebElement getTravelClass() {
	
	return commonmethod.getElement(TravelSelectors.travellerClass);
	
	}


	public WebElement getSearchbtn() {
	
	return commonmethod.getElement(TravelSelectors.searchBtn);
	
	}

}
