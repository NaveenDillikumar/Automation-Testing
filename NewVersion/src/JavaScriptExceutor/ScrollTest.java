package JavaScriptExceutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTest {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Navigate to Webpage
		driver.get("https://selenium.dev");
		
		//To give implicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//To create the java script executor
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		
		jse.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-1000);");
		Thread.sleep(2000);
		
		//To Close the Browser
		driver.quit();
	}
}
