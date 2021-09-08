package Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Commons.CommonMethod;
import Selectors.CartSelectors;
public class CartElements {

CommonMethod commonmethod= null;
	
	public CartElements(WebDriver driver) {
	
		commonmethod = new CommonMethod(driver);
	} 
	
	public WebElement getCart() {
		
		return commonmethod.getElement(CartSelectors.cart);
		
	}
	
	
	public WebElement getCartownername() {
		
		return commonmethod.getElement(CartSelectors.cartowner);
		
	}
	
    public WebElement getCartitemCount() {
		
		return commonmethod.getElement(CartSelectors.cartitemscount);
		
	}
    
    public WebElement totalItemPrice() {
		
		return commonmethod.getElement(CartSelectors.totalItemPrice);
		
	}

    public WebElement totalCartDiscount() {
	
    	return commonmethod.getElement(CartSelectors.totalCartDiscount);
	
    }

    public WebElement totalCartDeliveryCharges() {
	
    	return commonmethod.getElement(CartSelectors.totalCartDeliveryCharges);
	
    }

    public WebElement totalCartAmount() {
	
    	return commonmethod.getElement(CartSelectors.totalCartAmount);
	
    }

    public WebElement cartAddItemcount() {
	
    	return commonmethod.getElement(CartSelectors.totalCartAmount);
	
    }

    public WebElement cartReduceItemCount() {
	
    	return commonmethod.getElement(CartSelectors.cartReduceItemCount);
	
    }

    public WebElement cartRemoveItem() {
	
    	return commonmethod.getElement(CartSelectors.cartRemoveItem);
	
    }

    public WebElement cartSaveItem() {
	
    	return commonmethod.getElement(CartSelectors.cartSaveItem);
	
    }

    public WebElement cartRemoveItemCancel() {
	
    	return commonmethod.getElement(CartSelectors.cartRemoveItemCancel);
	
    }

    public WebElement cartRemoveItemOk() {
	
    	return commonmethod.getElement(CartSelectors.cartRemoveItemOk);
	
    }
    
    public WebElement deliverOrderAt() {
    	
    	return commonmethod.getElement(CartSelectors.deliverOrderAt);
    	
    }
    
    public WebElement placeOrder() {
    	
    	return commonmethod.getElement(CartSelectors.placeOrder);
    	
    }
}
