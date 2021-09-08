package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Commons.CommonMethod;
import Selectors.LoginSelectors;
import Selectors.MoreMenuItemSelectors;

public class MoreMenuItems {
	
	 CommonMethod commonmethod= null;
		
		public MoreMenuItems(WebDriver driver) {
			
			commonmethod = new CommonMethod(driver);
		} 
		
		public WebElement getMoreMenuItem() {
			
			return commonmethod.getElement(MoreMenuItemSelectors.moreMenu);
			
		}
		
		public WebElement getAdvertisePage() {
			
			return commonmethod.getElement(MoreMenuItemSelectors.advertise);
			
		}

}
