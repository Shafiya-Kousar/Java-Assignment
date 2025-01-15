package assignment;

import org.testng.annotations.Test;

public class Ass96_TestTimeOut {

	@Test(timeOut=1000)
	public void testmethod()
	{
		System.out.println("Test timeout parameter 1sec");
	}
	@Test(timeOut=3000)
	public void testmethod1()
	{
		System.out.println("Test timeout parameter 3sec");
	}

	@Test
	public void assertmetthod()
	{
		int a=10;
		assert a<0;
		System.out.println("Failing test");
	}

	@Test
	public void assertmetthod1()
	{
		int a=100;
		assert a>0;
		System.out.println("Passing test");
	}
	
	
}
