package ass112;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase_Iretry {
	
	@Test(retryAnalyzer=RetryAnalyzer.class)
	public void loginRetry()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.id("ap_email"));
		e.sendKeys("shafiyakousar99@gmail.com");
		WebElement e1=driver.findElement(By.id("continue"));
		e1.click();
		WebElement e2=driver.findElement(By.id("ap_password"));
		e2.sendKeys("0000");
		WebElement e3=driver.findElement(By.className("signInSubmit"));
		e3.click();
		
		
		
		
		
		

	
	}

}
