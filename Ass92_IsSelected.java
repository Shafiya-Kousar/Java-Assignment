package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ass92_IsSelected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver d=new EdgeDriver();
		d.get("file:///C:/Users/Net-Softw/Downloads/grotechminds.html");
		d.manage().window().maximize();
		WebElement check=d.findElement(By.xpath("/html/body/form[2]/input[1]"));
		WebElement check1=d.findElement(By.xpath("/html/body/form[2]/input[2]"));
		boolean b=check.isDisplayed();
		boolean b1=check.isEnabled();
		boolean b2=check.isSelected();
		if(b==true && b1==true)
		{
			check.click();
		}
		if(b2==false)
		{
			check1.click();
		}
		

	}

}
