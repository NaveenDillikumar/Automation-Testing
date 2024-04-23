package Synchronization;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//To Give ImpicitWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		//To Give Explicits wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		
		//To Navigate to webpage
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(2000);
		//To click on Login Button
		wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));
		driver.findElement(By.id("loginBtn")).click();
		
		//To click on Email
		driver.findElement(By.id("Email")).sendKeys("naveendcraz31@gmail.com");
		
		//To Click on password
		driver.findElement(By.id("Password")).sendKeys("Naveen@01");
		
		//To Click on Login Button
		driver.findElement(By.id("Login")).click();
			
		//To click on Mens link
		driver.findElement(By.xpath("//a[.='Men']")).click();
		
		//To Click on Levis Shirts
		driver.findElement(By.xpath("//span[.='levis']")).click();
		
		//To Click compare button
		driver.findElement(By.name("compare")).click();
		
		//To get the parent window Adress
		String ParentWindow = driver.getWindowHandle();
		
		//To Get the All window adress
		Set<String> Alladdress = driver.getWindowHandles();
		System.out.println("Total Number Of Windows Prsent :"+Alladdress.size());
		for (String Windows : Alladdress) {
			wait.until(ExpectedConditions.numberOfWindowsToBe(4));
			driver.switchTo().window(Windows);
			String url = driver.getCurrentUrl();
			
			//To Move To Filpkart url
			if(url.contains("Flipkart")) {
				break;
			}			
		}
		//To maximize the Webpage
		driver.manage().window().maximize();
		
		//To Close the browser
		driver.close();
		
		//To switch to Parent Window
		driver.switchTo().window(ParentWindow);
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		
		//To click on amazon Window
		for (String amazon : Alladdress) {
			wait.until(ExpectedConditions.numberOfWindowsToBe(3));
			driver.switchTo().window(amazon);
			String amazonurl = driver.getCurrentUrl();
			
			//To Move to Amazon Window
			if(amazonurl.contains("amazon")) {
				break;
			}
		}
		//To Maximize the Webpage
		driver.manage().window().maximize();
		
		//To Close the Browser
		driver.close();
		
		//To Switch to parent window
		driver.switchTo().window(ParentWindow);
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		//To switch to Ebay Child Window
		for (String window : Alladdress) {
			wait.until(ExpectedConditions.numberOfWindowsToBe(2));
			driver.switchTo().window(window);
			String Ebayurl = driver.getCurrentUrl();
			
			//To Move to Ebay Window
			if(Ebayurl.contains("ebay")) {
				
				break;
			}
		}
		
		//To maximize the window
		driver.manage().window().maximize();
		
		//To Close the Browser
		driver.close();
		
		//Switch to parent Window
		wait.until(ExpectedConditions.numberOfWindowsToBe(1));
		driver.switchTo().window(ParentWindow);
		
		//To Close the Browser
		driver.quit();
		
	}
}
