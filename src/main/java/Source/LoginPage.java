package Source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;

	// Locators
	@FindBy(name = "email")
	WebElement txtUsername;

	@FindBy(id = "continue")
	WebElement btnContinue;

	@FindBy(xpath = "//input[@id='ap_password']")
	WebElement txtPassword;

	@FindBy(id = "signInSubmit")
	WebElement btnLogin;

	// Step 2
	public LoginPage(WebDriver driver) {
	    this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void loginAmazon() {
		txtUsername.sendKeys("8125800347");
		txtPassword.sendKeys("amazon84");
		btnLogin.click();
	}

	public void continue_button_() {
		btnContinue.click();
	}

	/*
	 * public void password_() { txtPassword.sendKeys("amazon84"); }
	 * 
	 * public void clickOnLoginButton() { btnLogin.click(); }
	 */

}
