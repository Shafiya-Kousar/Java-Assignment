package ass105Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchQuit {
	
	WebDriver d;
	@BeforeMethod
	public void launchBrowser()
	{
		d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
	}
	@AfterMethod
	public void logout()
	{
		d.close();
	}

}
