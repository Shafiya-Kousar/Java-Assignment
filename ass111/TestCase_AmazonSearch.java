package ass111;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase_AmazonSearch extends LaunchQuit {

	@DataProvider(name="data1")
	public Object[][] method()
	{
		Object search[][]=new Object[10][1];
		search[0][0]="Mobiles";
		search[1][0]="Shoes";
		search[2][0]="Bag";
		search[3][0]="Jacket";
		search[4][0]="Laptop";
		search[5][0]="Chair";
		search[6][0]="Toys";
		search[7][0]="Plants";
		search[8][0]="Saree";
		search[9][0]="Lipstick";
		return search;
	}
	
	@Test(dataProvider="data1")
	public void search(String product)
	{
		d.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
		d.findElement(By.id("nav-search-submit-button")).click();	
		
	
}
}