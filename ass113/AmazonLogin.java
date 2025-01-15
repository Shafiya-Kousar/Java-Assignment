package ass113;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonLogin extends LaunchQuit {
	
	@Test
	public void Assertlogin()
	{
		d.findElement(By.xpath("//span[.='Hello, sign in']")).click();
		d.findElement(By.id("ap_email")).sendKeys("shafiyakousar99@gmail.com");
		d.findElement(By.id("continue")).click();	
		d.findElement(By.id("ap_password")).sendKeys("9731058804");
		d.findElement(By.id("signInSubmit")).click();
		Assert.assertEquals(d.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in","Check the actual result");
	
	}

}
