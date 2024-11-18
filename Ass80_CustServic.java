package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ass80_CustServic {

	public static void main(String[] args) {
	

		EdgeDriver d= new EdgeDriver();
		d.get("https://amazon.in");
		d.manage().window().maximize();
		//d.findElement(By.linkText("Customer Service")).click();
		WebElement e=d.findElement(By.name("url"));
	    e.sendKeys(Keys.ARROW_DOWN);
	    e.sendKeys(Keys.ARROW_DOWN);
	    e.sendKeys(Keys.ARROW_DOWN);
		
	}

}
