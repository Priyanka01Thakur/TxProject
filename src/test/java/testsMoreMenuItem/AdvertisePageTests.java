package testsMoreMenuItem;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import Base.BaseTest;
import Pages.LoginPage;
import Pages.MoreMenuItemPages;


public class AdvertisePageTests extends BaseTest{
	
	 
	//Test if page is accessible
	@Test(priority=2, groups = { "smoke" })
	public void getAdvertisePage() {
		
		test = extent.createTest("getAdvertisePage");
		
		MoreMenuItemPages moreMenuItemsPages = new MoreMenuItemPages (driver);
		LoginPage loginPage= new LoginPage(driver);
		loginPage.validateCloseloginbtn();
		//moreMenuItemsPages.getMoreItems();
		moreMenuItemsPages.getAdvertisePage();

		

		
		
		   
		
	}
	
	
	
	//Test if page meta title is valid
		@Test(priority=1, groups = { "smoke" })
		public void getAdvertisePageMetaTitle() {
			
			test = extent.createTest("getAdvertisePageMetaTitle.");
			MoreMenuItemPages moreMenuItemsPages = new MoreMenuItemPages (driver);
			LoginPage loginPage= new LoginPage(driver);
			loginPage.validateCloseloginbtn();
			moreMenuItemsPages.getAdvertisePage();
			moreMenuItemsPages.getPageMetaTitle();

		}
		
		
		
		
		
		//Test if image is showing on the page
		@Test(priority=3)
		public void getAdvertisePageImage() {
			test = extent.createTest("getAdvertisePage");
			MoreMenuItemPages moreMenuItemsPages = new MoreMenuItemPages (driver);
			LoginPage loginPage= new LoginPage(driver);
			loginPage.validateCloseloginbtn();
			moreMenuItemsPages.getMoreItems();
			moreMenuItemsPages.getAdvertisePage();
			moreMenuItemsPages.getPageImage();

		}
		
		//Test if page form title is showing on the page
		@Test(priority=4, enabled = true)
		public void getAdvertisePageFormTitle() {
			test = extent.createTest("getAdvertisePage");
			MoreMenuItemPages moreMenuItemsPages = new MoreMenuItemPages (driver);
			LoginPage loginPage= new LoginPage(driver);
			loginPage.validateCloseloginbtn();
			moreMenuItemsPages.getMoreItems();
			moreMenuItemsPages.getAdvertisePage();
			moreMenuItemsPages.getPageFormTitle();

		}
		
	

}
