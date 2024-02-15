package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableTest {
	public static void main(String[] args) throws InterruptedException {
		
		///Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the Browser
		driver.manage().window().maximize();
		
		//Navigate to webpage
		driver.get("https://demoapps.qspiders.com");
		Thread.sleep(3000);
		
		//to Click on UI testing concepts
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		
		//TO click on checkbox
		driver.findElement(By.xpath("//section[.='Check Box']")).click();
		Thread.sleep(3000);
		
		//To verify the check box is enabled 
		boolean ismailcheckboxenabled = driver.findElement(By.id("domain1")).isEnabled();
		System.out.println("Is the Mail Check Box is Enabled? :"+ismailcheckboxenabled);
		Thread.sleep(3000);
		
		//To verify the Check box is Selected
		boolean ismailcheckboxselected = driver.findElement(By.id("domain1")).isSelected();
		System.out.println("Is Mail Checkbox Is Selected? :"+ismailcheckboxselected);
		Thread.sleep(3000);
		
		//To click on CheckBox After clicked
		System.out.println("\nAfter the Mail CheckBox Is Clicked\"n");
		driver.findElement(By.id("domain1")).click();
		Thread.sleep(2000);
		ismailcheckboxselected=driver.findElement(By.id("domain1")).isSelected();
		System.out.println("Is the Mail checkbox is Selected? :"+ismailcheckboxselected);
		Thread.sleep(3000);
		
		//After the Clicking disabled
		System.out.println("\nAfter Clicking Disable Link\n");
		driver.findElement(By.partialLinkText("Disabled")).click();
		Thread.sleep(2000);
		ismailcheckboxenabled=driver.findElement(By.id("domain1")).isEnabled();
		System.out.println("Is the Mail Check box is Enabled? :"+ismailcheckboxenabled);
		Thread.sleep(2000);
		
		//To Close the Browser
		driver.quit();
	}
}
