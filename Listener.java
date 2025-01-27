package assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Listener {

	@Test
	public void listener() throws IOException, InterruptedException
	{
		
	ChromeDriver d=new ChromeDriver();
	d.get("https://www.amazon.in/");
	WebElement e=d.findElement(By.xpath("//span[text()='Hello, sign in']"));
	Actions a=new Actions(d);
	a.moveToElement(e).perform();
	WebElement e1=d.findElement(By.xpath("//span[text()='Sign in']"));
	e1.click();
	Thread.sleep(3000);
	WebElement e2=d.findElement(By.xpath("//input[@id='ap_email_login']"));
	e2.sendKeys("shafiyakousar99@gmail.com");
	WebElement e3=d.findElement(By.xpath("//input[@type='submit']"));
	e3.click();
	
	TakesScreenshot ts=d;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\Net-Softw\\eclipse-workspace\\Selenium\\SS\\shaf.png");
	FileHandler.copy(source, dest);
}
}
