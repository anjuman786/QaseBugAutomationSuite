package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	@BeforeSuite
	public void setupReport() {
		ExtentSparkReporter repoter = new ExtentSparkReporter("Reports/QaseReport.html");
		extent = new ExtentReports();
		extent.attachReporter(repoter);
		
	}
	
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.qase.io/login");
	}

	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	@AfterSuite
	public void flushReports() {
		extent.flush();
	}
}

