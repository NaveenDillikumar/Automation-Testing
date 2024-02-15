package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathGroupIndex {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Navigate to Url
		driver.get("https://demowebshop.tricentis.com/books");
		Thread.sleep(3000);
		
		//To find Rate of Book
		driver.findElement(By.xpath("(//span)[31]")).click();
		Thread.sleep(3000);
		
		//To close the Browser
		driver.quit();
		
		
		//Grouping index
	}
}
