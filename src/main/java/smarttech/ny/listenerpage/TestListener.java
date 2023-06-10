package smarttech.ny.listenerpage;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart" + result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess" + result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure" + result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		//System.out.println("onTestSuccess" + result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		//System.out.println("onTestSuccess" + result.getName());
		
	}

	@Override
	public void onStart(ITestContext context) {
		//System.out.println("onTestSuccess" + result.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		//System.out.println("onTestSuccess" + result.getName());
		
	}

}
