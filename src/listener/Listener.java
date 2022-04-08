package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener 
{
	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Your TC is Started",true);
		ITestListener.super.onTestStart(result);
	}
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Sorry,your TC is fail",true);
		ITestListener.super.onTestFailure(result);
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Congrats..your TC pass",true);
		ITestListener.super.onTestSuccess(result);
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Your TC is skipped,plese check",true);
		ITestListener.super.onTestSkipped(result);
	}

}
