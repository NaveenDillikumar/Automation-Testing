package LocatorsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {
	
	public static void main(String[] args) throws InterruptedException {
		
		//To Launch the Browser
		WebDriver driver =new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Navigate to Url
		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(3000);
		
		//To click on Register link
		driver.findElement(By.partialLinkText("Regi")).click();
		Thread.sleep(3000);
		
		//To click on Book link
		driver.findElement(By.partialLinkText("BOO")).click();
		Thread.sleep(3000);
		
		//To Close the Browser
		driver.quit();
	}

}
//Using Partial Link Doing this Program..