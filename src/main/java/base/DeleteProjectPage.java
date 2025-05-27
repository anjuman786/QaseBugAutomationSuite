package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteProjectPage {
	WebDriver driver;
	
	public DeleteProjectPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	By projectMenu = By.xpath("//a[normalize-space()='Projects']");
	By projectName = By.xpath("//a[normalize-space()='BugAutomation']");
	By deleteButton = By.xpath("//div[@data-testid='remove']");
	
	public void navigateToProject() {
		driver.findElement(projectMenu).click();
		driver.findElement(projectName).click();
	}
	
	public void deleteProject() {
		driver.findElement(deleteButton).click();
		
	}

}
