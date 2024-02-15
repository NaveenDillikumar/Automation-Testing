package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrgiUrgi {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver  driver=new ChromeDriver();
		
		//Maximize the Webpage
		driver.manage().window().maximize();
		
		//Navigate to webpage
		driver.get("https://Youtube.com");
		Thread.sleep(3000);
		
		//To Search the Song
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Urgi urgi");
		Thread.sleep(3000);
		
		//To Click on Search Button
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(3000);
		
		//To Click on the Song
		driver.findElement(By.xpath("//yt-formatted-string[.='Urugi Urugi - Video Song | Joe | Rio Raj | Hariharan Ram.S | Siddhu Kumar | Dr.D.Arulanandhu'][1]")).click();
		
		//To Click on full Screen
		driver.findElement(By.xpath("//button[@class='ytp-fullscreen-button ytp-button'][1]")).click();
		Thread.sleep(30000);
		
		//To Close the Browser
		driver.quit();
	}
}
