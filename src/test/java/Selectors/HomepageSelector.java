package Selectors;

import org.openqa.selenium.By;

public class HomepageSelector {
	//Search Bar
	public final static By searchbox = By.className("_3OO5Xc");
	
	public final static By searchbtn = By.className("L0Z3Pu");
	
	//menuitems
	public final static By menuitems = By.className("_37M3Pb");
	
	//Banner
	public final static By banner = By.className("_1mIbUg");
	
	//product listing
	public final static By productlisting = By.xpath("//div[@class='_1AtVbE']//div[@class='_3E8aIl KdL3Vb']//div[@class='_2N81D7']//div//a[@class='_2KpZ6l _3dESVI'][normalize-space()='VIEW ALL']");
	
}