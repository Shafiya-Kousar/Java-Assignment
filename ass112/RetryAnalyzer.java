package ass112;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class RetryAnalyzer  implements IRetryAnalyzer {

	int initialCount=0;
	int retryCount=2;
	
	@Override
	public boolean retry(ITestResult result) {
	
		if(initialCount<retryCount)
		{
			initialCount++;
		
			return true;
			
		}
		return false;
	}
}
