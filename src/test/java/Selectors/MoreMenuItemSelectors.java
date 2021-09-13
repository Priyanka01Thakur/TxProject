package Selectors;

import org.openqa.selenium.By;

public class MoreMenuItemSelectors {

	//public final static By moreMenu = By.className("//div[@class='go_DOp']//div//div//div[@class='exehdJ' and contains(text(),'More')]");
	//public final static By moreMenu = By.xpath("//div[contains(text(),'More')]");
	//public final static By moreMenu = By.xpath("//div//ul[@class='pO9syL']");
	//public final static By moreMenu = By.className("exehdJ");
	public final static By moreMenu = By.xpath("//div[@class='exehdJ'][normalize-space()='More']");
	//public final static By advertise =By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[4]/div/div/div[2]/div[2]/div/ul/li[4]");
	public final static By advertise = By.xpath("//div[@class='_3vhnxf' and contains(text(),'Advertise')]");
	
	//Advertise page selectors
	public final static By advertisePageMetaTitle = By.xpath("//title[contains(text(),'Flipkart Ads Platform')]");
	public final static By advertisePageImage = By.xpath("//div[@class='styles__ImageContainer-hshh5i-0 qycEY']");
	public final static By advertisePageFormTitle = By.xpath("//p[@class='styles__SubHeading-sc-18s7njp-8 bnWAIA']");
	
}
