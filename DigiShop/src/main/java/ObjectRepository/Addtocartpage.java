package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocartpage {
	
	public Addtocartpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//To Select the Country Dropdown
	@FindBy(id = "CountryId")
	private WebElement Countrydropdown;
	
	//To Enter the Zipcode
	@FindBy(id = "ZipPostalCode")
	private WebElement Zipcode;
	
	//To Click on Check box
	@FindBy(id = "termsofservice")
	private WebElement Checkbox;
	
	//To Click on Check out Button
	@FindBy(id = "checkout")
	private WebElement Checkoutbutton;

	public WebElement getCountrydropdown() {
		return Countrydropdown;
	}

	public WebElement getZipcode() {
		return Zipcode;
	}

	public WebElement getCheckbox() {
		return Checkbox;
	}

	public WebElement getCheckoutbutton() {
		return Checkoutbutton;
	}	

}
