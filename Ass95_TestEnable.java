package assignment;

import org.testng.annotations.Test;

public class Ass95_TestEnable {

	@Test(enabled=false)
	public void test1()
	{
		System.out.println("Test enable parameter false");
	}
	@Test(enabled=true)
	public void test2()
	{
		System.out.println("Test enable parameter true");
	}
}
