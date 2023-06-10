package Com.TestNgChallanges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallalTesting {
	WebDriver driver;
@Test
	public void SmokeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		System.out.println("SmokeTest");

	}
@Test
	public void SenatyTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		System.out.println("SenatyTest");
	}
@Test
	public void RegressionTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		System.out.println("RegressionTest");
	}
@Test
	public void FunctionalTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		System.out.println("FunctionalTest");
	}

}
