package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HubSpotLogin {

	public static void main(String[] args)throws Exception {
		
		//To Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//To Maximize the Web page
		driver.manage().window().maximize();
		
		//To Navigate to Webpage
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(3000);
		//To Fill the Email Address
		driver.findElement(By.cssSelector("#username")).sendKeys("naveendcraz31@gmail.com");
		
		Thread.sleep(3000);
		//To Fill the password
		driver.findElement(By.cssSelector("#password")).sendKeys("Naveen010601");
		
		Thread.sleep(3000);
		//To Click on Remember me
		driver.findElement(By.id("checkbox-content-4")).click();
		
		Thread.sleep(3000);
		//To Click on Login button
		driver.findElement(By.cssSelector("button[id='loginBtn']")).click();

	}

}
