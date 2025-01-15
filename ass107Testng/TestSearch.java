package ass107Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestSearch extends CrossBrowserTest {

	@Test
	public void search() throws InterruptedException
	{
		WebElement e=driver.findElement(By.id("twotabsearchtextbox"));
		e.sendKeys("shoes");
		e.click();
		Thread.sleep(2000);
	}
}
