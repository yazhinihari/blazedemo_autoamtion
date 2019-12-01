package Page_Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class exapmlep {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		FileInputStream excel=new FileInputStream
			     ("C:\\Users\\Yazhini\\Downloads\\blaze_demo\\src\\main\\java\\Blaze_demo_documents\\Balzedmo.xls");
					
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
							  print2D(testdata);
							
						}
						
						
						public static void print2D(String testdata[][]) 
					    { 
					        // Loop through all rows 
					        for (int a = 0; i < testdata.length; i++) 
					  
					            // Loop through all elements of current row 
					            for (int b= 0; b < testdata[a].length; b++) 
					                System.out.print(testdata[a][b] + " "); 
					    } 
					}

}
	
}
