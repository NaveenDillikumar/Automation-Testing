package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyCssvalue {
	public static void main(String[] args) {
		
		//To launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//To Maximize the Browser
		driver.manage().window().maximize();
		
		//To navigate to Webpage
		driver.get("https://www.Swiggy.com");
		
		//To Get the color of the logo of SWIGGY
		WebElement Swiggy= driver.findElement(By.className("sc-aXZVg"));
		
		//To Get the color of the Element
		
	}

}
