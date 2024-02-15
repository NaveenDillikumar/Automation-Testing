package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyXpath {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Navigae to Webpage
		driver.get("https://Swiggy.com");
		Thread.sleep(3000);
		
		//To Click on Locate Me
		driver.findElement(By.xpath("//button[@class='_1fiQt']")).click();
		Thread.sleep(3000);
		
		//To Click on Search button
		driver.findElement(By.xpath("//span[.='Search']")).click();
		Thread.sleep(3000);
		
		//To Search food in Search field
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Briyani");
		Thread.sleep(3000);
		
		//To Click on Briyani
		driver.findElement(By.xpath("//div[@class='RNzoC']")).click();
		Thread.sleep(3000);
		
		//To Click on add to Cart
		driver.findElement(By.xpath("//div[@class='_1RPOp']")).click();
		Thread.sleep(3000);
	}
}
