package ActionsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Imagemouseoverass3 {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Navigate to Webpage
		driver.get("https://demoapps.qspiders.com");
		Thread.sleep(3000);
		
		//To Click on UI testing Link
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		
		//To Click on Mouse Action
		driver.findElement(By.xpath("//section[.='Mouse Actions']")).click();
		Thread.sleep(3000);
		
		//To Click on Mouse Hover
		driver.findElement(By.xpath("//section[.='Mouse Hover']")).click();
		Thread.sleep(3000);
		
		//To Find the Image Link
		driver.findElement(By.partialLinkText("Image")).click();
		Thread.sleep(3000);
		
		//To find the Image on link
		WebElement imagelink = driver.findElement(By.xpath("//img[@title='Order Placed Image']"));
		Thread.sleep(3000);
		
		//To Create Actions Class
		Actions action=new Actions(driver);
		action.moveToElement(imagelink).perform();
		Thread.sleep(3000);
		
		//To Close the browser
		driver.quit();
		
	}
}
