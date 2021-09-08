package Selectors;

import org.openqa.selenium.By;

public class LoginSelectors {

	public final static By loginbtn = By.className("_1_3w1N");
	
	public final static By username = By.xpath("//input[@class='_2IX_2- VJZDxU']");  
	
	public final static By validationusername = By.xpath("//span[contains(text(),'Please enter valid Email ID/Mobile number')]");
	
	//public final static By pTitle = By.className("_36KMOx");
	
	public final static By validateinvalidcred = By.xpath("//span[contains(text(),'Your username or password is incorrect')]");
	
	public final static By pageTitle = By.xpath("//span[@class='_36KMOx']//span[contains(text(),'Login')]");
	
	public final static By password = By.xpath("//div//input[@type='password']");
	
	public final static By forgetpassword = By.xpath("//span[normalize-space()='Forgot?']");
	
	public final static By forgetpasswordbtn= By.xpath("//span[normalize-space()='CONTINUE']");
	
	public final static By submitbtn = By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']");
	
	public final static By terms = By.xpath("//a[normalize-space()='Terms of Use']");
	
	public final static By Privacy = By.xpath("//a[normalize-space()='Privacy Policy']");
	
	public final static By OTP = By.xpath("//button[normalize-space()='Request OTP']");
	
	public final static By EnterOTP = By.className("HSKgdN");
	
	public final static By SubmitOTP = By.xpath("//button[normalize-space()='Verify']");
	
	public final static By CreateAccountbtn = By.xpath("//a[normalize-space()='New to Flipkart? Create an account']");
	
	public final static By closeloginpopup = By.className("_2doB4z");
	
	public final static By allLinks = By.tagName("a");
	
}
