package assignment;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Ass98_AnnoOrder1 {
	
	@BeforeSuite
	public void beforemethod()
	{
		System.out.println("Before Suite method");
	}
	@Test
	public void test1()
	{
		System.out.println("Test 1 annotation");
	}

	@Test
	public void atest1()
	{
		System.out.println("aTest executes first as per alphabet");
	}
	@AfterSuite
	public void aftermethod()
	{
		System.out.println("After suite method");
	}

}
