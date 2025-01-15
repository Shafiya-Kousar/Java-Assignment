package ass108Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest extends BeforeAfter {
	
	@DataProvider(name="data")
	public Object[][] method()
	{
		return new Object[][] {{"Gukesh"},{"Pragyanand"},{"Vishwanath"},{"Magnus"},{"Akhil"}} ;
	}
	@DataProvider(name="data1")
	public Object[][] method1()
	{
		return new Object[][] {{"Asia"},{"Africa"},{"Antartica"},{"America"},{"Europe"}} ;
	}
	//@Test(dataProvider="data")
	@Test(dataProvider="data1")
	public void search(String input)
	{
		d.findElement(By.name("q")).sendKeys(input);
		d.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	

}
