package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class AmazonScreenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		String Time = LocalDateTime.now().toString().replace("-", "_").replace(":", "_");
		
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//implicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to webpage
		driver.get("https://amazon.in");
		
		WebElement Product = driver.findElement(By.id("desktop-grid-2"));
		
		Actions action=new Actions(driver);
		action.scrollToElement(driver.findElement(By.linkText("Shop fashion"))).perform();
		
		File temp = Product.getScreenshotAs(OutputType.FILE);
		
		File permanent=new File("./ScreenShot/Productimage"+Time+".png");
		
		FileHandler.copy(temp, permanent);
		
		Thread.sleep(2000);
		
		//To Close the Browser
		driver.quit();
	} 
}
