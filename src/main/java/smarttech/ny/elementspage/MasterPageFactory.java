package smarttech.ny.elementspage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import smarttech.ny.basepage.BasePage;
import smarttech.ny.genericpage.CommonUtil;

public class MasterPageFactory extends BasePage {
	// Initialization PageFactory
	public MasterPageFactory() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@name='email'])[1]")
	@CacheLookup
	private WebElement enterEmail;

	public WebElement getEnterEmail() {
		return enterEmail;
	}

	@FindBy(xpath = "//input[@type='password']")
	@CacheLookup
	private WebElement enterPassword;

	public WebElement getEnterPassword() {
		return enterPassword;
	}

	@FindBy(xpath = "//input[@type='password']")
	@CacheLookup
	private WebElement clickOnLoginBTN;
	public WebElement getClickOnLoginBTN() {
		return clickOnLoginBTN;
	}
	@FindBy(xpath = "//*[text()=' Home']")
	@CacheLookup
	private WebElement verifyHomePage;
	public WebElement getverifyHomePage() {
		return verifyHomePage;
	}
	@FindBy(xpath = "//*[text()='  Products']']")
	@CacheLookup
	private WebElement clickOnProduct; 
	public WebElement getclickOnProduct() {
		return clickOnProduct;
	}
	

	public void getLogin(String userName, String password) {
		getEnterEmail().sendKeys(userName);
		getEnterPassword().sendKeys(password);
		//CommonUtil.actionClick(getClickOnLoginBTN());
		
		Actions ac = new Actions(driver);
		ac.click(driver.findElement(By.xpath("(//button[@type='submit'])[1]"))).build().perform();
		
		//Actions ac = new Actions (driver);
		//ac.click(clickOnLoginBTN).build().perform();
		//getClickOnLoginBTN().click();
	}                  // js= java script 
	/*public static void jsClick () {
		JavaScriptExecuter js = (JavaScriptExecuter)
	}*/

}
