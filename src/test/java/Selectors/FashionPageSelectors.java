package Selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FashionPageSelectors {
	
	public final static By fashionPage = By.xpath("//div[contains(text(),'Fashion')]");
	
	public final static By fashionWomenEthnicPage = By.xpath("//a[normalize-space()='Women Ethnic']");
	
	//public final static By fashionWomenEthnicPage = By.xpath("/html/body/div/div/div[2]/div/div/div[4]/a/div[2]/div[2]/div[2]/div/div/div[1]/a[3]");
	
	public final static By prizeSliderMin = By.xpath("//div[contains(@class,'HQL4QS') and contains(@class,'_28DFQy')]");
	
	public final static By prizeSliderMax = By.xpath("//div[contains(@class,'HQL4QS') and contains(@class,'WC_zGJ')]");
	
	public final static By prizeSliderMain = By.className("_12FhcQ");
	
	public final static By filterPriceMin = By.className("_1YAKP4");
	
	public final static By filterPriceMinValues = By.className("_3AsjWR");
	
	public final static By filterPriceMax = By.className("_3uDYxP");
	
	public final static By BrandSection= By.xpath("//div[contains(text(),'Brand')]");
	
	public final static By ExpandBrandFilter= By.xpath("//div[@class='QvtND5 _2w_U27']");
	
	public final static By BrandFilters= By.xpath("_38vbm7");
	
	public final static By BrandChecbox = By.className("_30VH1S");
	
	public final static By pageTitle =By.className("_10Ermr");
	
	public final static By defaultSortByOption = By.xpath("//div[@class='_10UF8M _3LsR0e']");
	
	public final static By SortByOption = By.className("_10UF8M");
	
	public final static By totalProductsonFirstPage = By.className("_2r_T1I");

	public final static By productPrice = By.className("_30jeq3");
					
}