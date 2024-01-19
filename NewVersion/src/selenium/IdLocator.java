package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args)throws Exception {

		
		//To Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Navigate the the webpage
		driver.get("https://demoapps.qspiders.com");
		
		//Enter the Name
		WebElement nametextfield=driver.findElement(By.id("name"));
		nametextfield.sendKeys("Naveen");
		
		Thread.sleep(3000);
		//To Enter the Email
		driver.findElement(By.id("email")).sendKeys("Naveendcraz31@gmail.com");
		
		Thread.sleep(2000);
		//To Enter the password
		driver.findElement(By.id("password")).sendKeys("Buttu@143");
		
		Thread.sleep(2000);
		//To Close the Application
		driver.quit();

	}

}
