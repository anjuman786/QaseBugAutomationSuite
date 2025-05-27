package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	By email = By.xpath("//input[@placeholder='Work email']");
	By password = By.xpath("//input[@placeholder='Password']");
	By loginBtn = By.xpath("//span[normalize-space()='Sign in']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void login(String user, String pass) {
		driver.findElement(email).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginBtn).click();
	}

}
