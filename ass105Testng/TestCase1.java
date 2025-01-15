package ass105Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase1 extends LaunchQuit	 {
	
	@Test
	public void searchProd() throws InterruptedException
	{
	WebElement e=d.findElement(By.id("twotabsearchtextbox"));
	e.sendKeys("shoes");
	
	d.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	Thread.sleep(2000);
	
	
	}
}
