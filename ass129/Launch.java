package ass129;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch {

	WebDriver driver;
	@BeforeMethod
	public void browser()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	}
	@AfterMethod
	public void quit()
	{
		//driver.quit();
	}
}
