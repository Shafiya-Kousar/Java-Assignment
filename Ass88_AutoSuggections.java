package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass88_AutoSuggections {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.name("q"));
		e.sendKeys("Bangalore");
		Thread.sleep(2000);
		List<WebElement> e1=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int len=e1.size();
		System.out.println(len);
		for(int i=0;i<len;i++) {
			
		
		WebElement a=e1.get(i);
		String sugg=a.getText();
		System.out.println(sugg);

	}
		//e1.get(2).click();
		e1.get(len-2).click();
	}

}
