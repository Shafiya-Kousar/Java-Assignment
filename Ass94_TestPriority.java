package assignment;

import org.testng.annotations.Test;

public class Ass94_TestPriority {
	
	@Test(priority=3)
	public void method1()
	{
		System.out.println("Setting Test Priority, Test with least priority will execute first");
	}

	@Test(priority=1)
	public void method2()
	{
		System.out.println("Priority-1 test");
	}
	@Test(priority=2)
	public void method3()
	{
		System.out.println("Priority-2 Test");
	}
}
