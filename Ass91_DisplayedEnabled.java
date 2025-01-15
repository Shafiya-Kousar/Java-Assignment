package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Ass91_DisplayedEnabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EdgeDriver d=new EdgeDriver();
		d.get("file:///C:/Users/Net-Softw/Downloads/grotechminds.html");
		d.manage().window().maximize();
		System.out.println(d.findElement(By.id("121")).isDisplayed());
	    System.out.println(d.findElement(By.id("121")).isEnabled());

	}

}
