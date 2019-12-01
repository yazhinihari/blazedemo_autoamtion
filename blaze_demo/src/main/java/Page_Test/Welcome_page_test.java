package Page_Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Page_elements.Welcome_page_elements;

public class Welcome_page_test {

	WebDriver driver;
	@Test
	public void welcomepage_open() throws InterruptedException
	{
     

		try 
		{
	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\Yazhini\\Downloads\\blaze_demo\\src\\main\\java\\Blaze_demo_documents\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.get("http://blazedemo.com/index.php");
	

	PageFactory.initElements(driver,Welcome_page_elements.class);
	
	
		if (Welcome_page_elements.departure_city.isDisplayed())
			
		{
			Welcome_page_elements.departure_city.click();
			

			Select from_city=new Select(Welcome_page_elements.departure_city);
			from_city.selectByIndex(2);
		}
		
if (Welcome_page_elements.destination__city.isDisplayed())
			
		{
			Welcome_page_elements.departure_city.click();
			

			Select To_city=new Select(Welcome_page_elements.destination__city);
			To_city.selectByIndex(2);
			
			Welcome_page_elements.Find_flight.click();
		}
		

String expected_url ="http://blazedemo.com/reserve.php";

String acutal_url=driver.getCurrentUrl();

assertEquals(expected_url, acutal_url);



	}
	
	catch(Exception e)
	
	{
		driver.close();
		System.out.println(e);
		System.out.println("Code executed with error");
	}
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
		
	}
	

	
	
		
		



