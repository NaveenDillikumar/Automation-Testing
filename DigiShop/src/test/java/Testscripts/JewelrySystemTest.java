package Testscripts;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import GenericLibraries.BaseClass;
import ObjectRepository.Addtocartpage;
import ObjectRepository.BillingAddress;
import ObjectRepository.Homepage;
import ObjectRepository.Jewelrypage;

public class JewelrySystemTest extends BaseClass {
	
	@Test
	public void jewelry_system_001() {
		Homepage homepage=new Homepage(driver);
		Jewelrypage jewelrypage=new Jewelrypage(driver);
		Addtocartpage addtocart=new Addtocartpage(driver);
		BillingAddress billing=new BillingAddress(driver);
		
		//To click on Jewelry link
		homepage.getJewelrylink().click();
		
		//To Take screenshot of webpage
		getWebpageScreenshot(driver);
		
		//To Click on heart jewelry
		jewelrypage.getHeartjewelry().click();
		
		//To click on add to cart button
		jewelrypage.getAddtocartbutton().click();
		
		//To click on shoping cart link
		jewelrypage.getShopingcartlink().click();
		
		//To Get the shoping cart Screenshot
		getWebpageScreenshot(driver);
		
		//To click on check box
		addtocart.getCheckbox().click();
		
		//To Handle dropdown
		try {
			Select select=new Select(addtocart.getCountrydropdown());
			select.isMultiple();
			select.selectByVisibleText("India");
			
		} catch (NoSuchElementException e) {
			
			e.printStackTrace();
			
		}
		
		//To enter the zipcode
		try {
			addtocart.getZipcode().sendKeys("600103");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		//To click on check out button
		addtocart.getCheckoutbutton().click();
		
		//To Click on Billing Address
		Select select0=new Select(billing.getBillingaddressdropdown());
		select0.isMultiple();
		select0.selectByVisibleText("New Address");
		
		//To Click on Continue Button
		billing.getContinuebutton0().click();
		
		//To select the billing address dropdown
		Select select1=new Select(billing.getBillingcountry());
		select1.isMultiple();
		select1.selectByVisibleText("India");
		
		//To Enter the city
		billing.getCity().sendKeys("Chennai");
		
		//To enter the address1
		billing.getAddress1().sendKeys("No:52/21LIG-II");
		
		//To Enter the address2
		billing.getAddress2().sendKeys("Manali New Town");
		
		//To Enter the Zip code
		billing.getZipcode1().sendKeys("600103");
		
		//To Enter the Phone number
		billing.getMobilenumber().sendKeys("7358759146");
		
		//To Click the Continue button
		billing.getContinuebutton().click();
		
		//To click on Continue Button
		billing.getContinuebutton1().click();
		
		//To Click on next day air
		billing.getShipingoption().click();
		
		//To click on continue button
		billing.getContinuebutton2().click();
		
		//To select the Payment method
		billing.getPaymentmethod().click();
		
		//To Click on continue button
		billing.getContinuebutton3().click();
		
		//To select the Card type
		Select select2=new Select(billing.getCreditcarddropdown());
		select2.isMultiple();
		select2.selectByVisibleText("Master card");
		
		//To enter the card holder name
		billing.getCardholdername().sendKeys("Dillikumar S");
		
		//To enter the card number
		billing.getCardnumber().sendKeys("5334670011723265");
		
		//To select the card month
		Select cardmonth=new Select(billing.getExpmonth());
		cardmonth.isMultiple();
		cardmonth.selectByVisibleText("10");
		
		//To Select the Card year
		Select cardyear=new Select(billing.getExpyear());
		cardyear.isMultiple();
		cardyear.selectByVisibleText("2025");
		
		//To Enter the card code
		billing.getCardcode().sendKeys("350");
		
		//To Click on continue
		billing.getContinuebutton4().click();
		
		//To click on confirm button
		billing.getConfirmbutton().click();
		
		//To click on order details
		billing.getOrderdetailslink().click();
		
		//To click on pdf button
		billing.getPdfbutton().click();
			
	}

}
