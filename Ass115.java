package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ass115 {
WebDriverWait wait;
	@Test
	public void test()
	{
		ChromeDriver d=new ChromeDriver();
		wait=new WebDriverWait(d,Duration.ofSeconds(10));
		d.get("https://grotechminds.com/registration/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.findElement(By.id("fname")).sendKeys("shafiya");
		d.findElement(By.cssSelector("input[class='lname form-control ']")).sendKeys("Kousar");
		d.findElement(By.name("email")).sendKeys("shafiya.kousar@gai.com");
		d.findElement(By.xpath("(//input[@placeholder='Password'])[2]")).sendKeys("shaf@gro");
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("Female"))).click();
		//d.findElement(By.xpath("//input[@value='Female']")).click();
		WebElement e=d.findElement(By.id("Skills"));
		Select s1=new Select(e);
		s1.selectByValue("select2");
		WebElement e1=d.findElement(By.name("Country"));
		Select s2=new Select(e1);
		s2.selectByVisibleText("Bhutan ");
		/*WebElement e2=d.findElement(By.name("Relegion"));
		Select s3=new Select(e2);
		s3.selectByIndex(2);*/
		d.findElement(By.xpath("(//textarea[@type='text'])[1]")).sendKeys("KArnataka");
		d.findElement(By.xpath("(//textarea[@type='text'])[2]")).sendKeys("Bangalore");
		d.findElement(By.cssSelector("input[id='Pincode']")).sendKeys("56006");
		d.findElement(By.id("Relegion")).sendKeys(Keys.ARROW_DOWN);
		d.findElement(By.id("file")).sendKeys("C:\\Users\\Net-Softw\\Desktop\\Git_Steps.docx");
		d.findElement(By.id("relocate")).click();
		WebElement ele=d.findElement(By.cssSelector("button[style=\"width: 100%;\"]"));
		Point p=ele.getLocation();
		int x=p.getX();
		int y=p.getY();
		JavascriptExecutor js=d;
		js.executeScript("window.scrollBy(0,"+y+")");
		ele.click();
		Assert.assertEquals(ele.isSelected(), true, "Check Element");
		
		
	}
}
