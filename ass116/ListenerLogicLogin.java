package ass116;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerClass.class)
public class ListenerLogicLogin extends LaunchBrowser{
	
	@Test
	public void listener() throws IOException, InterruptedException
	{
	WebElement e=d.findElement(By.xpath("//span[text()='Hello, sign in']"));
	Actions a=new Actions(d);
	a.moveToElement(e).perform();
	WebElement e1=d.findElement(By.xpath("//span[text()='Sign in']"));
	e1.click();
	Thread.sleep(3000);
	WebElement e2=d.findElement(By.xpath("//input[@id='ap_email_login']"));//input[@id='ap_email_login']
	e2.sendKeys("shafiyakousar99@gmail.com");
	WebElement e3=d.findElement(By.xpath("//input[@type='submit']"));
	e3.click();
	WebElement e4=d.findElement(By.xpath("//input[@id='ap_password']"));
	e4.sendKeys("9731058804");
	WebElement e5=d.findElement(By.xpath("//input[@id='signInSubmit']"));
	e5.click();
	
	
	
	
	
	}
}
