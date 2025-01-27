package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ass88_AutoSugges_Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.id("twotabsearchtextbox"));
		e.sendKeys("Laptop");
		Thread.sleep(2000);
		List<WebElement> el=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		System.out.println(el.size());
		el.get(4).click();

	}

}
