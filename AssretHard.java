package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class AssretHard {

	
	@Test
	public void method()
	{
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		//Assertion a=new Assertion();
		SoftAssert s=new SoftAssert();
		WebElement e=d.findElement(By.name("q"));
		e.sendKeys("Testing");
		//a.assertEquals(d.getTitle(), "Google", "Check Expected");
		s.assertEquals(e.isDisplayed(), true);
		s.assertAll();
	}
}
