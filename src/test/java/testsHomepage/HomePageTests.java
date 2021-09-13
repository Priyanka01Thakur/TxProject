package testsHomepage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.BaseTest;
import Commons.CommonMethod;
import Elements.HomepageElements;
import Pages.HomePage;

public class HomePageTests extends BaseTest{
	
   
	//Test if search functionality is working
	@Test(description = "TC001")
	public void getSearchbox() {
		
		HomePage homePage = new HomePage(driver);
				
					
	}

	//Check the total menu item displaying in header menu bar
	@Test(description = "TC002")
	public void getMenuItems() {
		
		HomePage homePage = new HomePage(driver);
				
	}

	//Check if any menu link is broken
	@Test(description = "TC003")
	public void checkfrokenMenuLinks() {
		
		HomePage homePage = new HomePage(driver);
							
	}

	//Verify the broken home banner
	@Test(description = "TC004")
	public void checkBrokenBannerImage() {
		
		HomePage homePage = new HomePage(driver);
				
	}
	
	//Count the featured lists items
	
	@Test(description = "TC005")
	public void checktotalproductscount() {
		
		HomePage homePage = new HomePage(driver);
	}
	//Check the products broken image
	//Check the products broken link
	//Check if slider is working on product listing
	//Check the product listing title
	//Check the "View All" button link on product listing
	
}
	