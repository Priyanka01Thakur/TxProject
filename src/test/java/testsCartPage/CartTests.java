package testsCartPage;
import org.testng.annotations.Test;
import Base.BaseTest;
import Pages.CartPage;
import Pages.LoginPage;


public class CartTests extends BaseTest{
	
	public String usname = "9736804138" ;
    public String pswd = "priyanka123";
    public String inusname = "dummy" ;
    public String inpswd = "dummypwd";

  
// Test if cart page is accessible without login
   @Test(description = "TC001")
   public void getCartb() {
		
		CartPage cartPage = new CartPage(driver);
		LoginPage loginPage= new LoginPage(driver);
		loginPage.validateCloseloginbtn();
		cartPage.getCart();			
					
	}
	

 
   
// Test if cart page is accessible after login
   @Test(description = "TC002")
   public void getCartafterlogin() {
		
		CartPage cartPage = new CartPage(driver);
		
		LoginPage loginPage= new LoginPage(driver);
		
		//loginPage.validateCloseloginbtn();
		
		loginPage.enterLoginCred(usname);
		
		loginPage.enterPass(pswd);
		
		loginPage.submitbtn();
		
		cartPage.getCart();
		
		
	}
   

   
//Verify the cart item count
   @Test(description = "TC003")
 	public void getCartitemscount() {
 		
 		CartPage cartPage = new CartPage(driver);
 		
 		LoginPage loginPage= new LoginPage(driver);
 		
 		loginPage.enterLoginCred(usname);
		
		loginPage.enterPass(pswd);
		
		loginPage.submitbtn();
		
		cartPage.getCart();
 	    
		cartPage.getCartItemscount();
 		
 				
 	}
   
   /*
   
  //Verify the total items price
   @Test(description = "TC003")
 	public void totalItemPrice() {
 		
 		CartPage cartPage = new CartPage(driver);
 		
 						
 	}
   
   
 //Verify the total cart discount
   @Test(description = "TC004")
 	public void totalCartDiscount() {
 		
 		CartPage cartPage = new CartPage(driver);
 		
 						
 	}
   
 //Verify the total delivery charges
   @Test(description = "TC005")
 	public void totalCartDeliveryCharges() {
 		
 		CartPage cartPage = new CartPage(driver);
 		
 						
 	}
   
 //Verify the total total cart amount (items price-cart discount+delivery charges)
   @Test(description = "TC006")
 	public void totalCartAmount() {
 		
 		CartPage cartPage = new CartPage(driver);
 		
 						
 	}
   
//Verify the add (+) item count functionality
   @Test(description = "TC007")
 	public void cartAddItemcount() {
 		
 		CartPage cartPage = new CartPage(driver);
 		
 						
 	}
   
   
//Verify the reduce (-) item count functionality
   @Test(description = "TC008")
 	public void cartReduceItemCount() {
 		
 		CartPage cartPage = new CartPage(driver);
 		
 						
 	}
   
   
//Verify the remove item functionality
   @Test(description = "TC009")
 	public void cartRemoveItem() {
 		
 		CartPage cartPage = new CartPage(driver);
 		
 						
 	}
   
 //Verify the "Delivery Address" functionality
   @Test(description = "TC10")
 	public void deliverOrderAt() {
 		
 		CartPage cartPage = new CartPage(driver);
 		
 						
 	}
   
 //Verify the "Place Order" button functionality
   @Test(description = "TC11")
 	public void placeOrder() {
 		
 		CartPage cartPage = new CartPage(driver);
 		
 						
 	}
   
*/	
   
}