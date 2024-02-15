package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpensourceBillingTest {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the Browser
		driver.manage().window().maximize();
		
		//Naviagte to webpage
		driver.get("https://demo.opensourcebilling.org");
		Thread.sleep(3000);
		
		//find the element of Email
		WebElement email = driver.findElement(By.id("email"));
		email.clear();
		Thread.sleep(3000);
		
		//Enter the Email
		email.sendKeys("naveen@123gmail.com");
		Thread.sleep(3000);
		
		//find the Password Element
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		Thread.sleep(3000);
		
		//enter the password
		password.sendKeys("123456789");
		Thread.sleep(2000);
		
		//To Click on Submit Button
		driver.findElement(By.id("user_login_btn")).submit();
		Thread.sleep(2000);
		
		//To Close the Browser
		driver.quit();
	}
}

