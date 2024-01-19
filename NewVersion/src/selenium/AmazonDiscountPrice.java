package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDiscountPrice {

	public static void main(String[] args)throws Exception {
		
		//To Launch The Browser
		WebDriver driver=new ChromeDriver();
		
		//To Maximize the Browser
		driver.manage().window().maximize();
		
		//To Navigate to Browser
		driver.get("https://www.amazon.in");
		
		Thread.sleep(3000);
		//To Click On Search Button
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Whey Protien Powder");
		
		Thread.sleep(3000);
		//To Click on Search Button
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		Thread.sleep(3000);
		//To Click On Product
		driver.findElement(By.cssSelector(".a-size-base-plus")).click();
		
	}

}
