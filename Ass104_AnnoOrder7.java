package assignment;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ass104_AnnoOrder7 {
	
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
