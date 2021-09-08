package Drivers;

import org.openqa.selenium.WebDriver;

public abstract class DriverFactory {

	
	public abstract WebDriver generateDriver();
	
	public WebDriver driver;
	
	
	
	
}
