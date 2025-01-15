package ass114;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertSearch extends LaunchQuit {
	
	
	@Test
	public void searchassert() throws InterruptedException {
		
	
	WebElement e=d.findElement(By.id("twotabsearchtextbox"));
	e.sendKeys("shoes");
	WebElement e1=d.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	e1.click();
	Thread.sleep(5000);
	List<WebElement> li=d.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
	int count=li.size();
	System.out.println(count);
	Assert.assertEquals(count>50,true);


}
}
