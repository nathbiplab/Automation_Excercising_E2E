package Com.TestNgChallanges;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotation {

	
	@BeforeTest
	public void getBeforeTest () {
		System.out.println("Run getBeforeTest");
	}
	@BeforeClass
	public void getBeforeClass () {
		System.out.println("Run getBeforeClass");
	}
	@BeforeMethod
	public void getBeforeMethod () {
		System.out.println("Run getBeforeMethod");
	}
	@Test
	public void getTest () {
		System.out.println("Run getTest");
	}
	@AfterMethod
	public void getAfterMethod () {
		System.out.println("Run getAfterMethod");
	}
	@AfterClass
	public void getAfterClass () {
		System.out.println("Run getAfterClass");
	}
	@AfterTest
	public void getAfterTest () {
		System.out.println("Run getAfterTest");
	}
	
	@AfterSuite
	public void getAfterSuite () {
		System.out.println("Run getAfterSuite");
	}
	@BeforeSuite
	public void getBeforeSuite () {
		System.out.println("Run getBeforeSuite");
	}
	
}
