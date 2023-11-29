package Test;
import org.testng.annotations.Test;

import Source.LoginPage;
import Source.Lunch_quit;

public class Test_case_01 extends Lunch_quit {

	LoginPage loginPage = new LoginPage(driver);

	@Test(priority = 0)
	public void ToVerifyLoginFunctionality() {
		loginPage.loginAmazon();
	}

}