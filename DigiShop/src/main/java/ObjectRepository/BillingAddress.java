package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingAddress {

	public BillingAddress(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//To find the Billing address dropdown
	@FindBy(id = "billing-address-select")
	private WebElement billingaddressdropdown;
	
	//To Find Continue button
	@FindBy(xpath = "//div[@id='billing-buttons-container']/input")
	private WebElement continuebutton0;
	
	//To find the Billing address countrydropdown
	@FindBy(id = "BillingNewAddress_CountryId")
	private WebElement billingcountry;
	
	//To find the city
	@FindBy(id = "BillingNewAddress_City")
	private WebElement city;
	
	//To find address 1
	@FindBy(id = "BillingNewAddress_Address1")
	private WebElement address1;
	
	//To Find address2
	@FindBy(id = "BillingNewAddress_Address2")
	private WebElement address2;
	
	//To find zipcode
	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	private WebElement zipcode1;
	
	//To find Mobile number
	@FindBy(id = "BillingNewAddress_PhoneNumber")
	private WebElement mobilenumber;
	
	//To click on Continue button
	@FindBy(xpath = "//div[@id='billing-buttons-container']/input")
	private WebElement continuebutton;
	
	//To Click on Continue
	@FindBy(xpath = "//div[@id='shipping-buttons-container']/input")
	private WebElement continuebutton1;
	
	//To Click on Radiobutton
	@FindBy(id = "shippingoption_1")
	private WebElement shipingoption;
	
	//To Click on Continue
	@FindBy(xpath = "//div[@id='shipping-method-buttons-container']/input")
	private WebElement continuebutton2;
	
	//To Click on Payment method
	@FindBy(id = "paymentmethod_2")
	private WebElement paymentmethod;
	
	//To click on Continue
	@FindBy(xpath = "//div[@id='payment-method-buttons-container']/input")
	private WebElement continuebutton3;
	
	//To Select the Credit card
	@FindBy(id = "CreditCardType")
	private WebElement creditcarddropdown;
	
	//To Enter the card holder name
	@FindBy(id = "CardholderName")
	private WebElement cardholdername;
	
	//To find cardnumber
	@FindBy(id = "CardNumber")
	private WebElement cardnumber;
	
	//To find exp month
	@FindBy(id = "ExpireMonth")
	private WebElement expmonth;
	
	//To Find expyear
	@FindBy(id = "ExpireYear")
	private WebElement expyear;
	
	//To enter the Card code
	@FindBy(id = "CardCode")
	private WebElement cardcode;
	
	//To click on continue
	@FindBy(xpath = "//div[@id='payment-info-buttons-container']/input")
	private WebElement continuebutton4;
	
	//To click on confirm button
	@FindBy(xpath = "//div[@id='confirm-order-buttons-container']/input")
	private WebElement confirmbutton;
	
	//To verify the order details link
	@FindBy(xpath = "//a[.='Click here for order details.']")
	private WebElement orderdetailslink;
	
	//To download pdf
	@FindBy(xpath =  "//div[@class='page-title']//a[.='PDF Invoice']")
	private WebElement pdfbutton;
	
	

	public WebElement getBillingaddressdropdown() {
		return billingaddressdropdown;
	}

	public WebElement getContinuebutton0() {
		return continuebutton0;
	}

	public WebElement getBillingcountry() {
		return billingcountry;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public WebElement getZipcode1() {
		return zipcode1;
	}

	public WebElement getMobilenumber() {
		return mobilenumber;
	}

	public WebElement getContinuebutton() {
		return continuebutton;
	}

	public WebElement getContinuebutton1() {
		return continuebutton1;
	}

	public WebElement getShipingoption() {
		return shipingoption;
	}

	public WebElement getContinuebutton2() {
		return continuebutton2;
	}

	public WebElement getPaymentmethod() {
		return paymentmethod;
	}

	public WebElement getContinuebutton3() {
		return continuebutton3;
	}

	public WebElement getCreditcarddropdown() {
		return creditcarddropdown;
	}

	public WebElement getCardholdername() {
		return cardholdername;
	}

	public WebElement getCardnumber() {
		return cardnumber;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCardcode() {
		return cardcode;
	}

	public WebElement getContinuebutton4() {
		return continuebutton4;
	}

	public WebElement getConfirmbutton() {
		return confirmbutton;
	}

	public WebElement getOrderdetailslink() {
		return orderdetailslink;
	}

	public WebElement getPdfbutton() {
		return pdfbutton;
	}
	
	
	
}
