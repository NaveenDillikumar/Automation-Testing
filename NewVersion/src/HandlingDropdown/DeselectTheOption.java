package HandlingDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectTheOption {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		///Navigate to Webpage
		driver.get("https://demoapps.qspiders.com");
		Thread.sleep(3000);
		
		//To Click on UI Testing Concept
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		
		//To Click on Dropdown link
		driver.findElement(By.xpath("//section[.='Dropdown']")).click();
		Thread.sleep(3000);
		
		//To select Multiple Dropdown
		driver.findElement(By.partialLinkText("Multi Select")).click();
		Thread.sleep(2000);
		
		//To find Country Dropdown
		WebElement countrydropdown = driver.findElement(By.id("select-multiple-native"));
		Select country=new Select(countrydropdown);
		//To select the Country
		country.selectByIndex(4);
		Thread.sleep(2000);
		
		//to Select the Country
		country.selectByValue("India");
		Thread.sleep(2000);
		
		//To select the country
		country.selectByVisibleText("Canada");
		Thread.sleep(3000);
		
		System.out.println("\n********All Selected Country******\n");
		
		//To Print All the Selected Countries
		List<WebElement> allselectedcountries = country.getAllSelectedOptions();
		
		for (WebElement selectedcountry : allselectedcountries) {
			
			System.out.println(selectedcountry.getText());
			
		}
		
		//To Print First Selected Country
		System.out.println("\n******First Selected Country*******\n");
		System.out.println(country.getFirstSelectedOption().getText());
		
		//To Deselect the Option
		country.deselectByIndex(4);
		Thread.sleep(2000);
		
		//To Close the browser
		driver.quit();
		}
}
