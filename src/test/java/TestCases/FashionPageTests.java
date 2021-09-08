package TestCases;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.FashionPage;
import Pages.LoginPage;

public class FashionPageTests extends BaseTest{
		
		   
		//Test if page is accessible
		@Test(description = "TC001")
		public void getFashionPage() {
			
			FashionPage fashionPage = new FashionPage(driver);
			LoginPage loginPage= new LoginPage(driver);
			loginPage.validateCloseloginbtn();
			//fashionPage.getFashionPage();
			fashionPage.getFasionWomenEthnicPage();
			fashionPage.getMinimumFilterPrice();
						
		}

		
}
