package testsFashionPage;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.FashionPage;
import Pages.LoginPage;

public class FashionPageTests extends BaseTest{
	/*	
		   
		//Test if page is accessible
		@Test(description = "TC001")
		public void getFashionWomenEthnicPage() {
			
			FashionPage fashionPage = new FashionPage(driver);
			LoginPage loginPage= new LoginPage(driver);
			loginPage.validateCloseloginbtn();
			//fashionPage.getFashionPage();
			fashionPage.getFasionWomenEthnicPage();
	
						
		}
		
		
		//Verify the page title
		@Test(description = "TC002")
		public void getFashionWomenEthnicPageTitle() {
			
			FashionPage fashionPage = new FashionPage(driver);
			LoginPage loginPage= new LoginPage(driver);
			loginPage.validateCloseloginbtn();
			//fashionPage.getFashionPage();
			fashionPage.getFasionWomenEthnicPage();
			fashionPage.getPageTitle();
						
		}
		
		//Verify the default product sort order
		@Test(description = "TC003")
		public void getdefaultproductsortoption() {
			
			FashionPage fashionPage = new FashionPage(driver);
			LoginPage loginPage= new LoginPage(driver);
			loginPage.validateCloseloginbtn();
			//fashionPage.getFashionPage();
			fashionPage.getFasionWomenEthnicPage();
			fashionPage.getdefaultsortoption();
						
		}
		
		
		
		
		
		//Verify the default product sort order
				@Test(description = "TC004")
				public void gettotalProductsonFirstPage() {
					
					FashionPage fashionPage = new FashionPage(driver);
					LoginPage loginPage= new LoginPage(driver);
					loginPage.validateCloseloginbtn();
					//fashionPage.getFashionPage();
					fashionPage.getFasionWomenEthnicPage();
					fashionPage.gettotalProductsonFirstPage();
								
				}
				
				*/

				//Verify the brand filters
				@Test(description = "TC005")
				public void gettotalBrandFilters() {
					
					FashionPage fashionPage = new FashionPage(driver);
					LoginPage loginPage= new LoginPage(driver);
					loginPage.validateCloseloginbtn();
					//fashionPage.getFashionPage();
					fashionPage.getFasionWomenEthnicPage();
					fashionPage.getTotalBrandFilters1();
								
				}
}
