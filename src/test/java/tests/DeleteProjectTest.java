package tests;

import org.testng.annotations.Test;

import base.BaseClass;
import base.DeleteProjectPage;

public class DeleteProjectTest extends BaseClass{
	
	@Test
	public void deleteProjectTest()throws InterruptedException{
		DeleteProjectPage deleteProjectPage = new DeleteProjectPage(driver);
		deleteProjectPage.navigateToProject();
		deleteProjectPage.deleteProject();
	}
	
	

}
