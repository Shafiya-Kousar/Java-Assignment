package ass129;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Iframe extends Launch {

	@Test
	public void frame() throws InterruptedException 
	{
		driver.findElement(By.className("gb_A")).click();
		
		driver.switchTo().frame(driver.findElement(By.name("app")));
		driver.findElement(By.xpath("//span[.='YouTube']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.name("search_query")).sendKeys("India");
		Thread.sleep(3000);
		List<WebElement> li=driver.findElements(By.className("ytSuggestionComponentBold"));
		int count=li.size();
		System.out.println(count);
		li.get(count-1).click();
		
		
	}
}
