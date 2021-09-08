package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import Commons.CommonMethod;
import Elements.LoginElements;

public class LoginPage {

	
	private LoginElements loginElements = null;
	
	public CommonMethod commonMethod = null;
	 
	
	public LoginPage(WebDriver driver) {
		
		loginElements = new LoginElements(driver);
		commonMethod = new CommonMethod(driver); 
		
	}
		
	public LoginPage enterLoginCred(String uname) {
		

		commonMethod.waitForElementToBeVisible(loginElements.getUsername());
		loginElements.getUsername().sendKeys(uname);
		return this;
		
	}
	
	public LoginPage enterPass(String pwd) {
		
		commonMethod.waitForElementToBeVisible(loginElements.getPassword());
		loginElements.getPassword().sendKeys(pwd);
		return this;
	} 
	
	
	public LoginPage assertinvalidcred() {
		
		String validationmsg = loginElements.validateinvalidcred().getText();
		assertEquals(validationmsg, "Your username or password is incorrect");
		
		return this;
	}
	
	public LoginPage getpageTitle() {
		
		
		String title = loginElements.getTitle().getText();
		System.out.println(title);
		assertEquals(title, "Login");
		
		return this;
	}

	public LoginPage submitbtn() {
		
		loginElements.submitbtn().click();
		commonMethod.waitForSec(5);
		return this;
	}
	
	public LoginPage validateRequiredvalidation() {
		
		commonMethod.waitForElementToBeVisible(loginElements.validateUsername());
		String validationtext = loginElements.validateUsername().getText();
		assertEquals(validationtext, "Please enter valid Email ID/Mobile number");
		commonMethod.waitForSec(3);
		return this;
	}
	
	public LoginPage forgetpasswordbtn() {
		
		loginElements.forgetpasswordbtn().click();
		commonMethod.isWebElementIsPresent(loginElements.getPassword());
		return this;
		
	}
	
	public LoginPage getCreateAccount() {
		
		loginElements.validateCreateAccountlink();
	    		
		return this;
		
	}
	

	public LoginPage getPrivacyPolicyLink() {
		
		loginElements.getPrivacyPolicyLink().click();
	
		return this;
	}
	
	public LoginPage validatePrivacyPolicyLink() {
		
		String URL = loginElements.getPrivacyPolicyLink().getAttribute("href");
		System.out.println(URL);
		assertEquals(URL, "https://www.flipkart.com/pages/privacypolicy");
		return this;
	}
	
	
	public LoginPage getTermslink() {
		
		loginElements.getTermslink();
		return this;
		
	}
	
	public LoginPage validateCloseloginbtn() {
		
		commonMethod.waitForElementToBeVisible(loginElements.Closeloginpopup());
		loginElements.Closeloginpopup().click();
		return this;
		
	}
	
	
}
