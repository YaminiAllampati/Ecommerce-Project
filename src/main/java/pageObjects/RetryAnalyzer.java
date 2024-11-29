package pageObjects;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

	int intCount=0;
	int Finalcount=2;
	@Override
	public boolean retry(ITestResult result) {
		
		
		
			if(intCount<Finalcount)
			{
				intCount++;
				return true;	
			}
		
		return false;
	}

}
