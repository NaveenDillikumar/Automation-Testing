package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Electronicspage {
	
	
	
	//To get the page title
	@FindBy(xpath = "//div[@class='page-title']/h1")
	private WebElement Electronicstitle;
	
	//To find the Cellphone Link
	@FindBy(xpath = "//img[@alt='Picture for category Cell phones']")
	private WebElement Cellphonelink;
	
	public Electronicspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getElectronicstitle() {
		return Electronicstitle;
	}

	public WebElement getCellphonelink() {
		return Cellphonelink;
	}
	
	

}
