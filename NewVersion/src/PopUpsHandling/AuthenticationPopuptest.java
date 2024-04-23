package PopUpsHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopuptest {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Navigate to webpage
		driver.get("https://demoapps.qspiders.com");
		Thread.sleep(3000);
		
		//To Click on Ui testing concepts
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		
		//To Click on Popups
		driver.findElement(By.xpath("//section[.='Popups']")).click();
		Thread.sleep(3000);
		
		//To Click on autentication  link
		driver.findElement(By.xpath("//section[.='Authentication']")).click();
		Thread.sleep(3000);
		
		//To Click on Login Button
		driver.findElement(By.id("AuthLink")).click();
		Thread.sleep(3000);
		
		//To Get the Address of webpage
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		
		//To get the address
		Set<String> allwindows = driver.getWindowHandles();
		for (String autentication : allwindows) {
			driver.switchTo().window(autentication);
			String actualurl = driver.getCurrentUrl();
			System.out.println(actualurl);}
			
			//To Clear the Autentication url
			driver.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
			Thread.sleep(3000);
			
			//To Close the Browser
			driver.quit();
			
		
	}
}
