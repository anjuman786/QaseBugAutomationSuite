package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectPage {
	WebDriver driver;
	
	By title = By.xpath("BugAutomation");
	By code = By.xpath("BugAutomation");
	By description = By.xpath("BugAutomation");
	By creatBtn = By.xpath("BugAutomation");
	
	public ProjectPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void createProject(String name, String codeVel, String desc) {
		driver.findElement(title).sendKeys(name);
		driver.findElement(code).clear();
		driver.findElement(code).sendKeys(codeVel);
		driver.findElement(description).sendKeys(desc);
		driver.findElement(creatBtn).click();
	}

}
