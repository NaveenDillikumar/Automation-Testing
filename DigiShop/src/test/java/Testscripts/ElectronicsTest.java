package Testscripts;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import GenericLibraries.BaseClass;
import ObjectRepository.Cellphonepage;
import ObjectRepository.Electronicspage;
import ObjectRepository.Homepage;

public class ElectronicsTest extends BaseClass {
	
	@Test
	public void Electronics_cellphone_001() throws InterruptedException {
		Homepage homepage=new Homepage(driver);
		Electronicspage ep=new Electronicspage(driver);
		Cellphonepage cellphonepage=new Cellphonepage(driver);
		
		//To Click on electronics link
		homepage.getElectronicslink().click();
		
		//To Verify the Electronic Page is displayed
		Assert.assertEquals(ep.getElectronicstitle().getText(), "Electronics","Electronic page is not displayed");
		
		//To Click on Cellphone link
		ep.getCellphonelink().click();
		
		//To Verify the Cellpage is Displayed 
		Assert.assertEquals(cellphonepage.getCellphonetitle().getText(), "Cell phones","Cellphone Page is Not Displayed");
		
		//To Handle the Dropdown
		Select select=new Select(cellphonepage.getSortdropdown());
		
		//To Select the Value Name to A to Z
		select.selectByIndex(1);;
		Thread.sleep(2000);
		
		//To select the Value Name to Z To A
		select.selectByIndex(2);
	}

}
