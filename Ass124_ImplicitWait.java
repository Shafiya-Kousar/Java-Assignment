package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ass124_ImplicitWait {

	@Test()
	public void test()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement e=driver.findElement(By.name("q"));
		e.sendKeys("Bangalore");
		
		List<WebElement> e1=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int len=e1.size();
		System.out.println(len);
		for(int i=0;i<len;i++) {
			
		
		WebElement a=e1.get(i);
		String sugg=a.getText();
		System.out.println(sugg);


	}
}
}