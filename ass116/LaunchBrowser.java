package ass116;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchBrowser extends ListenerClass {

	
	@BeforeMethod
	public void Login()
	{
		d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		
	}
	@AfterMethod
	public void logOut()
	{
		//d.quit();
	}
}
