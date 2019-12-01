package Page_elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Welcome_page_elements {

	@FindBy(name="fromPort")
	public static WebElement  departure_city;
	
	
	@FindBy(name="toPort")
	public static WebElement  destination__city;
	
	
	@FindBy(xpath="/html/body/div[3]/form/div/input")
	public static WebElement  Find_flight;
		
	
}
