package testsTravelPage;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.LoginPage;
import Pages.TravelPage;

public class TravelPageTests extends BaseTest{
    
   public String fromdest = "BOM" ;
   public String todest = "CCU";


   public TravelPageTests() {
		// TODO Auto-generated constructor stub
	}


	//	Validate the page title for travel page
   @Test(description = "TC001")
	public void validateTravelPageTitle() {
		
		TravelPage travelPage = new TravelPage(driver);
		LoginPage loginPage= new LoginPage(driver);
		loginPage.validateCloseloginbtn();
		travelPage.getTravelPage();		
		travelPage.validateTravelPageTitle();
	}
   
   
	//	Search one-way flights for current date
   @Test(description = "TC002")
	public void travelOneWayCurrentDate() {
		
		TravelPage travelPage = new TravelPage(driver);
		LoginPage loginPage= new LoginPage(driver);
		loginPage.validateCloseloginbtn();
		travelPage.getTravelPage();		
		travelPage.enterFromDestination(fromdest);
		travelPage.enterToDestination(todest);
		travelPage.searchFlights();

	}
   
  /* 
//	Search one-way flights for future date
  @Test(description = "TC002")
	public void travelOneWayFutureDate() {
		
		TravelPage travelPage = new TravelPage(driver);
		LoginPage loginPage= new LoginPage(driver);
		loginPage.validateCloseloginbtn();
		travelPage.getTravelPage();		
			
	}
  
  
  //	Search round-trip flight for current date
  @Test(description = "TC003")
	public void travelRoundTripCurrentDate() {
		
		TravelPage travelPage = new TravelPage(driver);
		LoginPage loginPage= new LoginPage(driver);
		loginPage.validateCloseloginbtn();
		travelPage.getTravelPage();		

		
	}
  
  //	Search round-trip flight for future date
  @Test(description = "TC004")
	public void travelRoundTripFutureDates() {
		
		TravelPage travelPage = new TravelPage(driver);
		LoginPage loginPage= new LoginPage(driver);
		loginPage.validateCloseloginbtn();
		travelPage.getTravelPage();		

	}
   */
}