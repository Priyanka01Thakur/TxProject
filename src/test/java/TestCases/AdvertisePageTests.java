package TestCases;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.LoginPage;
import Pages.MoreMenuItemPages;


public class AdvertisePageTests extends BaseTest{
	
	   
	//Test if page is accessible
	@Test(description = "TC001")
	public void getAdvertisePage() {
		
		MoreMenuItemPages moreMenuItemsPages = new MoreMenuItemPages (driver);
		LoginPage loginPage= new LoginPage(driver);
		loginPage.validateCloseloginbtn();
		moreMenuItemsPages.getMoreItems();
		moreMenuItemsPages.getAdvertisePage();

	}

}
