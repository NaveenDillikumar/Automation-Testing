package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLinkTest {

	public static void main(String[] args)throws Exception {

		//To launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//To Maximize the Browser
		driver.manage().window().maximize();
		
		//To Navigate to Webpage
		driver.get("https://Amazon.com");
		
		Thread.sleep(3000);
		//To Click on Amazon All
		driver.findElement(By.partialLinkText("All")).click();
		
		Thread.sleep(3000);
		//To click on x Button
		driver.findElement(By.className("hmenu-close-icon")).click();
		
		Thread.sleep(3000);
		//To Click on Dialogue Button
		driver.findElement(By.className("a-button-input")).click();
		
		Thread.sleep(3000);
		//To Click on registry button
		driver.findElement(By.partialLinkText("Registry")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		//To Click on Today Deals
		driver.findElement(By.partialLinkText("Today's Deals")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		//To click on Customer deals
		driver.findElement(By.partialLinkText("Customer Service")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		//To Click on Gift Cards
		driver.findElement(By.partialLinkText("Gift Cards")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		
		Thread.sleep(3000);
		//To click on Sell
		driver.findElement(By.partialLinkText("Sell")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		//To Quit the Browser
		driver.quit();

	}

}
