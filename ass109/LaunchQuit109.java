package ass109;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchQuit109 {

	WebDriver d;
	@BeforeMethod
	public void launchBrowser()
	{
		d=new ChromeDriver();
		d.get("https://grotechminds.com/registeration-form/");
		d.manage().window().maximize();
	}
	@AfterMethod
	public void logout()
	{
		d.close();
	}

}
