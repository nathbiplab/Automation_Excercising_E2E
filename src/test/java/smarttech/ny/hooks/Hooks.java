package smarttech.ny.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import smarttech.ny.basepage.BasePage;

public class Hooks extends BasePage {

	@Before
	public void setUp() {
		getOpenApplication();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

}
