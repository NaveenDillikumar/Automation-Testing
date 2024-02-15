package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoShopXpath {
	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver =new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to Url
		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(3000);
		
		//To Click on Registerlink
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(3000);
		
		//To click male button
		driver.findElement(By.xpath("//input[@name='Gender']")).click();
		Thread.sleep(3000);
		
		//To Click on FirstName 
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Naveen");
		Thread.sleep(3000);
		
		//To click on Lastname
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Dillikumar");
		Thread.sleep(3000);
		
		//To click on Email
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("naveendcraz31@gmail.com");
		Thread.sleep(3000);
		
		//To Click on Password
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("naveen010601");
		Thread.sleep(3000);
		
		//To click on Confirm password
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("naveen010601");
		Thread.sleep(3000);
		
		//To Click on Register Button
		driver.findElement(By.xpath("//input[@name='register-button']")).click();
		Thread.sleep(3000);
		
		//To Close the Browser
		driver.quit();
}

}
