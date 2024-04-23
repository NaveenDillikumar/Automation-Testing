package Testscripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibraries.BaseClass;

public class ComputersTest extends BaseClass {

	@Test
	public void computer_001() {
		
	
		//To Click on Computers Link
		driver.findElement(By.partialLinkText("Computers")).click();
		
		//To Verify the Computers page
		String actualres = driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
		
		//To  verify the page is Displayed
		Assert.assertEquals(actualres, "Computers","computers page is not Displyed");
		
		Reporter.log("Test is Completed",true);
		
	}
	
	@Test
	public void Computer_002() {
		
		//To Click on Computers link
		driver.findElement(By.partialLinkText("Computers")).click();
		
		//To Verify the Desktop is Displayed
		String Desktopres = driver.findElement(By.xpath("(//h2[@class='title']/a)[1]")).getText();
		
		//To verify the desktop is displayed
		Assert.assertEquals(Desktopres, "Desktops","Desktops page is not Displayed");
		
		Reporter.log("Test is Completed",true);
}
}
