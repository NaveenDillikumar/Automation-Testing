package ActionsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseactionsAss1 {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Navigate to Webpage
		driver.get("https://demoapps.qspiders.com");
		Thread.sleep(3000);
		
		//To Click on UI testing Link
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		
		//To Click on Mouse Actions
		driver.findElement(By.xpath("//section[.='Mouse Actions']")).click();
		Thread.sleep(3000);
		
		//To click on Mouse Hover
		driver.findElement(By.xpath("//section[.='Mouse Hover']")).click();
		Thread.sleep(3000);
		
		//To Find the i Element
		WebElement ilink = driver.findElement(By.className("w-5"));
		Thread.sleep(3000);
		
		//To Create Actions class
		Actions action=new Actions(driver);
		action.moveToElement(ilink).perform();
		Thread.sleep(3000);
		
		//To Fill the Password Textfield
		driver.findElement(By.className("p-2")).sendKeys("N");
		Thread.sleep(2000);
		
		driver.findElement(By.className("p-2")).sendKeys("01");
		Thread.sleep(3000);
		
		driver.findElement(By.className("p-2")).sendKeys("@");
		Thread.sleep(3000);
		
		driver.findElement(By.className("p-2")).sendKeys("0601");
		Thread.sleep(3000);
		
		//To Close the Browser
		driver.quit();
	}
}
