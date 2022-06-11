package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;

	// need constructor to get LoginTest WebDriver to this class driver
	public LoginPage(WebDriver driver) {

		// to establish relationship between loginTest driver & loginPage driver
		this.driver = driver;

	}

	// Element list
	@FindBy(how = How.XPATH, using = "//input[@id=\"username\"]")
	WebElement UserName;
	@FindBy(how = How.XPATH, using = "//input[@id=\"password\"]")
	WebElement PassWord;
	@FindBy(how = How.XPATH, using = "//button[@ name='login']")
	WebElement SignInButton;
//	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Bank & Cash')]"WebElement bankCashButton;

	// Method to interact with the elements
	public void enterUserName(String username) {
		UserName.sendKeys(username);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void enterPassWord(String password) {
		PassWord.sendKeys(password);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void clickOnSignInButton() {
		SignInButton.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String getPageTitle() {
		return driver.getTitle();

	}

}
