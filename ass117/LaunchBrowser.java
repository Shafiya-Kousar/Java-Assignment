package ass117;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchBrowser {

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
