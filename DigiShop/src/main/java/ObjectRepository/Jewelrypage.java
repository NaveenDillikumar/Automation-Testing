package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jewelrypage {
	
	public Jewelrypage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//To Click on Heart jewelry
	@FindBy(xpath = "//a[.='Black & White Diamond Heart']")
	private WebElement Heartjewelry;
	
	//To Click on Add To Cart Button
	@FindBy(id = "add-to-cart-button-14")
	private WebElement Addtocartbutton;
	
	//To click on Shoping cart Link
	@FindBy(className = "ico-cart")
	private WebElement Shopingcartlink;
	
	

	public WebElement getShopingcartlink() {
		return Shopingcartlink;
	}

	public WebElement getHeartjewelry() {
		return Heartjewelry;
	}

	public WebElement getAddtocartbutton() {
		return Addtocartbutton;
	}
	
	
}
