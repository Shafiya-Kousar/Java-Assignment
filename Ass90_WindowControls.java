package assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ass90_WindowControls {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver d=new EdgeDriver();
		d.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		d.manage().window().maximize();
		d.findElement(By.xpath("//button[@class='socialbtn google resman-btn-tertiary resman-btn-medium']")).click();
		Set<String> i=d.getWindowHandles();
		Iterator<String> is=i.iterator();
		String parent=is.next();
		String child=is.next();
		d.switchTo().window(child);
	
		WebElement e1=d.findElement(By.xpath("//input[@id='identifierId'])"));
		e1.sendKeys("shafiyakousar99@gmail.com");
		WebElement e2=d.findElement(By.xpath("//span[.='Create account']"));
		e2.click();
		WebElement e3=d.findElement(By.xpath("//input[@id='firstname']"));
		e3.sendKeys("Shafiya");
		WebElement e4=d.findElement(By.xpath("//input[@id='lastname']"));
		e4.sendKeys("kousar");
	}

}
