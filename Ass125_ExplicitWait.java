package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Ass125_ExplicitWait {
	
	@Test
	public void exwait()
	{
		WebDriver d=new ChromeDriver();
		WebDriverWait w=new WebDriverWait(d,Duration.ofSeconds(10));
		d.get("https://grotechminds.com/javascript-popup/");
		WebElement e=d.findElement(By.xpath("//button[.='Click ']"));
		e.click();
		w.until(ExpectedConditions.alertIsPresent());
		d.switchTo().alert().accept();
		
	}

}
