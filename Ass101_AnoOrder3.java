package assignment;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Ass101_AnoOrder3 {
	
	@Test
	public void testing1()
	{
		System.out.println("test method");
	}
	@Test
	public void btesting1()
	{
		System.out.println("test method-2");
	}
	@Test
	public void ctesting1()
	{
		System.out.println("test method-3");
	}

	@AfterMethod
	public void methodAfter()
	{
		System.out.println("After method");
	}
}
