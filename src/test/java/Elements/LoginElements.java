package Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Commons.CommonMethod;
import Selectors.LoginSelectors;

public class LoginElements {

	 CommonMethod commonmethod= null;
	
	public LoginElements(WebDriver driver) {
		
		commonmethod = new CommonMethod(driver);
	} 
	
	public WebElement getUsername() {
		
		return commonmethod.getElement(LoginSelectors.username);
		
	}
	
	public WebElement validateUsername() {
	
		return commonmethod.getElement(LoginSelectors.validationusername);
		
	}
	
	public WebElement getTitle() {
		
		return commonmethod.getElement(LoginSelectors.pageTitle);
		
	}
	
	public WebElement getPassword() {
		
		return commonmethod.getElement(LoginSelectors.password);
		
	}
	
	public WebElement submitbtn() {
		
		return commonmethod.getElement(LoginSelectors.submitbtn);
		
	}
	
	public WebElement forgetpasswordbtn() {
		
		return commonmethod.getElement(LoginSelectors.forgetpassword);
		
	}
	
	
	public WebElement validateinvalidcred() {
		
		return commonmethod.getElement(LoginSelectors.validateinvalidcred);
		
	}
	

	public WebElement validateCreateAccountlink() {
		
		return commonmethod.getElement(LoginSelectors.CreateAccountbtn);
		
	}
	
		
	public WebElement getPrivacyPolicyLink() {
		
		return commonmethod.getElement(LoginSelectors.Privacy);
		
	}
	
	public WebElement getTermslink() {
		
		return commonmethod.getElement(LoginSelectors.terms);
		
	}
	
	public WebElement validationusername() {
		
		return commonmethod.getElement(LoginSelectors.validationusername);
		
	}
	
	public WebElement Closeloginpopup() {
		
		return commonmethod.getElement(LoginSelectors.closeloginpopup);
		
	}
	
	public WebElement getAllLinks() {
		
		return commonmethod.getElement(LoginSelectors.allLinks);
		
	}
	
}
