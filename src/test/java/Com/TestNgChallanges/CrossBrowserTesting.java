package Com.TestNgChallanges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {
	WebDriver driver;

	@BeforeMethod
	@Parameters ("browser")
	public void getOpenApplication(String browser) {

		if (browser.equalsIgnoreCase("Chrome")) {
			System.out.println("Test will execute with chrome browser");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("Edge")) {
			System.out.println("Test will execute with Edge browser");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if (browser.equalsIgnoreCase("Firefox")) {
			System.out.println("Test will execute with Firefox browser");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
	}

	@AfterMethod
	public void getCloseBrowser() {
		driver.quit();
		System.out.println("BrowerClosed");
	}

	@Test
	public void getLogIn() {
		driver.get("https://www.automationexercise.com/login");
		driver.manage().window().maximize();
		System.out.println("Log in the Application");
	}

}
