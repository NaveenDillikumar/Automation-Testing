package ActionsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclickbtn3ass {
public static void main(String[] args) throws InterruptedException {
	
	//Launch the Browser
	WebDriver driver=new ChromeDriver();
	
	//Maxmize the browser
	driver.manage().window().maximize();
	
	//Navigate to Webpage
	driver.get("https://demoapps.qspiders.com");
	Thread.sleep(3000);
	
	//To click on UI testing Link
	driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
	Thread.sleep(3000);
	
	//To Click on Buttons Link
	driver.findElement(By.xpath("//section[.='Button']")).click();
	Thread.sleep(3000);
	
	//To click on Right click Link
	driver.findElement(By.partialLinkText("Right Click")).click();
	Thread.sleep(3000);
	
	//To Click on Right click button 3
	WebElement rightclickbtn3 = driver.findElement(By.id("btn32"));
	Actions action=new Actions(driver);
	action.contextClick(rightclickbtn3).perform();
	Thread.sleep(3000);
	
	
	//To Click on ratings 3
	driver.findElement(By.xpath("(//button[@id='btn32']//div)[4]")).click();
	Thread.sleep(3000);
	
	//To Get the Text of after clicking 3
	String actualres = driver.findElement(By.xpath("//button[@id='btn32']/following-sibling::span")).getText();
	System.out.println(actualres);
	
	//To Get Excepted res
	String exceptedres="You selected \"3\"";
	Thread.sleep(3000);
	
	System.out.println("\n*******Test Result********\n");
	
	//To validate the test case
	if(actualres.equals(exceptedres)) {
		System.out.println(actualres);
		System.out.println(exceptedres);
		System.out.println("Test Case is Pass");
	}
	else {
		System.out.println(actualres);
		System.out.println(exceptedres);
		System.out.println("Test Case  is Fail");
	}
	
	action.contextClick(rightclickbtn3).perform();
	driver.findElement(By.xpath("(//button[@id='btn32']//div)[3]")).click();

	
	
	//To Close the Browser
	//driver.quit();
}
}
