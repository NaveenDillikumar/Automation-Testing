
package Testscripts;



import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericLibraries.BaseClass;
import ObjectRepository.Bookspage;
import ObjectRepository.Homepage;


public class BooksTest extends BaseClass{

	@Test
	public void books_001() {
		
		//To Click on books link
		driver.findElement(By.linkText("BOOKS")).click();
		
		//To Verify the Books Page
		String exceptedres = driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
		
		//To verify the Page
		Assert.assertEquals(exceptedres, "Books","Books Page is Not Displayed");
		
		Reporter.log("Test is Completed",true);
	}
	
	@Test
	public void books_002() {
		
		//To Click on Books Link
		driver.findElement(By.linkText("BOOKS")).click();
		
		//To Verify the Sort Dropdown is Displayed
		boolean SortDropdown = driver.findElement(By.id("products-orderby")).isDisplayed();
		
		//To Verify the Dropdown
		Assert.assertEquals(SortDropdown, true,"Dropdown is Not Displayed");
		
		Reporter.log("Test is Completed",true);
	}
	
	@Test
	public void books_003() throws InterruptedException {
		
		Homepage homepage=new Homepage(driver);
		Bookspage bookpage=new Bookspage(driver);
		
		//To click on books link
		homepage.getBooklink().click();
		
		//To Select the sort by drop down
		SelectOptionByIndex(bookpage.getSortbydropdown(), 3);
		
		//To Select the display dropdown
		SelectOptionByVisibleText(bookpage.getDisplaydropdown(), "12");
		
		//To select the view as Dropdown
		SelectOptionByVisibleText(bookpage.getViewasdropdown(), "List");
		
		Thread.sleep(3000);
				
	}
}
