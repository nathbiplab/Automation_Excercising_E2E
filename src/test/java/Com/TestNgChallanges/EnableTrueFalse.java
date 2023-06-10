package Com.TestNgChallanges;

import org.testng.annotations.Test;

public class EnableTrueFalse {

	@Test(enabled = true)
	public void getMethod1() {
		System.out.println("getMethod1");
	}
@Test(enabled = false)
	public void getMethod2() {
		System.out.println("getMethod2");
	}
@Test(enabled = true)
	public void getMethod3() {
		System.out.println("getMethod3");
	}
@Test(enabled = false)
	public void getMethod4() {
		System.out.println("getMethod4");
	}
@Test(enabled = true)
	public void getMethod5() {
		System.out.println("getMethod5");
	}
	
}
