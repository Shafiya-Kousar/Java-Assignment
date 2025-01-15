package ass114;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchQuit {

	WebDriver d;
	@BeforeMethod
	public void launchBrowser()
	{
		d=new EdgeDriver();
		d.get("https://www.amazon.in");
		d.manage().window().maximize();
	}
	@AfterMethod
	public void logout()
	{
		d.close();
	}

}
