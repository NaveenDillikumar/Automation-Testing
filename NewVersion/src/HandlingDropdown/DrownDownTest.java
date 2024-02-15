package HandlingDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DrownDownTest {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver naveen=new ChromeDriver();
		
		//Maximize the Webpage
		naveen.manage().window().maximize();
		
		//Navigate to Webpage
		naveen.get("https://demoapps.qspiders.com");
		Thread.sleep(3000);
		
		//TO click on UI testing Concepts
		naveen.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		
		//To Click on Dropdown Link
		naveen.findElement(By.xpath("//section[.='Dropdown']")).click();
		Thread.sleep(3000);
		
		//To find phone number
		WebElement phonenumber= naveen.findElement(By.id("select1"));
		
		//To Click on Phonenumber Dropdown
		Select phonedropdown=new Select(phonenumber);
		System.out.println("is the Phone number dropdown is multiple :"+phonedropdown.isMultiple());
		phonedropdown.selectByValue("+91");
		Thread.sleep(500);
		
		//To Fill Number
		naveen.findElement(By.xpath("//input[@id='phone']")).sendKeys("7358759146");
		
		//To Click on Gender dropdown
		WebElement genderdropdown=naveen.findElement(By.id("select2"));
		Select gender=new Select(genderdropdown);
		System.out.println("Is the Gender down is multiple :"+gender.isMultiple());
		gender.selectByVisibleText("Male");
		Thread.sleep(500);
		
		//To Click on Country Dropdown
		WebElement countryDropdown=naveen.findElement(By.id("select3"));
		Select country=new Select(countryDropdown);
		System.out.println("Is Contry Drop down is Multiple :"+country.isMultiple());
		country.selectByIndex(7);
		Thread.sleep(3000);
		
		//To click on state DropDown
		WebElement statedropdown=naveen.findElement(By.id("select5"));
		Select state=new Select(statedropdown);
		System.out.println("Is the State drop down is Multiple :"+state.isMultiple());
		state.selectByVisibleText("Tamil Nadu");
		Thread.sleep(3000);
		
		//To click on City dropDown
		WebElement citydropdown=naveen.findElement(By.xpath("//label[.='City']/..//select"));
		Select city=new Select(citydropdown);
		System.out.println("Is the City dropdown is multiple :"+city.isMultiple());
		city.selectByVisibleText("Chennai");
		Thread.sleep(3000);
		
		//To click on Quantity Dropdown
		WebElement quantitydropdown=naveen.findElement(By.id("select7"));
		Select quantity=new Select(quantitydropdown);
		System.out.println("Is the Quantity Dropdown is Multiple :"+quantity.isMultiple());
		quantity.selectByVisibleText("4");
		Thread.sleep(3000);
		
		//To Click on Continue Button
		naveen.findElement(By.xpath("//button[.='Continue']")).click();
		Thread.sleep(3000);
	
		//To Quit the Browser
		naveen.quit();
		
	}
}
