package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestedframes {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch The browser
		WebDriver driver=  new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Navigate to webpage
		driver.get("https://demoapps.qspiders.com");
		Thread.sleep(3000);
		
		//To Click on UI testing Concepts
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		
		//To Click on Frames Link
		driver.findElement(By.xpath("//section[.='Frames']")).click();
		Thread.sleep(3000);
		
		
		//To Click on I frames
		driver.findElement(By.xpath("//section[.='iframes']")).click();
		Thread.sleep(3000);
		
		//To Click on Nested If
		driver.findElement(By.partialLinkText("Nested iframe")).click();
		Thread.sleep(3000);
		
		//To Switch frames
		driver.switchTo().frame(0);
		
		//To Get the text of email id
		String Email = driver.findElement(By.xpath("(//p[@class='para'])[1]")).getText();
		System.out.println(Email);
		Thread.sleep(3000);
		
		
		//To Get the password
		String password = driver.findElement(By.xpath("(//p[@class='para'])[2]")).getText();
		System.out.println(password);
		Thread.sleep(3000);
		
		//To Get the confirm password
		String confirmpassword = driver.findElement(By.xpath("(//p[@class='para'])[3]")).getText();
		System.out.println(confirmpassword);
		Thread.sleep(3000);
		
		//To switch to parent Frame
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		
		//To switch to Second frame
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		
		//To Click on Email
		driver.findElement(By.name("email")).sendKeys(Email);
		Thread.sleep(3000);
		
		//To click on password
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(3000);
		
		//To Click on Confirm password
		driver.findElement(By.name("confirmPassword")).sendKeys(confirmpassword);
		Thread.sleep(3000);
		
		//To click on sign up button
		driver.findElement(By.id("submitButton")).submit();
		Thread.sleep(3000);
		
		//To switch to parent window
		driver.switchTo().parentFrame();
		
		//TO close the Browser
		driver.quit();
	}
}
