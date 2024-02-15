package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForwardBackward {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Navigate to Webpage
		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(3000);
		
		//To Click on Book Option
		driver.findElement(By.partialLinkText("BOO")).click();
		Thread.sleep(3000);
		
		//To Click on Pricelist
		driver.findElement(By.xpath("//a[.='Copy of Computing and Internet EX']/../..//span[@class='price actual-price']"));
		Thread.sleep(3000);
		
		//To Close the Browser
		driver.quit();
	}
}
