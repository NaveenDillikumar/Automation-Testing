package ActionsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickTest {
public static void main(String[] args) throws InterruptedException {
	
	//Launch the Browser
	WebDriver driver=new ChromeDriver();
	
	//Maximize the browser
	driver.manage().window().maximize();
	
	//Navigate to webpage
	driver.get("https://demoapps.qspiders.com");
	Thread.sleep(3000);
	
	//To Click on UI Testing Link
	driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
	Thread.sleep(3000);
	
	//To Click on buttons
	driver.findElement(By.xpath("//section[.='Button']")).click();
	Thread.sleep(3000);
	
	//To Click on Right Click link
	driver.findElement(By.partialLinkText("Right Click")).click();
	Thread.sleep(3000);
	
	//To Find the First Right Click Button
	WebElement rightclickbtn1 = driver.findElement(By.id("btn30"));
	Thread.sleep(3000);
	
	//To create the Action object
	Actions action=new Actions(driver);
	action.contextClick(rightclickbtn1).perform();
	Thread.sleep(3000);
	
	//To Click on Yes Button
	driver.findElement(By.xpath("//div[.='Yes']")).click();
	Thread.sleep(3000);
	
	//To Get the Text After clicking yes
	String actualres1 = driver.findElement(By.xpath("//button[@id='btn30']/following-sibling::span")).getText();
	String expectedres="You selected \"Yes\"";
	System.out.println(actualres1);
	
	//To find the second right click button
	WebElement rightclickbtn2 = driver.findElement(By.id("btn31"));
	Thread.sleep(3000);
	action.contextClick(rightclickbtn2).perform();
	Thread.sleep(2000);
	
	//To Click on Yes Button
	driver.findElement(By.xpath("//div[.='Yes']")).click();
	Thread.sleep(2000);
	
	
	//To get the text of After clicking yes 2
	String actualres2 = driver.findElement(By.xpath("//button[@id='btn31']/following-sibling::span")).getText();
	Thread.sleep(2000);
	System.out.println(actualres2);
	System.out.println();
	
	//To Validate the Text
	System.out.println("\n*********TEST RESULT*********\n");
	if(actualres1.equals(expectedres) &&actualres2.equals(expectedres)) {
		System.out.println("Test Case is Pass");
	}
	else {
		System.out.println("Test case Fail");
	}
	
	//To Close the Browser
	driver.quit();
}
}
