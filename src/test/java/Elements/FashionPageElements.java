package Elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Commons.CommonMethod;
import Selectors.FashionPageSelectors;

public class FashionPageElements {
	
CommonMethod commonmethod= null;
	
	public FashionPageElements(WebDriver driver) {
	
		commonmethod = new CommonMethod(driver);
	} 
	
	public WebElement getFashionPage() {
		
		return commonmethod.getElement(FashionPageSelectors.fashionPage);
		
	}
	
	public WebElement getFashionWomenEthnicPage() {
		
		return commonmethod.getElement(FashionPageSelectors.fashionWomenEthnicPage);
		
	}
	
	public WebElement getMinimumFilterPrice() {
		
		return commonmethod.getElement(FashionPageSelectors.filterPriceMin);
		
	}
	
	public WebElement filterPriceMinValues() {
		
		return commonmethod.getElement(FashionPageSelectors.filterPriceMinValues);
		
	}
	
	public WebElement getMaximumFilterPrice() {
		
		return commonmethod.getElement(FashionPageSelectors.filterPriceMax);
		
	}
	
	public List<WebElement> getbrand() {
		
		return commonmethod.getListOfElements(FashionPageSelectors.filterPriceMax);
		
	}
	
	public WebElement getBrandValue() {
		
		return commonmethod.getElement(FashionPageSelectors.BrandFilter);
		
	}
	
	
	

}
