package Testngtest;

import org.testng.annotations.Test;

import GenericLibraries.BaseClass;
import ObjectRepository.Homepage;

public class DataTest extends BaseClass {

	@Test
	public void test_001() {
		Homepage homepage=new Homepage(driver);
		
		homepage.getLogoutlink().click();
		homepage.getLoginLink().click();
		
	}
}
