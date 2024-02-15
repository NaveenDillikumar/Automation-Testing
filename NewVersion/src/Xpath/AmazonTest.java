package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Naviagate to Webpage
		driver.get("https://Amazon.in");
		Thread.sleep(3000);
		
		//To Search Product Iphone
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("I phone 15 128gb");
		Thread.sleep(3000);
		
		//To Click on search button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		
		//To Get the Actual Price of I phone
		String Actualprice=driver.findElement(By.xpath("((//span[.='71,990'])[1]/../../../../../../../../../..//span)[17]")).getText();
		Thread.sleep(3000);
		
		//To Get the old Price of I phone
		String oldprice=driver.findElement(By.xpath("((//span[.='Apple iPhone 15 (128 GB) - Black'])[1]/../../../..//span/following-sibling::span)[6]")).getText();
		Thread.sleep(3000);
		
		//To Print the Both Price
		System.out.println("Actual price of I Phone ="+Actualprice);
		System.out.println("Old Price of I phone ="+oldprice);
		
		//To Close the Browser
		driver.quit();
		
	}
}
