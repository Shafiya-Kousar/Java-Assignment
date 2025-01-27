package ass117;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.testng.annotations.Test;

public class DataDrivenTest {
	

	@Test
	public void testing() throws EncryptedDocumentException, IOException
	{
	
		FileInputStream f1=new FileInputStream("C:\\Users\\Net-Softw\\eclipse-workspace\\Selenium\\ExcelSheet\\login.xlsx");
	    Workbook w=WorkbookFactory.create(f1);
	/*    Sheet s=w.getSheet("login");
	    Row r=s.getRow(0);
	    Cell c= 	r.getCell(0);
	    String un= c.getStringCellValue();
	    System.out.println(un);
	  */
	/*   String s= w.getSheet("login").getRow(0).getCell(0).getStringCellValue();
	   String s1= w.getSheet("login").getRow(1).getCell(0).getStringCellValue();
	System.out.println(s);
	*/
	    String un=NumberToTextConverter.toText(w.getSheet("login").getRow(0).getCell(0).getNumericCellValue());
	    }
}