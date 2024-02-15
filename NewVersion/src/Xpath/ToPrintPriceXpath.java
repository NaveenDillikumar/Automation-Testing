package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPrintPriceXpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch  the Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Navigate to Webpage
		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(3000);
		
		//To Click on BOOks link
		driver.findElement(By.partialLinkText("BOO")).click();
		Thread.sleep(3000);
		
		//To Print Actual Book price
		String Actualprice=driver.findElement(By.xpath("//a[.='Fiction']/../..//span/following-sibling::span")).getText();
		Thread.sleep(3000);
		System.out.println(Actualprice);
		
		
		//To Print old Price of book
		String oldPrice=driver.findElement(By.xpath("//a[.='Fiction']/../..//span/following-sibling::span/preceding-sibling::span")).getText();
		Thread.sleep(3000);
		System.out.println(oldPrice);
		
		//To Validate the price
		if(Actualprice.equals("24.00")&&oldPrice.equals("35.00")) {
			System.out.println("Test case is passed");
		}else {
			System.out.println("Test Case is Fail");
	}
		
		//To close the Browser
		driver.quit();
	}

}
