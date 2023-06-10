package Com.TestNgChallanges;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority = 4)
	public void getMethod1() {
		System.out.println("getMethod1");
	}
@Test(priority = 3)
	public void getMethod2() {
		System.out.println("getMethod2");
	}
@Test(priority = 2)
	public void getMethod3() {
		System.out.println("getMethod3");
	}
@Test(priority = 1)
	public void getMethod4() {
		System.out.println("getMethod4");
	}
@Test(priority = 0)
	public void getMethod5() {
		System.out.println("getMethod5");
	}
	

}
