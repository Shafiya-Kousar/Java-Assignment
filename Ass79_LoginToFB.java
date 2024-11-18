package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Ass79_LoginToFB {

	public static void main(String[] args) {
		
		EdgeDriver d=new EdgeDriver();
		d.get("https://www.facebook.com");
		d.manage().window().maximize();
		d.findElement(By.name("email")).sendKeys("shafiyakousar@gmail.com");
		d.findElement(By.name("pass")).sendKeys("1234");
		d.findElement(By.name("login")).click();
		

	}

}
