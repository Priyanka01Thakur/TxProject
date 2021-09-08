package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Commons.CommonMethod;
import Elements.FashionPageElements;
import Selectors.FashionPageSelectors;

public class FashionPage {
	
	public FashionPageElements fashionPageElements = null;
	public CommonMethod commonMethod = null;
	 
	public FashionPage(WebDriver driver) {
		
		fashionPageElements = new FashionPageElements(driver);
		commonMethod = new CommonMethod(driver); 
		
	}
	
	public FashionPage getFasionWomenEthnicPage() {
		
		fashionPageElements.getFashionPage().click();
		System.out.println("Fashion page is clicked");
	    commonMethod.waitForSec(5);
	    //commonMethod.waitForElementToBeVisible(fashionPageElements.getFashionWomenEthnicPage());
		// System.out.println("element is visible now");
	   // commonMethod.hoverOverElementAndClick(fashionPageElements.getFashionPage(), fashionPageElements.getFashionWomenEthnicPage());
		//commonMethod.scrollElementIntoView(fashionPageElements.getFashionWomenEthnicPage());
		fashionPageElements.getFashionWomenEthnicPage().click();
		
	    return this;
	}
	
	
	public FashionPage getMinimumFilterPrice() {
		
		fashionPageElements.getMinimumFilterPrice().click();
		
		/*List <WebElement> filtervalues = commonMethod.getListOfElements(FashionPageSelectors.filterPriceMinValues);
		
		int totalfilteroptions = filtervalues.size();
		
		System.out.print(totalfilteroptions);
				
	    List<String> allminprizefilter = new ArrayList<String>();
	    
	    for (int i=1;i<7; i++){
	   	   
	    allminprizefilter.add(filtervalues.get(totalfilteroptions).getText());
		   
	      
	    System.out.print(allminprizefilter);
	    
	   
	    }
	    */
	    return this;
	}

	
	
	public FashionPage getBrandValue() {
		
		fashionPageElements.getBrandValue().click();
		//List <WebElement> brands = commonMethod.getListOfElements(fashionPageElements.getBrandValue());
		return this;
	}


}
