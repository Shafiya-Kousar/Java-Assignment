package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ass84_DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver d=new EdgeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		WebElement e=d.findElement(By.xpath("//span[.='Login']"));
		Actions a=new Actions(d);
		a.doubleClick(e).perform();
		
		

	}

}
