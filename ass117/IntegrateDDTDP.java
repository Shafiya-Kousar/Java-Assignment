package ass117;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IntegrateDDTDP extends LaunchBrowser {
	
	@DataProvider(name="excelData")
	public Object[][] readExcel() throws EncryptedDocumentException, IOException
	{
		FileInputStream fs=new FileInputStream("C:\\Users\\Net-Softw\\eclipse-workspace\\Selenium\\ExcelSheet\\login.xlsx");
		Workbook wb= WorkbookFactory.create(fs);
		Sheet s=wb.getSheetAt(0);
		int rowCount=s.getPhysicalNumberOfRows();
		int colCount=s.getRow(0).getPhysicalNumberOfCells();
		Object[][] data=new Object[rowCount-1][colCount];
		for(int i=1;i<rowCount;i++) {
			Row row=s.getRow(i);
			for(int j=0;j<colCount;j++)
			{
				data[i-1][j]=row.getCell(j).toString();
			}
		}
		return data;
		
	}
	@Test(dataProvider="excelData")
	public void login(String un,String pwd) throws InterruptedException
	{
	//	System.out.println("uname:" +un+ "Password:" +pwd);
		WebElement e=d.findElement(By.xpath("//span[text()='Hello, sign in']"));
		Actions a=new Actions(d);
		a.moveToElement(e).perform();
		WebElement e1=d.findElement(By.xpath("//span[text()='Sign in']"));
		e1.click();
		Thread.sleep(3000);
		WebElement e2=d.findElement(By.xpath("//input[@id='ap_email_login']"));//input[@id='ap_email_login']
		e2.sendKeys(un);
		WebElement e3=d.findElement(By.xpath("//input[@type='submit']"));
		e3.click();
		WebElement e4=d.findElement(By.xpath("//input[@id='ap_password']"));
		e4.sendKeys(pwd);
		WebElement e5=d.findElement(By.xpath("//input[@id='signInSubmit']"));
		e5.click();
	}

}
