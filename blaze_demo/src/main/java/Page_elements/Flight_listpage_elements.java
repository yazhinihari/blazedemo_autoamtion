package Page_elements;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Flight_listpage_elements {

	
	public static WebElement  chooseflight (WebDriver driver ) 
	{
		
		
		for(int i = 1;i<7;i++)
			
		{
			
			String a=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
			
			
		String b="Aer Lingus";
		
		if(a.equalsIgnoreCase(b))
		
		{
			WebElement chooseflight=  driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]"));
			return chooseflight;
	}
    }
		return null;
		
		
	
		
		 
		 
		
	}
}
