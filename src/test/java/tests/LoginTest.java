package tests;

import org.testng.annotations.Test;

import base.BaseClass;
import base.LoginPage;

public class LoginTest extends BaseClass{
	
	@Test
	public void testLogin() {
		test = extent.createTest("Login Test");
		LoginPage login = new LoginPage(driver);
		login.login("sheikhanjuman281@gmail.com", "Anjumansheikh@786");
	}

}
