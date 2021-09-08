package Selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FashionPageSelectors {
	
	public final static By fashionPage = By.xpath("//div[contains(text(),'Fashion')]");
	
	public final static By fashionWomenEthnicPage = By.xpath("//a[contains(text(),'Women Ethnic') and @class='_6WOcW9']");
	
	//public final static By fashionWomenEthnicPage = By.xpath("/html/body/div/div/div[2]/div/div/div[4]/a/div[2]/div[2]/div[2]/div/div/div[1]/a[3]");
	
	public final static By prizeSlider = By.className("_1nneZ0");
	
	public final static By filterPriceMin = By.className("_2YxCDZ");
	
	public final static By filterPriceMinValues = By.className("_3AsjWR");
	
	public final static By filterPriceMax = By.className("_3uDYxP");
	
	public final static By BrandFilter= By.xpath("//div[contains(text(),'Brand')]");

	
					
}