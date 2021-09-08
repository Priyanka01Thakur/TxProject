package Commons;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Selectors.LoginSelectors;

public class CommonMethod {
      
	WebDriver driver = null;
	
	public CommonMethod(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	/*
	 * This Method is use for getting a Element from DOM. 
	 * @param = SelectorScheme
	 */
	public WebElement getElement(By SelectorScheme) {
		
		return driver.findElement(SelectorScheme);
		
	}
	
	/*
	 * This Method return list of Elements. 
	 * @param = SelectorScheme
	 */
	public List<WebElement> getListOfElements(By SelectorScheme){
		
		List<WebElement> elements = driver.findElements(SelectorScheme);
		return elements;
		
	}
	
	
	
	
	/*
	 * This Method is use for getting a title of page.
	 * @param = SelectorScheme
	 */
	public WebElement getTtitle(By SelectorScheme) {
	
	  return driver.findElement(SelectorScheme);
	
    } 
	
	/*
	 * This Method is use for getting a title of page.
	 
	 */
	public String getDriverTtitle() {
	
	  return driver.getTitle();
	
    } 
	
	
	/*
	 * This Method is use for quit a driver.
	 */
	public void quitDriver() {
		
		driver.quit();
	}


	/*
	 * This Method is use to switch to another frame.
	 * @param = id
	 */
	public void switchFrame(String id) {
		
		driver.switchTo().frame(id);
		
	}
	
	
	/*
	 * This Method switches back to default frame
	 */
	public void switchToDefaultFrame() {
		
		
		driver.switchTo().defaultContent();
	}
	
	/*
	 * This Method is use for refresh the current page/dom
	 */
	public void refereshPage() {
		
		
		driver.navigate().refresh();
		
	}
	
	/*
	 * This Method determine if a element is present in a DOM/Page
	 * @parm element
	 */
	public boolean isWebElementIsPresent(WebElement element) {
		
		if(element.isDisplayed() && element.isEnabled()) {
			
			return true;
		}
		
		else {
			
			return false;
		}
		
	} 
	
	/*
	 * This Method is used for hover & click on particular element
	 * @parm element
	 * @parm element2
	 */
	public void hoverOverElementAndClick(WebElement element, WebElement element2) {
		
		
		Actions act = new Actions(driver);
		
	    act.moveToElement(element).click(element2).build().perform();
		
	
	}
	
	/*
	 * This Method is used for hover the element
	 * @parm element
	 */
	public void hoverOverElementAndPause(WebElement element) {
		
		Actions act = new Actions(driver);
		
		//act.moveToElement(element).click().build().perform();
		act.clickAndHold(element).pause(2).build().perform();
	
	}
	
	
	/*
	 * This Method is used for hover the element
	 * @parm element
	 */
	public void hoverOverElement(WebElement element) {
		
		Actions act = new Actions(driver);
		
		//act.moveToElement(element).click().build().perform();
		act.clickAndHold(element).click().pause(2).build().perform();
	
	}
	
	 /* This Method add explicit wait upto 30 seconds for element visible in dom
	 * @parm Selectorscheme
	 */
	public void waitForElementToBeVisible(By Selectorscheme){
		
		
		WebDriverWait wait =new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(Selectorscheme));
		
	}
	
	 /* This Method add explicit wait upto 30 seconds for element visible in dom
		 * @parm Selectorscheme
		 */
		public void waitForElementToBeVisible(WebElement element){
			
			
			WebDriverWait wait =new WebDriverWait(driver, 30);
			
			wait.until(ExpectedConditions.visibilityOf(element));
			
		}
	
	/* This Method select option in dropdown
	 * @parm element
	 * @parm value
	 */
	public void SelectByVissibleText(WebElement element, String value) {
		
		Select select =  new Select(element);
		
		if(select.getOptions().size()>1) {
			
			select.selectByValue(value);
		} 
		
		else{
			
			System.out.println("No Option");
			
		}
	}	
	
	/* This Method sleep with seconds
	 * @parm sec
	 */
	public void waitForSec(int sec) {
		
		try {
			
		Thread.sleep(sec * 1000);
		
	   }
		
		catch(Exception ex){
			ex.printStackTrace();
		}
		
	}	
	
	
	/* This Method handles the Alert box and return alert text
	 * Close the alert popup by presing ok
	 * @return text
	 */
	public String getAlertTextAndAccept() {
		
	//	WebDriverWait we = (WebDriverWait) new WebDriverWait(driver,10).until(ExpectedConditions.alertIsPresent()) ;
		
		WebDriverWait we = new WebDriverWait(driver,30);
		
		we.until(ExpectedConditions.alertIsPresent());
		
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText(); 
		alert.accept(); 
		
		return text;
		
	}
	

	
	
	/* This Method handles the Alert box and return alert text
	 * Close the alert popup by presing cancel
	 * @return text
	 */
	public String getAlertTextAndCancel() {
		
	//	WebDriverWait we = (WebDriverWait) new WebDriverWait(driver,10).until(ExpectedConditions.alertIsPresent()) ;
		
		WebDriverWait we = new WebDriverWait(driver,30);
		
		we.until(ExpectedConditions.alertIsPresent());
		
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText(); 
		alert.dismiss();
		
		return text;
		
	}
	
	/* This Method return list of gettext of elements from Dom/Page
	 * @parm element
	 * @return getText
	 */
	public List<String> getTextOfWebElements(By element) {
		
		List<WebElement> elements = getListOfElements(element);
		List<String> getTexts = new ArrayList<String>();
		
		for (WebElement element1: elements) {
			
			getTexts.add(element1.getText());
			
		}
		return getTexts;
		
	}
	
	
	    
	/* This Method is used for scroll the element into view
	 * @parm element
	 * @return getText
	 */
		public void scrollElementIntoView(WebElement element) {
			
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			js.executeScript("arguments[0].scrollIntoView(true);",element) ;
			
		}
		
		
		/* This Method check if a web table has a particular column, also it scrolls and find the element if its a large table
		 * @parm element
		 * @return result
		 */
	
		public boolean checkIfColumnIsPresent(WebElement element) {
			
			scrollElementIntoView(element);
			
		  Boolean result =	isWebElementIsPresent(element);
			
			return result;
		}
		

		/* This Method is used to select date from current month in datepicker
		 * @parm webelement 
		 * @parm date
		 */
		
		public void selectDateFromDatePicker(List<WebElement> webelement,String date) {
			
			
			List<WebElement> updatedList = new ArrayList();
			
			
			
			
		}
		
		
		/* This Method returns the default selected value in dropdown
		 * @parm element
		 * return text
		 */
		public String getDefaultValueIsSelectedInDropdown(WebElement element) {
			
			
			Select select = new Select(element); 
			
			   WebElement option=  select.getFirstSelectedOption(); 
			   
			   
			   return option.getText().trim();
			   
			
		}
		
		/* This Method returns the list of texts of all elements
		 * @parm elements
		 * return text list
		 */
		
		public List<String> returnGetTextOfAllElements(List<WebElement> elements){
			
			List<String> getTexts = new ArrayList<String>();
			 
			for(WebElement element:elements ) {
				
				
				getTexts.add(element.getText()) ;
				
			}
			
			return getTexts;
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

