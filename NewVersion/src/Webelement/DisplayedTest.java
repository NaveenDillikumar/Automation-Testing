package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayedTest {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the Browser
		driver.manage().window().maximize();
		
		//navigate to webpage
		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(3000);
		
		// Verify the desktop is present or not
		boolean isdesktopdisplayed = driver.findElement(By.xpath("//ul[@class='top-menu']//a[@href='/desktops']")).isDisplayed();
		
		System.out.println("Desktop is Displayed? :"+isdesktopdisplayed);
		
		if(isdesktopdisplayed==true) {
			
			System.out.println("Test Case is pass");
		}
		else {
			System.out.println("Test Case is fail");
		
		}
		
		//to Close the Browser
		driver.quit();
	}
}
