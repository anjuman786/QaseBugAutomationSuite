package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPage {
	WebDriver driver;
	
	public LogoutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By userProfileIcon = By.xpath("//img[@class='PqSF57 xeI6N0']");
	By logoutButton = By.xpath("//div[normalize-space()='Sign out']");
	
	public void clickProfileIcon() {
		driver.findElement(userProfileIcon).click();
		
	}
	
	public void clickLogout() {
		driver.findElement(logoutButton).click();
		driver.findElement(userProfileIcon).click();
	}

	public void logoutFromApp() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(userProfileIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(logoutButton)).click();
		clickProfileIcon();
		clickLogout();
	}
}
