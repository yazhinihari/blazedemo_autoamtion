package Page_Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Page_elements.Flight_listpage_elements;
import Page_elements.Welcome_page_elements;

public class Flight_list_page_test {

	WebDriver driver;
	@Test
	public void clickflight() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yazhini\\Downloads\\blaze_demo\\src\\main\\java\\Blaze_demo_documents\\chromedriver.exe");
				
				driver = new ChromeDriver();
				
				driver.get("http://blazedemo.com/index.php");
				

				PageFactory.initElements(driver,Flight_listpage_elements.class);
				PageFactory.initElements(driver,Welcome_page_elements.class);
				
				Welcome_page_elements.departure_city.click();
				

				Select from_city=new Select(Welcome_page_elements.departure_city);
				from_city.selectByIndex(2);
				
				Welcome_page_elements.departure_city.click();
				

				Select To_city=new Select(Welcome_page_elements.destination__city);
				To_city.selectByIndex(2);
				
				Welcome_page_elements.Find_flight.click();
				
				Flight_listpage_elements.chooseflight(driver).click();
				
	String c="http://blazedemo.com/purchase.php";
	
	String d=driver.getCurrentUrl();
	assertEquals(c, d);
	
	
	
	
				
				
				
				
	}
	
	
	
}
