package Pages;
import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Commons.CommonMethod;
import Elements.CartElements;
import Selectors.CartSelectors;


public class CartPage {
	
	public CartElements cartElements = null;
	public CommonMethod commonMethod = null;
	 
	public CartPage(WebDriver driver) {
		
		cartElements = new CartElements(driver);
		commonMethod = new CommonMethod(driver); 
		
	}
	
	public CartPage getCart() {
		
		cartElements.getCart().click();
		return this;
	}
	
	public CartPage getCartownername() {
		
		commonMethod.waitForElementToBeVisible(cartElements.getCartownername());
		String ownername = cartElements.getCartownername().getText();
		assertEquals(ownername, "Priyanka");
		
		return this;
	}
	
	public CartPage getCartItemscount() {
		
		//cartElements.getCartitemCount();
		
		
	    int size = commonMethod.getListOfElements(CartSelectors.cartitemscount).size();
		
		
		System.out.println("total items added in cart are "+size);
		return this;
	}
	
	public CartPage totalItemPrice() {
		
		cartElements.totalItemPrice().getText();
		return this;
	}

	public CartPage totalCartDiscount() {
	
		cartElements.totalCartDiscount().getText();
		return this;
	}

	public CartPage totalCartDeliveryCharges() {
	
		cartElements.totalCartDeliveryCharges().getText();
		return this;
		
	}

	public CartPage totalCartAmount() {
	
		cartElements.totalCartAmount().getText();
		return this;
		
	}

	public CartPage cartAddItemcount() {
	
		cartElements.getCartitemCount().click();
		return this;
		
	}

	public CartPage cartReduceItemCount() {
	
		cartElements.cartReduceItemCount().click();
		return this;
		
	}

	public CartPage cartRemoveItem() {
	
		cartElements.cartRemoveItem().click();
		return this;
		
	}

	public CartPage cartSaveItem() {
	
		cartElements.cartSaveItem().click();
		return this;
		
	}

	public CartPage cartRemoveItemCancel() {
	
		cartElements.cartRemoveItemCancel().click();
		return this;
		
	}
	
	public CartPage cartRemoveItemOk() {
		
		cartElements.cartRemoveItemOk().click();
		return this;
		
	}
		
	public CartPage deliverOrderAt() {
			
		cartElements.deliverOrderAt().click();
		return this;
			
	}
		
	public CartPage placeOrder() {
			
		cartElements.placeOrder().click();
		return this;
	}

}
