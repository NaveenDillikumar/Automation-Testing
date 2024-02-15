package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youTube {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Webpage
		driver.manage().window().maximize();
		
		//Navigate to Url
		driver.get("https://Youtube.com");
		Thread.sleep(3000);
		
		//To click on Search Field
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("bhodai kanamey from oh manapenne");
		Thread.sleep(3000);
		
		//To Click on search Button
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(3000);
		
		//To click on Song
		driver.findElement(By.xpath("//h3//yt-formatted-string[.='Bodhai Kaname Video Song | Oh Manapenne | Anirudh | Shashaa | Harish Kalyan | Priya Bhavanishankar']")).click();
		Thread.sleep(3000);
		
		//To Click on Full Screen Button
		driver.findElement(By.xpath("//button[@title='Full screen (f)']")).click();
		Thread.sleep(50000);
		
		//To Close the browser
		driver.quit();
		
		
	}
}
