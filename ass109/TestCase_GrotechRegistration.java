package ass109;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase_GrotechRegistration extends LaunchQuit109 {

	@DataProvider(name="registration")
	public Object[][] grotech_data()
	{
		Object data[][]=new Object[1][6];
		data[0][0]="Shafiya";
		data[0][1]="Kousar";
		data[0][2]="shafiyakousar99@gmai.com";
		data[0][3]="9731058804";
		data[0][4]="123456789012";
		data[0][5]="ICPK3448F";
		return data;
		
		
	}
	
	@Test(dataProvider="registration")
	public void register(String fname,String lname,String email,String ph,String adhar,String pan) {
		
		d.findElement(By.id("firstName")).sendKeys(fname);
		d.findElement(By.id("lastName")).sendKeys(lname);
		d.findElement(By.id("email")).sendKeys(email);
		d.findElement(By.id("phone")).sendKeys(ph);
		WebElement e=d.findElement(By.id("gender"));
		
		Select s1=new Select(e);
		s1.selectByIndex(1);
		WebElement e1=d.findElement(By.id("gender"));
		Select s2=new Select(e1);
		//s2.selectByValue("karnataka");
		//s2.selectByVisibleText("Karnataka");
		//s2.selectByIndex(15);
		s2.selectByIndex(1);
		d.findElement(By.id("aadhaar")).sendKeys(adhar);
		d.findElement(By.id("pan")).sendKeys(pan);
		

		
	}
}
