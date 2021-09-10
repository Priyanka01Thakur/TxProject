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
	
	public WebElement getBrandFilterSection() {
		
		return commonmethod.getElement(FashionPageSelectors.BrandSection);
		
	}
	
	public WebElement getExpandBrandFilter() {
		
		return commonmethod.getElement(FashionPageSelectors.ExpandBrandFilter);
		
	}
	
	public WebElement getTotalBrandFilters() {
		
		return commonmethod.getElement(FashionPageSelectors.BrandFilters);
		
	}
	
	public WebElement getdefaultsortoption() {
		
		return commonmethod.getElement(FashionPageSelectors.defaultSortByOption);
		
	}
	
	
	public WebElement getNewSortOption() {
		
		return commonmethod.getElement(FashionPageSelectors.SortByOption);
		
	}

	public WebElement gettotalProductsonFirstPage() {
	
	return commonmethod.getElement(FashionPageSelectors.totalProductsonFirstPage);
	
}


	public WebElement getPageTitle() {
	
	return commonmethod.getElement(FashionPageSelectors.pageTitle);
	
}
	
	public WebElement getPriceSliderMin() {
		
		return commonmethod.getElement(FashionPageSelectors.prizeSliderMin);
		
	}
	
	public WebElement getPriceSliderMax() {
		
		return commonmethod.getElement(FashionPageSelectors.prizeSliderMax);
		
	}
	
	public WebElement getProductPrice() {
		
		return commonmethod.getElement(FashionPageSelectors.productPrice);
		
	}
	

}
