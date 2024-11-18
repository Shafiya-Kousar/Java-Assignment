package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Ass82_Xpath {

	public static void main(String[] args) {
	
		EdgeDriver d= new EdgeDriver();
		d.get("file:///C:/Users/Net-Softw/Downloads/grotechminds.html");
		d.manage().window().maximize();
		d.findElement(By.xpath("/html/body/input[1]")).sendKeys("Shafiya");
		//d.findElement(By.id(null))

	}

}
