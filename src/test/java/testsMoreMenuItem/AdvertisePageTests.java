package testsMoreMenuItem;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.LoginPage;
import Pages.MoreMenuItemPages;


public class AdvertisePageTests extends BaseTest{
	
	 
	//Test if page is accessible
	@Test(priority=1)
	public void getAdvertisePage() {
		
		MoreMenuItemPages moreMenuItemsPages = new MoreMenuItemPages (driver);
		LoginPage loginPage= new LoginPage(driver);
		loginPage.validateCloseloginbtn();
		moreMenuItemsPages.getMoreItems();
		moreMenuItemsPages.getAdvertisePage();

	}
	
	//Test if page meta title is valid
		@Test(priority=2)
		public void getAdvertisePageMetaTitle() {
			
			MoreMenuItemPages moreMenuItemsPages = new MoreMenuItemPages (driver);
			LoginPage loginPage= new LoginPage(driver);
			loginPage.validateCloseloginbtn();
			moreMenuItemsPages.getAdvertisePage();
			moreMenuItemsPages.getPageMetaTitle();

		}
		
		
		
		
		//Test if image is showing on the page
		@Test(priority=3)
		public void getAdvertisePageImage() {
			
			MoreMenuItemPages moreMenuItemsPages = new MoreMenuItemPages (driver);
			LoginPage loginPage= new LoginPage(driver);
			loginPage.validateCloseloginbtn();
			moreMenuItemsPages.getMoreItems();
			moreMenuItemsPages.getAdvertisePage();
			moreMenuItemsPages.getPageImage();

		}
		
		//Test if page form title is showing on the page
		@Test(priority=4)
		public void getAdvertisePageFormTitle() {
			
			MoreMenuItemPages moreMenuItemsPages = new MoreMenuItemPages (driver);
			LoginPage loginPage= new LoginPage(driver);
			loginPage.validateCloseloginbtn();
			moreMenuItemsPages.getMoreItems();
			moreMenuItemsPages.getAdvertisePage();
			moreMenuItemsPages.getPageFormTitle();

		}
		
	

}
