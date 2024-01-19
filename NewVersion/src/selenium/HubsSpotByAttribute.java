package selenium;                                         //Using Attribute Selector

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HubsSpotByAttribute {

	public static void main(String[] args)throws Exception {

		//To Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//To Maximize the Browser
		driver.manage().window().maximize();
		
		//To Navigate to Browser
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(3000);
		//To Click on Email Box
		driver.findElement(By.cssSelector("[type='email']")).sendKeys("vipguysgethu@gmail.com");
		
		Thread.sleep(3000);
		//To Click on Password
		driver.findElement(By.cssSelector("input[aria-labelledby='UIFormControl-label-4']")).sendKeys("VipGuysGethu06");
		
		Thread.sleep(3000);
		//To Click on Remember me
		driver.findElement(By.id("checkbox-content-4")).click();
		
		Thread.sleep(3000);
		//To click on Login Button
		driver.findElement(By.cssSelector("button[id='loginBtn']")).click();
		
		Thread.sleep(3000);
		//To Quit the Browser
		driver.quit();

	}

}
