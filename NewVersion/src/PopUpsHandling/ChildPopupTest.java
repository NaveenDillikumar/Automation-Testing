package PopUpsHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildPopupTest {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver =new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Navigate to web page
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(25000);
		
		//To Create Actions Object
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.id("men"))).perform();
		Thread.sleep(3000);
		
		//To Click on Shirts Link
		driver.findElement(By.linkText("SHIRTS")).click();
		Thread.sleep(3000);
		
		//To Move the Mouse to Mens shirts
		action.moveToElement(driver.findElement(By.linkText("Men Shirt"))).perform();
		Thread.sleep(3000);
		
		//TO Click on shirt
		driver.findElement(By.cssSelector("[alt='Men Regular Fit Solid Cut Away Collar Casual Shirt']")).click();
		Thread.sleep(3000);
		
		//To Click on compare Button
		driver.findElement(By.id("compare")).click();
		Thread.sleep(3000);
		
		//To Get the Address of current window
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		Thread.sleep(3000);
		
		//To Get the All window adress
		Set<String> Allwindows = driver.getWindowHandles();
		System.out.println("Total Size of Windows"+Allwindows.size());
		for (String Windows : Allwindows) {
			driver.switchTo().window(Windows);
			String url = driver.getCurrentUrl();
			
			//To Move to Flipkart window
			if(url.contains("flipkart")) {
				break;
			}
		}
		//To Maximize the Flipkart browser
		driver.manage().window().maximize();
		
		//To Click on Mobiles
		driver.findElement(By.xpath("//span//span[.='Mobiles']")).click();
		Thread.sleep(3000);
		
		//To Close the Flikart Browser
		driver.close();
		
		//To Switch to Parent window
		driver.switchTo().window(parentWindow);
		Thread.sleep(3000);
		
		//To click on amzon window
		for (String amazon : Allwindows) {
			driver.switchTo().window(amazon);
			String amazonurl = driver.getCurrentUrl();
			
			//To Move to Amazon Window
			if(amazonurl.contains("amazon")) {
				break;
			}
		}
		
		//To Maximize the amzon Browser
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//To close the Amazon browser
		driver.close();
		
		//To Switch to parent window
		driver.switchTo().window(parentWindow);
		Thread.sleep(3000);
		
		//To ebay Child window
		for (String ebay : Allwindows) {
			driver.switchTo().window(ebay);
			String ebayurl = driver.getCurrentUrl();
			
			//To move to ebay window
			if(ebayurl.contains("ebay")) {
				break;
			}
		}
		
		//To maximize the webpage
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//To close the ebay webpage
		driver.close();
		
		//parent window
		driver.switchTo().window(parentWindow);
		Thread.sleep(3000);
		
		//To close the browser
		driver.quit();
		
	}
}
