package Page_Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Purchase_test {
	WebDriver driver;
	
	String [][] data =null;
	
	@DataProvider(name="dataprovider1")
	
	public String [][] dataprovider2()
	{
		return data;
		
	}
	
	public void getdata() throws BiffException, IOException
	
	{
		FileInputStream excel=new FileInputStream
     ("C:\\Users\\Yazhini\\Downloads\\Trashin_automation\\src\\Trashin_documents\\login_data.xls");
		
		Workbook workbook = Workbook.getWorkbook(excel);
		Sheet firstsheet= workbook.getSheet(0);
		int rowcount= firstsheet.getRows();
		int coloumncount= firstsheet.getRows();		
		
		String testdata[][]=new String[rowcount-1][coloumncount];
		
		for(int i=1; i<rowcount; i++)
			
		{
			for (int j=0; j<coloumncount; j++)
			{
				testdata[i-1][j]=firstsheet.getCell(i, j).getContents();
				
			}
			
			System.out.println(testdata);
		}
		
	}
	
	@Test (dataProvider="dataprovider1")
	public void feeddata(String name)
	
	
	{
		
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Yazhini\\Downloads\\blaze_demo\\src\\main\\java\\Blaze_demo_documents\\chromedriver.exe");
	
			driver = new ChromeDriver();
			
			driver.get("http://blazedemo.com/purchase.php");
		
	}
	
	
	
	

}
