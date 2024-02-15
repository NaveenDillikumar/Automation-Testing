package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilpkartTraverse {
	
	public static void main(String[] args) throws InterruptedException {
		
		//To Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//To Maximize the Browser
		driver.manage().window().maximize();
		
		//Navigate to Webpage
		driver.get("https://Flipkart.com");
		Thread.sleep(3000);
		
		//To Search for Shoes
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Puma Shoes");
		Thread.sleep(3000);
		
		//To Click on Search Button
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		Thread.sleep(3000);
		
		//To Click on Product
		driver.findElement(By.xpath("//div[.='₹2,115']/../../..//div//div[1]")).click();
		Thread.sleep(3000);
		
		//To Close the browser
		driver.quit();
	}

}
