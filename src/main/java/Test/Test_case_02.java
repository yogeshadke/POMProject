package Test;

import org.testng.annotations.Test;

import Source.Home_page;
import Source.Lunch_quit;

public class Test_case_02 extends Lunch_quit {
	
	@Test (priority = 1)
	public void HomePage() {
		
		Home_page homePage = new Home_page(driver);
		homePage.search_tf_();
		
	}

}
