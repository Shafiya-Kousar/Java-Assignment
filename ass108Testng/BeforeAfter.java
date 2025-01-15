package ass108Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BeforeAfter {

	WebDriver d;
	@BeforeMethod
	public void launchBrowser()
	{
		d=new ChromeDriver();
		d.get("https://www.google.com");
		d.manage().window().maximize();
	}
	@AfterMethod
	public void logout()
	{
		d.close();
	}

}
