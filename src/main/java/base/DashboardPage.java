package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	WebDriver driver;
	
	By creatProjectBtn = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ui-reset[1]/button[1]/span[1]/span[1]");
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickCreatProject() {
		driver.findElement(creatProjectBtn).click();
	}

}
