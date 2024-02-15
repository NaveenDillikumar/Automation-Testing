package HandlingDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OptionMethos {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to webpage
		driver.get("https://demoapps.qspiders.com");
		Thread.sleep(3000);
		
		//To click on UI testing concepts
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(5000);
		
		//To Click on Drop down link
		driver.findElement(By.xpath("//section[.='Dropdown']")).click();
		Thread.sleep(5000);
		
		//To Select the Country Dropdown
		 WebElement countydropdown=driver.findElement(By.id("select3"));
		 Thread.sleep(5000);
		 
		//To Create the Object By using Select Class
		Select country= new Select(countydropdown);
		
		 List<WebElement> allcountries=country.getOptions();
		 for (WebElement dropdown : allcountries) {
			 System.out.println(dropdown.getText());
			
		}
		 
		 //To Validate the Country
		 if(allcountries.size()-1==8) {
			 System.out.println("Test case is pass");
		 }
		 else {
			 System.out.println("Test case is fail");
		 }
		 //to close the browser
		 driver.quit();
	}
	

}
