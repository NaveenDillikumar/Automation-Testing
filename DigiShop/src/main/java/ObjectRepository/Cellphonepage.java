package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cellphonepage {

	public Cellphonepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//To find the cellphone title
	@FindBy(xpath = "//div[@class='page-title']/h1")
	private WebElement Cellphonetitle;
	
	//To Sort out Drop down
	@FindBy(id = "products-orderby")
	private WebElement sortdropdown;

	public WebElement getCellphonetitle() {
		return Cellphonetitle;
	}

	public WebElement getSortdropdown() {
		return sortdropdown;
	}
	
	
}
