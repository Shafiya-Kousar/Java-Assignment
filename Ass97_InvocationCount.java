package assignment;

import org.testng.annotations.Test;

public class Ass97_InvocationCount {
	
	@Test(invocationCount=5)
	public void count()
	{
		System.out.println("Invocation count parameter");
	}

}
