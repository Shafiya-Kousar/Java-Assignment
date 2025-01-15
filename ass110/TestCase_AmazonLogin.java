package ass110;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase_AmazonLogin extends LaunchQuit  {

	
	@DataProvider(name="data1")
	public Object[][] method()
	{
		Object login[][]=new Object[7][2];
		//Valid Credentials
		login[0][0]="shafiyakousar99@gmail.com";
		login[0][1]="9731058804";
		//Valid uname,invalid pwd
		login[1][0]="shafiyakousar99@gmail.com";
		login[1][1]="0000";
		//InValid uname,valid pwd
		login[2][0]="shafiyakousar@gmail.com";
		login[2][1]="9731058804";
		//InValid uname,invalid pwd
		login[3][0]="shafiyakousar";
		login[3][1]="0000";
		//Null uname,Nul pwd
		login[4][0]="";
		login[4][1]="";
		//Valid uname,null pwd
		login[5][0]="shafiyakousar99@gmail.com";
		login[5][1]="";
		//Valid uname,invalid pwd
		login[6][0]="";
		login[6][1]="9731058804";
		return login;
	}
	//@Test(dataProvider="data")
	@Test(dataProvider="data1")
	public void search(String uname,String pwd)
	{
		d.findElement(By.id("ap_email")).sendKeys(uname);
		d.findElement(By.id("continue")).click();	
		d.findElement(By.id("ap_password")).sendKeys(pwd);
	
}
}