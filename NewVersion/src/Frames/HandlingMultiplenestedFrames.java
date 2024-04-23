package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultiplenestedFrames {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to Webpage
		driver.get("https://demoapps.qspiders.com");
		Thread.sleep(3000);
		
		//To Click on UI Testing Concepts
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		
		//To click on Frames link
		driver.findElement(By.xpath("//section[.='Frames']")).click();
		Thread.sleep(3000);
		
		//To click on I frames link
		driver.findElement(By.xpath("//section[.='iframes']")).click();
		Thread.sleep(3000);
		
		//To click on Nested Multiple Frames
		driver.findElement(By.partialLinkText("Nested with Multiple iframe")).click();
		Thread.sleep(3000);
		
		//To switch to frames
		driver.switchTo().frame(0);
		
		//To Get the Text of Email
		String email = driver.findElement(By.xpath("(//p[@class='para'])[1]")).getText();
		System.out.println(email);
		Thread.sleep(3000);
		
		//To Get the Password
		String password = driver.findElement(By.xpath("(//p[@class='para'])[2]")).getText();
		System.out.println(password);
		Thread.sleep(3000);
		
		//To Get the Confirm password
		String confirmpassword = driver.findElement(By.xpath("(//p[@class='para'])[3]")).getText();
		System.out.println(confirmpassword);
		Thread.sleep(3000);
		
		//To Switch frames
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		
		//To Fill the Email
		driver.findElement(By.id("email")).sendKeys(email);
		Thread.sleep(3000);
		
		//Switch to default content
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		//To Switch to Frames
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		
		//To Fill the Password
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(3000);
		
		//To switch the Frame
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		
		//To Switch the Frames
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		driver.switchTo().frame(2);
		Thread.sleep(1000);
		
		
		//To Fill the Confirm Password
		driver.findElement(By.id("confirm")).sendKeys(confirmpassword);
		Thread.sleep(3000);
		
		//To switch default content
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		//To switch the frames
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		driver.switchTo().frame(3);
		Thread.sleep(2000);
		
		
		//To Click on submit button
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(2000);
		
		//switch to default content
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		//To Close the browser
		driver.quit();
	}
}
