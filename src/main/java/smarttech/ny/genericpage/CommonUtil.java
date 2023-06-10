package smarttech.ny.genericpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.tlh.ach;
import smarttech.ny.basepage.BasePage;

public class CommonUtil extends BasePage {

	public static void actionClick(WebElement ele) {
		Actions ac = new Actions(driver);
		ac.click(ele).build().perform();
	}

	
}
