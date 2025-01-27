package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Ass118_Explicit_Wait {
	WebDriverWait wait;
	@Test
	public void explicit()
	{

		
		EdgeDriver d=new EdgeDriver();
		wait=new WebDriverWait(d,Duration.ofSeconds(10));
		d.get("https://www.facebook.com");
		wait.until(ExpectedConditions.titleIs("Facebook – log in or sign up"));		
		wait.until(ExpectedConditions.titleContains("Facebook"));
		d.manage().window().maximize();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@role='button'])[2]"))).click();
		d.navigate().back();
		wait.until(ExpectedConditions.urlContains("https://www.facebook.com/"));
		d.findElement(By.name("email")).sendKeys("shafiyakousar@gmail.com");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("pass"))).sendKeys("1234");
		WebElement e=d.findElement(By.name("login"));	
		wait.until(ExpectedConditions.visibilityOf(e)).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Log In with Google"))).click();
		
	}

}
