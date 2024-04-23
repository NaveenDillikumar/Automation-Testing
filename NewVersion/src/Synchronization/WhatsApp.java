package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhatsApp {
 
	public static void main(String[] args) throws InterruptedException {
		
		//launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//navigate to web page
		driver.get("https://web.whatsapp.com");
		
		//To Give Implicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		//To search text field
		driver.findElement(By.cssSelector("[title='Search input textbox']")).sendKeys("Siva Pnxff");
		Thread.sleep(3000);
		
		//To Click on Contacts
		driver.findElement(By.xpath("//span[@title='Siva Pnxff']")).click();
		Thread.sleep(2000);
		
		while(true) {
			driver.findElement(By.xpath("//div[@title='Type a message']")).sendKeys("Noobae Salla",Keys.ENTER);
		}
	}
}
