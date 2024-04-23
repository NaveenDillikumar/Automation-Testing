package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookspage {

	public Bookspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//To find the sort by drop down
	@FindBy(id = "products-orderby")
	private WebElement Sortbydropdown;
	
	//To find the display dropdown
	@FindBy(id = "products-pagesize")
	private WebElement Displaydropdown;
	
	//To find the view as dropdown
	@FindBy(id = "products-viewmode")
	private WebElement Viewasdropdown;

	public WebElement getSortbydropdown() {
		return Sortbydropdown;
	}

	public WebElement getDisplaydropdown() {
		return Displaydropdown;
	}

	public WebElement getViewasdropdown() {
		return Viewasdropdown;
	}
	
	
}

