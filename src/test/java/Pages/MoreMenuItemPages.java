package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
	
		//commonMethod.waitForSec(2);
		//System.out.print(moreElements.getMoreMenuItem().getText());
		commonMethod.hoverOverElement(moreElements.getMoreMenuItem());
		moreElements.getAdvertisePage().click();
		//commonMethod.hoverOverElementAndClick(moreElements.getMoreMenuItem(), moreElements.getAdvertisePage());
		
		//commonMethod.waitForElementToBeVisible(moreElements.getAdvertisePage());
		//commonMethod.hoverOverElementAndClick(moreElements.getMoreMenuItem(), moreElements.getAdvertisePage());
		//commonMethod.waitForElementToBeVisible(moreElements.getAdvertisePage());
		commonMethod.waitForSec(5);
		return this;
	}

	
	public MoreMenuItemPages getPageMetaTitle() {
		
		commonMethod.waitForSec(2);
		String pageMetaTitle = moreElements.getPageMetaTitle().getAttribute("title");
		System.out.print(moreElements.getPageMetaTitle().getText());
		System.out.print(pageMetaTitle);
		assertEquals(pageMetaTitle,"Flipkart Ads Platform");
		System.out.print("A="+ pageMetaTitle + "Meta Title is valid" + "B="+ moreElements.getPageMetaTitle().getText());
		return this;
		
	}
		
	
	public MoreMenuItemPages getPageImage() {
		
		commonMethod.waitForSec(2);
		String style = moreElements.getPageImage().getAttribute("style");
		if (style == "height: 100%; width: 80%;") {
			System.out.print("Image is showing with exact dimensions on the page");
		}
		else
		{
			System.out.print("Image is not showing with exact dimensions on the page");
		}
		return this;
			
	}
	
	
	public MoreMenuItemPages getPageFormTitle() {
		
		String pageFormTitle = moreElements.getPageFormTitle().getText();
		assertEquals(pageFormTitle,"Please enter in your credentials to logins");
		System.out.print("Valid page form title is showing");
		return this;
		
	}
		
		
	}
