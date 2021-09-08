package Selectors;

import org.openqa.selenium.By;

public class CartSelectors {
	
	public final static By cart = By.className("V3C5bO");
	
	public final static By cartowner = By.xpath("//div[@class='exehdJ']");
	
	public final static By cartitemscount = By.className("_26HdzL");
	
	public final static By totalItemPrice = By.xpath("//div[contains(text(),'Price (2 items)')]");	
	
	public final static By totalCartDiscount = By.xpath("//div[contains(text(),'Discount')]");	
	
	public final static By totalCartDeliveryCharges = By.xpath("//div[contains(text(),'Delivery Charges')]");
	
	public final static By totalCartAmount = By.className("_3LxTgx");
	
	public final static By cartAddItemcount = By.className("_23FHuj");	
	
	public final static By cartReduceItemCount = By.className("_23FHuj");
	
	public final static By cartRemoveItem = By.xpath("//div[normalize-space()='Remove']");
	
	public final static By cartSaveItem = By.className("//div[normalize-space()='Save for later']");
	
	public final static By cartRemoveItemCancel = By.xpath("//div[@class='_3dsJAO _24d-qY FhkMJZ']");	
	
	public final static By cartRemoveItemOk = By.xpath("//div[@class='_3dsJAO _24d-qY RxvIII']");
	
	public final static By deliverOrderAt = By.className("_3gc7Vf");	
	
	public final static By placeOrder = By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']");	

}
