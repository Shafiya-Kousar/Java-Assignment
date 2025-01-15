package assignment;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ass103_AnnoOrder6 {
	
	@Test
	public void ctesting1()
	{
		System.out.println("Test");
	}
	@Test
	public void atesting1()
	{
		System.out.println("Test");
	}
	@Test
	public void btesting2()
	{
		System.out.println("Test");
	}
		@AfterMethod
		public void after1()
		{
			System.out.println("After Method");
		}
	

		@BeforeMethod
		public void before()
		{
			System.out.println("Before Method");
		}



}
