package Com.TestNgChallanges;

import org.testng.annotations.Test;

public class SameTestCasesRunMultipleTimes {
	@Test(invocationCount = 15)
	public void getMethod() {
		System.out.println("getMethod");
	}
}
