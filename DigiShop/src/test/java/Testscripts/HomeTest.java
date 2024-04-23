package Testscripts;

import org.testng.annotations.Test;

import GenericLibraries.BaseClass;
import ObjectRepository.Homepage;

public class HomeTest extends BaseClass {
	
	@Test
	public void hometest_001() {
		
		Homepage homepage=new Homepage(driver);
		
		//To Search the Laptop
		homepage.getSearchField().sendKeys("laptop");
		
		//To Click on Search Button
		homepage.getSearchButton().click();
	}

}
