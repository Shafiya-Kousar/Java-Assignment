package assignment;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ass102_AnnoOrder5 {
	
	@Test
	public void testing1()
	{
		System.out.println("Test-1");
	}
	@Test
	public void testing2()
	{
		System.out.println("Test-2");
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
