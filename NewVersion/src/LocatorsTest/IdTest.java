package LocatorsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdTest {

	public static void main(String[] args)throws Exception {
		
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Navigate to Webpage
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(2000);
		
		//TO find Male Radio Button
		WebElement maleRadioButton=driver.findElement(By.id("gender-male"));
		
		//To Click the Male Radio Button
		maleRadioButton.click();
		Thread.sleep(3000);
		
		//To Click the FirstName 
		driver.findElement(By.id("FirstName")).sendKeys("Naveen");
		Thread.sleep(3000);
		
		//To Click the LastName
		driver.findElement(By.id("LastName")).sendKeys("Square");
		Thread.sleep(3000);
		
		//To Click on the Email
		driver.findElement(By.id("Email")).sendKeys("naveendcraz31@gmail.com");
		Thread.sleep(3000);
		
		//To Click on the Password
		driver.findElement(By.id("Password")).sendKeys("naveen010601");
		Thread.sleep(3000);
		
		//To click on the Confirm Password
		driver.findElement(By.id("ConfirmPassword")).sendKeys("naveen010601");
		Thread.sleep(3000);
		
		//To click on Register button
		driver.findElement(By.id("register-button")).click();
		
		//To Search books on Search Field
		driver.findElement(By.className("search-box-text")).sendKeys("Mobiles");
		Thread.sleep(3000);
		
		//To Click on Search Button
		driver.findElement(By.className("search-box-button")).click();
		Thread.sleep(5000);
		
		//To Close the Browser
		driver.quit();

	}

}
