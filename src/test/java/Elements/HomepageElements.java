package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Commons.CommonMethod;
import Selectors.HomepageSelector;

public class HomepageElements {

	CommonMethod commonmethod= null;

	public HomepageElements(WebDriver driver) {
	
		commonmethod = new CommonMethod(driver);
	} 

	public WebElement getSearchbox() {
	
		return commonmethod.getElement(HomepageSelector.searchbox);
	}
	
	public WebElement getSearchbtn() {
	
		return commonmethod.getElement(HomepageSelector.searchbtn);
	}

	public WebElement getmenuitems() {
	
		return commonmethod.getElement(HomepageSelector.menuitems);

	}
	
	public WebElement gethomebanner() {
		
		return commonmethod.getElement(HomepageSelector.banner);

	}

}
