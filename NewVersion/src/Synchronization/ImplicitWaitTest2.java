package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitWaitTest2 {

	public static void main(String[] args) {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to webpage
		driver.get("https://demoapps.qspiders.com");
		
		//Implicit waits
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//To Click on UI Testing Concepts
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		
		//To Click on Synchronization
		driver.findElement(By.xpath("//section[.='Synchronization']")).click();
		
		//To click on Progress bar
		driver.findElement(By.xpath("//section[.='Progress Bar']")).click();
		
		//To click on with element Link
		driver.findElement(By.linkText("With Element")).click();
		
		//To click on Send timer
		driver.findElement(By.cssSelector("[placeholder='Enter time in seconds']")).sendKeys("8");
		
		//TO Click on start Button
		driver.findElement(By.xpath("//button[.='Start']")).click();
		
		//To Click on Dropdown
		WebElement dropdown = driver.findElement(By.xpath("//p[.='Do you like Automation']/ancestor::section//select"));
		
		//To create the Select Class
		Select select=new Select(dropdown);
		select.selectByVisibleText("Yes");
		
		
		//To Close the Browser
		driver.quit();
	}
}
