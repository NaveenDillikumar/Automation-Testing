package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginInstagram {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to webpage
		driver.get("https://Instagram.com");
		Thread.sleep(3000);
		
		//To Login the Instagram id click on login username
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("mr_awesome_dreamer_01_");
		Thread.sleep(3000);
		
		//To Click and Password and Enter the Password
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("Mr_black_demon_220");
		Thread.sleep(3000);
		
		//To Click on Login Button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		
		//To Click on Notnow button
		driver.findElement(By.xpath("//div[@role='button']")).click();
		Thread.sleep(5000);
		
		//To Click on Not Now Notification button
		driver.findElement(By.xpath("//button[.='Not Now']")).click();
		Thread.sleep(5000);
		
		
		//To Click on Message link
		driver.findElement(By.xpath("//a[@aria-label='Direct messaging - 0 new notifications link']")).click();
		Thread.sleep(5000);
		
		//To click send Messages
		driver.findElement(By.xpath("//div[.='Send message']//div")).click();
		Thread.sleep(5000);
		
		//To search on messages
		driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("mr_awesome_dreamer_01_");
		Thread.sleep(5000);
		
		//To Click on toggle button
		driver.findElement(By.xpath("(//input[@aria-label='Toggle selection'])[1]")).click();
		Thread.sleep(5000);
		
		//To Click on Chat Button
		driver.findElement(By.xpath("(//div[.='Chat'])[1]")).click();
		Thread.sleep(3000);
		
		//TO send Message 
		driver.findElement(By.xpath("//div[@aria-label='Message']")).sendKeys("Hi..How Are You Dude");
		Thread.sleep(5000);
		
		// To Click on Send Button
		driver.findElement(By.xpath("//div[.='Send']")).click();
		Thread.sleep(5000);
		
		//To Click on My Profile Picture
		driver.findElement(By.xpath("//span[@tabindex='-1']")).click();
		Thread.sleep(5000);
		
		//To Click on Settings button
		driver.findElement(By.xpath("//div[@class='x6s0dn4 x78zum5 xdt5ytf xl56j7k']")).click();
		Thread.sleep(5000);
		
		//To Click on logOut Button
		driver.findElement(By.xpath("//button[.='Log Out']")).click();
		Thread.sleep(6000);
		
		//To Close the Browser
		driver.quit();
		
	}
}
