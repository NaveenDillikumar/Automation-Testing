package ActionsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TabActionsAss4 {
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
		
		//To Click on Tab Link
		driver.findElement(By.partialLinkText("Tab")).click();
		Thread.sleep(3000);
		
		//To Find the Mens Links
		WebElement menslink = driver.findElement(By.xpath("//li[@class='Men p-4 relative']"));
		Thread.sleep(3000);
		
		//To create the actions object
		Actions action=new Actions(driver);
		action.moveToElement(menslink).perform();
		Thread.sleep(2000);
		
		//To find the Mens Bottom Top Wear
		WebElement menstopwear = driver.findElement(By.className("Men_1"));
		Thread.sleep(1000);
		action.moveToElement(menstopwear).perform();
		Thread.sleep(2000);
		
		
		//To Find the Mens t shirt link
		WebElement menstshirt = driver.findElement(By.className("Men_2"));
		Thread.sleep(2000);
		action.moveToElement(menstshirt).perform();
		Thread.sleep(2000);
		
		
		//To click on 80% discount
		WebElement discountlink = driver.findElement(By.xpath("//section[@class='Men_List_2']//li[.='70% or more']"));
		Thread.sleep(2000);
		action.moveToElement(discountlink).click().perform();
		Thread.sleep(4000);
		
		//To close the Browser
		driver.quit();
		
}
}