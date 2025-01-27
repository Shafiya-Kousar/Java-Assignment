package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ass83_HooverOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver d=new EdgeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		WebElement e=d.findElement(By.xpath("//span[.='Fashion']"));
		Actions a=new Actions(d);
		a.moveToElement(e).perform();
		WebElement e1=d.findElement(By.xpath("//a[.='Men Footwear']"));
		a.moveToElement(e1).perform();
		d.findElement(By.linkText("Men's Sports Shoes")).click();
		
	
	}
}
