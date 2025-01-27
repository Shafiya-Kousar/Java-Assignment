package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ass85_RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*EdgeDriver d=new EdgeDriver();
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		WebElement e=d.findElement(By.xpath("//a[@class='gb_W']"));
		Actions a=new Actions(d);
		a.contextClick(e).perform();
*/
		EdgeDriver d=new EdgeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		WebElement e=d.findElement(By.xpath("//span[.='Login']"));
		Actions a=new Actions(d);
		a.contextClick(e).perform();
		
	}

}
