package assignment;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Ass100_AnnoOrder3 {
	@BeforeSuite
	public void before()
	{
		System.out.println("efore suite method");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method");
	}
	@AfterSuite
public void after()
{
	System.out.println("after suite method");
}


}
