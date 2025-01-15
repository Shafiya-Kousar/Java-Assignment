package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ass105_browserlogin {
	
	EdgeDriver d=new EdgeDriver();
	@BeforeMethod
	public void launchBrowser()
	{
		
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
	}
	@Test
	public void searchProd() throws InterruptedException
	{
	WebElement e=d.findElement(By.id("twotabsearchtextbox"));
	e.sendKeys("shoes");
	e.click();
	Thread.sleep(2000);
	
	
	}
	@AfterMethod
	public void logout()
	{
		d.close();
	}

}
