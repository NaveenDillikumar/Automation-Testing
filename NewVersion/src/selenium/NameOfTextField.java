package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameOfTextField {
	public static void main(String[] args) {
		
		//To Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//To Maximize the Browser
		driver.manage().window().maximize();
		
		//To Navigate the Webpage
		driver.get("https://demowebshop.tricentis.com/");
		
		//To Find Name Textfield
		WebElement textfield= driver.findElement(By.id("small-searchterms"));
		
		//To get the placeholder Attribute Value
		System.out.println(textfield.getAttribute("type"));
		
		//To get the class Attribute value
		System.out.println(textfield.getAttribute("class"));
		
		//To get autocomplete Attribute value
		System.out.println(textfield.getAttribute("autocomplete"));
		
		//To get value Attribute Value
		System.out.println(textfield.getAttribute("value"));
		
		//To Get name Attribute Value
		System.out.println(textfield.getAttribute("name"));
		
		//To Get the Tag Name of the Element
		System.out.println(textfield.getTagName());
		
		//To Close the webpage
		driver.quit();
	}

}
