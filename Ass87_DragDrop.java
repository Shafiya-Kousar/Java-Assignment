package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ass87_DragDrop {

	public static void main(String[] args) {
		EdgeDriver d=new EdgeDriver();
		d.get("https://grotechminds.com/drag-and-drop/");
		d.manage().window().maximize();
		WebElement e1=d.findElement(By.id("drag7"));
		WebElement e2=d.findElement(By.id("div2"));
		Actions a=new Actions(d);
		a.dragAndDrop(e1, e2).perform();
		/*WebElement e3=d.findElement(By.id("drag7"));
		WebElement e4=d.findElement(By.id("div2"));
		Actions a1=new Actions(d);
		a1.dragAndDrop(e3, e4).perform();
*/
	}

}
