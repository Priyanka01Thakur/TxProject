package Pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
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
		
		
	    commonMethod.waitForElementToBeVisible(fashionPageElements.getFashionPage());
		commonMethod.hoverOverElementAndPause(fashionPageElements.getFashionPage());
		//commonMethod.hoverOverElementAndClick(fashionPageElements.getFashionPage(), fashionPageElements.getFashionWomenEthnicPage());

		fashionPageElements.getFashionWomenEthnicPage().click();
		
	    return this;
	}
	
	public FashionPage getPageTitle() {
		
		String pageTitle = fashionPageElements.getPageTitle().getText();
		assertEquals(pageTitle,"KK,Sets,DM,Sarees");
		return this;
		
	}
	
	public FashionPage getdefaultsortoption() {
		
		String defaultSortOption = fashionPageElements.getdefaultsortoption().getText();
		assertEquals(defaultSortOption,"Popularity");
		return this;		
		
	}
	
	public FashionPage gettotalProductsonFirstPage() {
		
		List<String> totalproducts =  commonMethod.getTextOfWebElements(FashionPageSelectors.totalProductsonFirstPage);
		
		int totalfirstpageproductscount =totalproducts.size();
		
		int actualfirstpageproductscount = 40;
		
		assertEquals(totalfirstpageproductscount,actualfirstpageproductscount);
		
		System.out.print("total products showing on first page are=" +"..."+ totalfirstpageproductscount);
		
		return this;		
		
	}
	
	
	public FashionPage getMinimumFilterPrice() {
		
		fashionPageElements.getMinimumFilterPrice().click();
		
		List<String> minpricefilteroptions = commonMethod.getTextOfWebElements(FashionPageSelectors.filterPriceMin);
		System.out.print("minimum price filters options are =" + minpricefilteroptions);
		
		List<String> maxpricefilteroptions = commonMethod.getTextOfWebElements(FashionPageSelectors.filterPriceMax);
		System.out.print("maximum price filters options are =" + maxpricefilteroptions);

	    return this;
	}

	
	
	public FashionPage getTotalBrandFilters() {
		
		List<WebElement> totalBrands = commonMethod.getListOfElements(FashionPageSelectors.BrandFilters);
		//List<String> getbrands = commonMethod.getTextOfWebElements(FashionPageSelectors.BrandFilters);
		//String brands = getbrands.get(3);
		totalBrands.get(3).click();
		System.out.print("Filter " + totalBrands.get(3).getText() +"is clicked");
		commonMethod.waitForSec(5);
		if (totalBrands.get(1).isEnabled())
			System.out.print("Products are showing for brand:" + totalBrands.get(1).getText());
		else
			System.out.print("Filter not applied for" + totalBrands.get(1).getText());
	
		return this;
	}
	
	
	public FashionPage getTotalBrandFilters1() {
		
		commonMethod.getElement(FashionPageSelectors.ExpandBrandFilter).click();
		
		commonMethod.waitForSec(5);
		
		List<WebElement> totalBrands = commonMethod.getListOfElements(FashionPageSelectors.BrandFilters);
		
		List <String> selectbrandname = commonMethod.getTextOfWebElements(FashionPageSelectors.BrandFilters);
	
		for (int i=0; i<selectbrandname.size();i++) {
			
			String selectFilter = "3Buddy Fashion";
						
			if ((selectbrandname.get(i)).equals(selectFilter)) {
				
				totalBrands.get(i).click();
				
				commonMethod.waitForSec(5);
			    
			    assertTrue(totalBrands.get(1).isEnabled());
			    
			    System.out.print("Filter " + totalBrands.get(0).getText() + " is clicked \n");
			    
			}
			
			else {
				
				//System.out.print(totalBrands.size());
				//System.out.print("Filter " + selectFilter + " is not clicked \n");
				
			
			}
		
			
		}
		return this;
			
	}


}
