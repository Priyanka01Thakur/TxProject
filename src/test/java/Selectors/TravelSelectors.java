package Selectors;

import org.openqa.selenium.By;

public class TravelSelectors {
	
		public final static By travelPage = By.xpath("//div[contains(text(),'Travel')]");
		
		//public final static By travelFrom = By.xpath("//input[@name='0-departcity']");
		
		public final static By travelFrom = By.xpath("//input[@type= 'text' and @class='_1w3ZZo _1YBGQV lZd1T6 _2vegSu _2mFmU7']");
		
		public final static By travelTo = By.xpath("//input[@name='0-arrivalcity']");
		
		public final static By departOndate = By.xpath("//input[@name='0-datefrom']");
		
		public final static By returnOndate = By.className("_2mFmU7");
		
		public final static By travellerClass = By.className("_3OFDG8");
		
		public final static By cabinClassE = By.xpath("//div[@data-checked='false'][normalize-space()='Economy']");
		
		public final static By cabinClassB = By.xpath("//div[contains(text(),'Business')]");
		
		public final static By cabinClassP = By.xpath("//div[contains(text(),'Premium Economy')]");
		
		public final static By searchBtn = By.xpath("//span[normalize-space()='SEARCH']");  
		
		public final static By searchResultField = By.xpath("(//div/div[@class='_24hoQ2 _1EzOls'])[1]");
		
		public final static By searchResultFieldInput1 = By.xpath("//input[@type='text' and @class='_1w3ZZo _1YBGQV lZd1T6 _2vegSu _2mFmU7']");
		
		public final static By searchResultFieldInput2 = By.xpath("//input[@type='text' and @class='_1w3ZZo _1YBGQV lZd1T6 _2dqBfU _2mFmU7']");
		
		public final static By pageTitle = By.className("lAXZRO");
		
		
		
	}
