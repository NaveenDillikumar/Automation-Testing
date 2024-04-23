package ActionsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleclickAssign {
	public static void main(String[] args) throws InterruptedException {
		
	//Launch the browser
	WebDriver driver=new ChromeDriver();
	
	//Maximize the browser
	driver.manage().window().maximize();
	
	//Navigate to web page  
	driver.get("https://demoapps.qspiders.com");
	Thread.sleep(3000);
	
	//To Click on UI testing Link
	driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
	Thread.sleep(3000);
	
	//To Click on Button Link
	driver.findElement(By.xpath("//section[.='Button']")).click();
	Thread.sleep(3000);
	
	//To Click on Double Click link
	driver.findElement(By.partialLinkText("Double Click")).click();
	Thread.sleep(3000);
	
	//To Click on Button 1
	WebElement doubleclickbtn1 = driver.findElement(By.id("btn20"));
	Thread.sleep(2000);
	
	//To Create the Action Object
	Actions action=new Actions(driver);
	action.doubleClick(doubleclickbtn1).perform();
	Thread.sleep(3000);
	
	//To Get the text after clicking the button
	String actualres1 = driver.findElement(By.xpath("//button[@id='btn20']/following-sibling::span")).getText();
	Thread.sleep(3000);
	
	//To Click on  Button 2
	WebElement doubleclickbtn2 = driver.findElement(By.id("btn22"));
	action.doubleClick(doubleclickbtn2).perform();
	Thread.sleep(3000);
	
	///To Get the text after clicking the button
	String actualres2 = driver.findElement(By.xpath("//button[@id='btn22']/following-sibling::span")).getText();
	Thread.sleep(3000);
	
	//The Excepted Result
	String Exceptedres="You selected \"Yes\"";
	Thread.sleep(2000);
	
	//To Validate the Test Case
	System.out.println("\n******Test Result******\n");
	if(actualres1.equals(Exceptedres)&& actualres2.equals(Exceptedres)) {
		System.out.println(actualres1);
		System.out.println(actualres2);
		System.out.println("Test case is Pass");
		
	}
	else {
		System.out.println(actualres1);
		System.out.println(actualres2);
		System.out.println("Test case is Fail");
	}
		
	//To Close the Browser
	driver.quit();
	
	
	}
}
