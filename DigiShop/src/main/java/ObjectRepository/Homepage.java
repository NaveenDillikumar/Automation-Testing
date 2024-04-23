package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	public Homepage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = "img[alt='Tricentis Demo Web Shop']")
	private WebElement logo;
	
	@FindBy(linkText = "Register")
	private WebElement RegisterLink;
	
	@FindBy(partialLinkText = "Log in")
	private WebElement LoginLink;
	
	@FindBy(id = "small-searchterms")
	private WebElement SearchField;
	
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement SearchButton;
	
	//To Find the Electronics link
	@FindBy(linkText = "Electronics")
	private WebElement Electronicslink;
	
	//To Find The Jewelery Link
	@FindBy(partialLinkText = "Jewelry")
	private WebElement Jewelrylink;
	
	//To Find the Book link
	@FindBy(partialLinkText = "BOOKS")
	private WebElement Booklink;
	
	//To Find Logout link
	@FindBy(partialLinkText = "Log out")
	private WebElement logoutlink;
	
	
	public WebElement getLogoutlink() {
		return logoutlink;
	}


	public WebElement getBooklink() {
		return Booklink;
	}


	public WebElement getJewelrylink() {
		return Jewelrylink;
	}


	public WebElement getElectronicslink() {
		return Electronicslink;
	}


	public WebElement getlogo() {
		return logo;
	}
	

	public WebElement getRegisterLink() {
		return RegisterLink;
	}

	public WebElement getLoginLink() {
		return LoginLink;
	}

	public WebElement getSearchField() {
		return SearchField;
	}

	public WebElement getSearchButton() {
		return SearchButton;
	}

}
