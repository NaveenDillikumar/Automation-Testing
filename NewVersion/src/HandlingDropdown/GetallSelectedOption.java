package HandlingDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetallSelectedOption {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the brower
		driver.manage().window().maximize();
		
		//Naviagate to webpage
		driver.get("https://demoapps.qspiders.com");
		Thread.sleep(3000);
		
		//To click on UI testing concepts
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		
		//To click dropdown link
		driver.findElement(By.xpath("//section[.='Dropdown']")).click();
		Thread.sleep(3000);
		
		//To find Country Element
		WebElement countrydropdown=driver.findElement(By.id("select3"));
		Thread.sleep(2000);
		
		//To Print All the Select country
		Select dropdown=new Select(countrydropdown);
		List<WebElement> newcountry=dropdown.getOptions();
		for (WebElement c : newcountry) {
			System.out.println(c.getText());
		}
		
		//To Create Object class
		Select countries=new Select(countrydropdown);
		countries.selectByIndex(7);
		countries.selectByIndex(8);
		countries.selectByIndex(2);
		
		List<WebElement> selectedcountries=countries.getAllSelectedOptions();
		System.out.println("\n********All Selected Countries*******\n");
		for (WebElement allsectedcountry : selectedcountries) {
			System.out.println(allsectedcountry.getText());
		}
		//To Close the Browser
		driver.quit();
	}
}
