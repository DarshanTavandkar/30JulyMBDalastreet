package ai.ds.utility;

import org.testng.ITestListener;
import org.testng.ITestResult;

import ai.ds.testBase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		logger.info("TestCase execution started"+ result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		logger.info("TestCase execution completed"+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		logger.info("TestCase execution failed"+ result.getName());
		UitilClass.takeScreenShot(result.getName()+ System.currentTimeMillis());
		logger.info("Take screenshot");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	
		logger.info("TestCase execution skipped"+ result.getName());
	}
	
	
	
}
