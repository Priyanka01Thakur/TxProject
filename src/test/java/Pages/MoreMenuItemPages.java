package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Commons.CommonMethod;
import Elements.MoreMenuItems;

public class MoreMenuItemPages {

	public MoreMenuItems moreElements = null;
	public CommonMethod commonMethod = null;
  
    
	public MoreMenuItemPages(WebDriver driver) {
		
		moreElements = new MoreMenuItems(driver);
		commonMethod = new CommonMethod(driver); 
		}
	
	public MoreMenuItemPages getMoreItems() {
		
		System.out.print(moreElements.getMoreMenuItem().getText());
		return this;
	}
	
	public MoreMenuItemPages getAdvertisePage() {
		
		
		commonMethod.waitForSec(5);
		//commonMethod.waitForElementToBeVisible(moreElements.getAdvertisePage());
		//moreElements.getAdvertisePage().click();
		System.out.print(moreElements.getMoreMenuItem().getText());
		commonMethod.hoverOverElementAndClick(moreElements.getMoreMenuItem(), moreElements.getAdvertisePage());
		commonMethod.waitForElementToBeVisible(moreElements.getAdvertisePage());
		commonMethod.waitForSec(5);
		return this;
	}
}
