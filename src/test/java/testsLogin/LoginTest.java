package testsLogin;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import Base.BaseTest;
import Pages.CartPage;
import Pages.LoginPage;

public class LoginTest extends BaseTest{
     
	public String usname = "9736804138" ;
    public String pswd = "priyanka123";
    public String inusname = "dummy" ;
    public String inpswd = "dummypwd";

 
public LoginTest() {
		// TODO Auto-generated constructor stub
	}


	//	verify the required fields validation on login form 
    @Test(priority=2)
	public void loginRequiredfieldvalidation() {
		
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.submitbtn();
		
		loginPage.validateRequiredvalidation();

			
	}
    
	
//	
	@Test()
	public void loginWithValidCredentials(){
		Actions act = new Actions(driver);
		
		LoginPage loginPage = new LoginPage(driver);
		CartPage cartPage = new CartPage(driver);
		
		loginPage.enterLoginCred(usname);
		
		loginPage.enterPass(pswd);
		
		loginPage.submitbtn();
		
		cartPage.getCart();
		
		cartPage.getCartownername();
		
	}



//	verify the login functionality with invalid credentials
	@Test()
	public void loginWithInvalidCredentials() {
		
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.enterLoginCred(usname);
		
		loginPage.enterPass(inpswd);
		
		loginPage.submitbtn();
		
		loginPage.assertinvalidcred();
	}
	
		
	//	verify the login page title
		@Test(priority=1)
		public void validatepageTitle() {
			
			LoginPage loginPage = new LoginPage(driver); 
			
			loginPage.getpageTitle();
			//loginPage.enterLoginCred(inusname);
			//loginPage.enterPass(inpswd);
			//loginPage.submitbtn();
			
	}	

	/*	
//		verify if close login popup is working
		@Test(description = "TC005")
		public void closeloginpopup() {
					
			LoginPage loginPage = new LoginPage(driver);
			loginPage.validateCloseloginbtn();
			
				
		}
	
	
	//	verify the Privacy policy link
	@Test(description = "TC006")
	public void validatePrivacypolicyLink() {
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.getPrivacyPolicyLink();
		loginPage.validatePrivacyPolicyLink();
	}
	

	
//	verify create new account functionality
	@Test(description = "TC007")
	public void createNewAccount() {
				
		LoginPage loginPage = new LoginPage(driver);
		loginPage.getCreateAccount();
					
	}
	
//	verify forgot password functionality
	@Test(description = "TC08")
	public void forgotPassword() {
				
		LoginPage loginPage = new LoginPage(driver);
		loginPage.forgetpasswordbtn();
			
	}
	
//	verify forgot password functionality
	@Test(description = "TC09")
	public void getfirstvalue() {
				
		LoginPage loginPage = new LoginPage(driver);
			
	}
	*/
	
}
