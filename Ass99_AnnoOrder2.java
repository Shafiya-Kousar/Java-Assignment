package assignment;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Ass99_AnnoOrder2 {
	@BeforeSuite
	public void beforeMethos()
	{
		System.out.println("Before method");
	}
	@Test
	public void testMethos()
	{
		System.out.println("TEst method");
	}
	@AfterSuite
	public void afterMethods()
	{
		System.out.println("After63\0 method");
	}
}
