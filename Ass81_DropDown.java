package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ass81_DropDown {

	public static void main(String[] args) {
		EdgeDriver d=new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://grotechminds.com/registration/");
		WebElement e=d.findElement(By.id("Skills"));
		Select s1=new Select(e);
		s1.selectByValue("select2");
		WebElement e1=d.findElement(By.name("Country"));
		Select s2=new Select(e1);
		s2.selectByVisibleText("Bhutan ");
		WebElement e2=d.findElement(By.name("Relegion"));
		Select s3=new Select(e2);
		s3.selectByIndex(2);
		}

}
