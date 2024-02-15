package LocatorsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Broswer
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Navigate to url
		driver.get("https://www.Amazon.in/");
		Thread.sleep(3000);
		
		//To search the mobiles
		driver.findElement(By.className("nav-input")).sendKeys("Mobiles");
		
		//To Click on Search Button
		driver.findElement(By.className("nav-progressive-attribute")).click();
	}

}
