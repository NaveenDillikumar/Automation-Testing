package LocatorsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Navigate to Url
		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(3000);
		
		//TO Click on Shopping Cart
		driver.findElement(By.linkText("Shopping cart")).click();
		Thread.sleep(3000);
		
		//To Click on Register button
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(3000);
		
		//To Click on Books Link
		driver.findElement(By.linkText("BOOKS")).click();
		Thread.sleep(3000);
		
		//To Close the browser
		driver.quit();
	
		
	}
}
