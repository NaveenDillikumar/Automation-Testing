package JavaScriptExceutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToTest {
 public static void main(String[] args) throws InterruptedException {
	
	 //Launch the Browser
	 WebDriver driver=new ChromeDriver();
	 
	 //Maximize the Browser
	 driver.manage().window().maximize();
	 
	 //Navigate to webpage
	 driver.get("https://selenium.dev");
	 
	 //To Give implicit wait
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 //To Create Java Script executor object
	 JavascriptExecutor jse= (JavascriptExecutor) driver;
	 
	 jse.executeScript("window.scrollTo(0,200);");
	 Thread.sleep(2000);
	 jse.executeScript("window.scrollTo(0,400);");
	 Thread.sleep(2000);
	 jse.executeScript("window.scrollTo(0,600);");
	 Thread.sleep(2000);
	 jse.executeScript("window.scrollTo(0,800);");
	 
	 Thread.sleep(3000);
	 
	 
	 //To Close the Browser
	 driver.quit();
}
}
