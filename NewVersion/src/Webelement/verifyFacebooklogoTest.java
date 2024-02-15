package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyFacebooklogoTest {
	public static void main(String[] args) throws InterruptedException {
	
		//Launch the bowser
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//naviagate to webpage
		driver.get("https://facebook.com");
		Thread.sleep(3000);
		
		//Verify the logo is displayed
		boolean islogodisplayed = driver.findElement(By.className("fb_logo")).isDisplayed();
		
		System.out.println("facebook Logo is diplayed? :"+islogodisplayed);
		
		if(islogodisplayed==true) {
			System.out.println("Test Case is Passed");
		}
		else {
			System.out.println("Test Case Is fail");
		}
		
		
		//To Close the browser
		driver.quit();
	}
}
