package tests;

import org.testng.annotations.Test;

import base.BaseClass;
import base.LoginPage;
import base.LogoutPage;

public class LogoutTest extends BaseClass{
	
	@Test
	public void logoutTest() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("sheikhanjuman281@gmail.com", "Anjumansheikh@786");
		
		LogoutPage logoutPage = new LogoutPage(driver);
		Thread.sleep(3000);
		
		logoutPage.logoutFromApp();
	}

}
