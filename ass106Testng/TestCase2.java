package ass106Testng;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase2 extends LaunchQuit1 {
	
	@Test
	public void addprd() throws InterruptedException
	{
		WebElement e=d.findElement(By.id("twotabsearchtextbox"));
		e.sendKeys("shoes");

		d.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
		
		
		WebElement e1=d.findElement(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']"));
		e1.click();
		
		Set<String> e2=d.getWindowHandles();
		
		Iterator<String> e3=e2.iterator();
		String parent=e3.next();
		String child=e3.next();
		
		d.switchTo().window(child);
		//d.findElement(By.className("a-button-input")).click();
     	d.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(3000);
	
	}

}
