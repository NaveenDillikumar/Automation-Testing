package ListenersUtility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import GenericLibraries.BaseClass;

public class ListenerImplementation extends BaseClass implements ITestListener {
	
	@Override
	public void onStart(ITestContext context) {
	    System.out.println("Excecution Started");
	  }
	
	@Override
	public void onFinish(ITestContext context) {
	    System.out.println("Excecution Completed");
	  }
	
	@Override
	public void onTestStart(ITestResult result) {
	    System.out.println(result.getName()+"Started");
	  }
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println();
	  }

}
