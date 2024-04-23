package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesTest {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver =new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Navigate to Webpage
		driver.get("https://demoapps.qspiders.com");
		Thread.sleep(3000);
		
		//To Click on Ui testing Concepts
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		
		//To Click on Frames
		driver.findElement(By.xpath("//section[.='Frames']")).click();
		Thread.sleep(3000);
		
		//To Click on I frames
		driver.findElement(By.xpath("//section[.='iframes']")).click();
		Thread.sleep(3000);
		
		//Swtich to I frames
		driver.switchTo().frame(0);
		
		//To Fill username
		driver.findElement(By.id("username")).sendKeys("Naveen");
		Thread.sleep(3000);
		
		//TO Fill Password
		driver.findElement(By.id("password")).sendKeys("naveen123");
		Thread.sleep(3000);
		
		//To Click on Login button
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(3000);
		
		//Sitch to Parent Frame
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		
		//To Click on Multiple frames
		driver.findElement(By.partialLinkText("Multiple iframe")).click();
		Thread.sleep(3000);
		
		//To Switch to Multiple frames
		driver.switchTo().frame(0);
		
		//To Click on Signup
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		Thread.sleep(3000);
		
		//To Click on password
		driver.findElement(By.id("password")).sendKeys("Admin@1234");
		Thread.sleep(3000);
		
		//To Click on Confrim Password
		driver.findElement(By.id("confirm-password")).sendKeys("Admin@1234");
		Thread.sleep(3000);
		
		//To click on Sign up button
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(3000);
		
		
		//Switch to parent Frame
		driver.switchTo().parentFrame();
		
		//Switch To 2nd frame
		driver.switchTo().frame(1);
		Thread.sleep(3000);
		
		
		//To Click Username
		driver.findElement(By.id("username")).sendKeys("SuperAdmin@gmail.com");
		Thread.sleep(3000);
		
		//To Click on Passsword
		driver.findElement(By.id("password")).sendKeys("SuperAdmin@1234");
		Thread.sleep(3000);
		
		//To Click on login button
		driver.findElement(By.id("submitButton")).submit();
		Thread.sleep(3000);
		
		driver.switchTo().parentFrame();
		
		//To Close the Browser
		driver.quit();
	}
}
