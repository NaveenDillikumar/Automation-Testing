package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitTest {

		public static void main(String[] args) throws InterruptedException {
			
			//launch the browser
			WebDriver driver=new ChromeDriver();
			
			//Maximize the browszer
			driver.manage().window().maximize();
			
			//Implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			
			//Navigate to web page
			driver.get("https://www.shoppersstack.com/");
			
			//To click on men
			driver.findElement(By.xpath("//a[.='Men']"));
			
			//To Levis t-Shrits
			driver.findElement(By.xpath("//span[.='Levis Mens Regular Fit Tee']")).click();
			Thread.sleep(500);
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Add To Cart"))));
			
			//To Click on add to Cart
			driver.findElement(By.name("Add To Cart")).click();
			
			
			
			
		}
}
