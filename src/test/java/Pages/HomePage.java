package Pages;

import org.openqa.selenium.WebDriver;

import Commons.CommonMethod;
import Elements.HomepageElements;


public class HomePage {

	public HomepageElements homePageElements = null;
	public CommonMethod commonMethod = null;
	 
	
	public HomePage(WebDriver driver) {
		
		homePageElements = new HomepageElements(driver);
		commonMethod = new CommonMethod(driver); 
		
	}
	
	public HomePage getSearchbox() {
		
		homePageElements.getSearchbox().sendKeys("Nokia");
		return this;
	}
	
    public HomePage getSearchbtn() {
		
		homePageElements.getSearchbtn().click();
		return this;
	}
    
	public HomePage getmenuitems() {
		
		homePageElements.getmenuitems().getSize();	
		return this;
	}
	
	public HomePage gethomebanner() {
		
		homePageElements.gethomebanner();	
		return this;
	}
	
}
