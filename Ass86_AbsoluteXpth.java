package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ass86_AbsoluteXpth {

	public static void main(String[] args) {
	
     EdgeDriver d=new EdgeDriver();
     d.get("file:///C:/Users/Net-Softw/Downloads/grotechminds.html");
     d.manage().window().maximize();
     d.findElement(By.xpath("/html/body/input[1]")).sendKeys("Shafiya");
     d.findElement(By.xpath("/html/body/input[2]")).sendKeys("uname");
     d.findElement(By.xpath("/html/body/input[3]")).sendKeys("Myname");
     d.findElement(By.xpath("html/body/form[1]/input[1]")).sendKeys("Shafiya");
     d.findElement(By.xpath("/html/body/input[5]")).click();
     d.findElement(By.xpath("/html/body/input[6]")).click();
     d.findElement(By.xpath("/html/body/input[7]")).click();
     d.findElement(By.xpath("/html/body/form[2]/input[1]")).click();     
     WebElement e =d.findElement(By.xpath("/html/body/select"));
     Select s=new Select(e);
     s.selectByValue("3");

	}

}
